package com.eis.invoiceorchestrator.service;

import com.eis.invoiceorchestrator.CFDI;
import com.eis.invoiceorchestrator.utilities.PDFConstants;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.*;

@Service
public class PDFService extends PdfPageEventHelper {

    private static final int WIDTH_PERCENT_GENERIC_TABLE = 100;
    private static final int WIDTH_GENERIC_TABLE = 595;
    private static final float SPACING_AFTER_GENERIC_TABLE = 8F;
    private static final BaseColor COLOR_ROW = new BaseColor(234, 234, 233);
    private static final BaseColor WHITE_COLOR = new BaseColor(255, 255, 255);
    BaseColor ITEMS_HEADERS_LINES_COLOR = new BaseColor(217,130,64);
    BaseColor GRAY_COLOR = new BaseColor(97,97,100);
    private static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final String DATE_FORMAT = "yyyy-MM-dd";
    private final Font FONT_CELL_VALUE;
    private final Font FONT_ITEMS_HEADERS;
    private final Font FONT_GRAY_LABEL;
    private final Font FONT_DIGITAL_STAMPS;
    private final Font FONT_TOTAL_INVOICE;
    private final Font FONT_ITEM_DETAIL;
    private final Font FONT_INVOICE_TYPE;
    private final Font FONT_ISSUER_INFO;
    private final Font FONT_GRAND_TOTAL;
    private final NumberFormat NUMBER_FORMAT;
    private static final String FONT = "fonts/HalisR-ExtraLight.otf";
    private static final String FONT_BOLD = "fonts/HalisR-Bold.otf";
    private static final String FONT_REGULAR = "fonts/HalisR-Regular.otf";
    private static final String COLON = ": ";
    private static final String BLANK_SPACE = " ";
    private static final String ID_QR_PARAM = "id=";
    private static final String RFC_EMISOR_QR_PARAM = "&re=";
    private static final String RFC_RECEPTOR_QR_PARAM = "&rr=";
    private static final String TOTAL_QR_PARAM = "&tt=";
    private static final String SELLO_CFDI_QR_PARAM = "&fe=";

    public PDFService() throws DocumentException, IOException {

        FONT_CELL_VALUE = new Font(BaseFont.createFont(FONT, BaseFont.IDENTITY_H, BaseFont.EMBEDDED), 10, Font.BOLD, BaseColor.BLACK);
        NUMBER_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
        FONT_ITEMS_HEADERS = new Font(BaseFont.createFont(FONT_REGULAR, BaseFont.IDENTITY_H, BaseFont.EMBEDDED), 11, Font.NORMAL, ITEMS_HEADERS_LINES_COLOR);
        FONT_GRAY_LABEL = new Font(BaseFont.createFont(FONT, BaseFont.IDENTITY_H, BaseFont.EMBEDDED), 10, Font.BOLD,GRAY_COLOR );
        FONT_ITEM_DETAIL = new Font(BaseFont.createFont(FONT, BaseFont.IDENTITY_H, BaseFont.EMBEDDED), 8, Font.BOLD,GRAY_COLOR );
        FONT_TOTAL_INVOICE = new Font(BaseFont.createFont(FONT_REGULAR, BaseFont.IDENTITY_H, BaseFont.EMBEDDED), 14, Font.NORMAL, BaseColor.BLACK);
        FONT_INVOICE_TYPE = new Font(BaseFont.createFont(FONT, BaseFont.IDENTITY_H, BaseFont.EMBEDDED), 25, Font.BOLD, BaseColor.WHITE);
        FONT_ISSUER_INFO = new Font(BaseFont.createFont(FONT, BaseFont.IDENTITY_H, BaseFont.EMBEDDED), 8, Font.BOLD, BaseColor.WHITE);
        FONT_GRAND_TOTAL = new Font(BaseFont.createFont(FONT_REGULAR, BaseFont.IDENTITY_H, BaseFont.EMBEDDED), 11, Font.NORMAL, BaseColor.WHITE);
        FONT_DIGITAL_STAMPS = new Font(BaseFont.createFont(FONT, BaseFont.IDENTITY_H, BaseFont.EMBEDDED), 6, Font.BOLD,GRAY_COLOR );

    }

    public byte[] createPDFInvoice(CFDI cfdi) throws DocumentException {

        Document document = new Document(PageSize.A4, 0.0f, 0.0f, 0.0f, 36.0f);
        ByteArrayOutputStream pdf = new ByteArrayOutputStream();
        PdfWriter pdfWriter = PdfWriter.getInstance(document, pdf);
        document.open();
        addHeader(document, cfdi);
        addBody(document,cfdi);
        addFooter(document, cfdi.getComplemento().getTimbreFiscalDigital(),
                cfdi.getEmisor().getRfc(),cfdi.getReceptor().getRfc());
        document.close();
        pdfWriter.flush();


        return pdf.toByteArray();
    }

    private PdfPTable getReceiverTable(CFDI.Receptor receptor) throws DocumentException {

        PdfPTable receiverTable = getTable(1, new int[]{300}, 300, WIDTH_PERCENT_GENERIC_TABLE, SPACING_AFTER_GENERIC_TABLE);
        final float paddingLeft = 25f;
        final float paddingTop = 15f;

        PdfPCell receiverLabel = new PdfPCell(new Phrase(PDFConstants.INVOICE_RECEIVER,FONT_GRAY_LABEL));
        receiverLabel.setBorder(Rectangle.NO_BORDER);
        receiverLabel.setPaddingLeft(paddingLeft);
        receiverLabel.setPaddingBottom(10f);
        receiverLabel.setPaddingTop(paddingTop);

        PdfPCell receiverNameValue = new PdfPCell(new Phrase(receptor.getNombre()));
        receiverNameValue.setPaddingLeft(paddingLeft);
        receiverNameValue.setBorder(Rectangle.NO_BORDER);
        receiverNameValue.setPaddingBottom(10f);

        PdfPCell receiverRFCValue = new PdfPCell(new Phrase(receptor.getRfc(),FONT_GRAY_LABEL));
        receiverRFCValue.setPaddingLeft(paddingLeft);
        receiverRFCValue.setBorder(Rectangle.NO_BORDER);

        PdfPCell receiverPostalCodeValue = new PdfPCell(new Phrase(receptor.getResidenciaFiscal(),FONT_GRAY_LABEL));
        receiverPostalCodeValue.setPaddingLeft(paddingLeft);
        receiverPostalCodeValue.setBorder(Rectangle.NO_BORDER);

        PdfPCell receiverCFDIUseValue = new PdfPCell(new Phrase(receptor.getUsoCFDI(),FONT_GRAY_LABEL));
        receiverCFDIUseValue.setPaddingLeft(paddingLeft);
        receiverCFDIUseValue.setBorder(Rectangle.NO_BORDER);

        PdfPCell receiverRegimenValue = new PdfPCell(new Phrase(receptor.getRegimenFiscalReceptor(),FONT_GRAY_LABEL));
        receiverRegimenValue.setPaddingLeft(paddingLeft);
        receiverRegimenValue.setBorder(Rectangle.NO_BORDER);

        receiverTable.addCell(receiverLabel);
        receiverTable.addCell(receiverNameValue);
        receiverTable.addCell(receiverRFCValue);
        receiverTable.addCell(receiverPostalCodeValue);
        receiverTable.addCell(receiverCFDIUseValue);
        receiverTable.addCell(receiverRegimenValue);

        return receiverTable;

    }

    private PdfPTable getCertificationTableInfo(String folio, String serie, CFDI.Complemento.TimbreFiscalDigital timbreFiscalDigital,
                                                Date fechaEmision) throws DocumentException {

        PdfPTable certificationDetailTable = getTable(2, new int[]{100,195}, 295, WIDTH_PERCENT_GENERIC_TABLE, SPACING_AFTER_GENERIC_TABLE);
        final float paddingTop = 15f;
        PdfPCell folioSerieInvoiceLabel = new PdfPCell(new Phrase(PDFConstants.INVOICE_NUMBER.concat(COLON),FONT_GRAY_LABEL));
        folioSerieInvoiceLabel.setBorder(Rectangle.BOTTOM);
        folioSerieInvoiceLabel.setBorderColorBottom(ITEMS_HEADERS_LINES_COLOR);
        folioSerieInvoiceLabel.setBorderWidthBottom(2.5f);
        folioSerieInvoiceLabel.setPaddingBottom(10f);
        folioSerieInvoiceLabel.setHorizontalAlignment(Element.ALIGN_LEFT);
        folioSerieInvoiceLabel.setPaddingTop(paddingTop);

        PdfPCell folioSerieInvoiceValue = new PdfPCell(new Phrase(folio,FONT_TOTAL_INVOICE));
        folioSerieInvoiceValue.setBorder(Rectangle.BOTTOM);
        folioSerieInvoiceValue.setBorderColorBottom(ITEMS_HEADERS_LINES_COLOR);
        folioSerieInvoiceValue.setBorderWidthBottom(2.5f);
        folioSerieInvoiceValue.setPaddingBottom(10f);
        folioSerieInvoiceValue.setPaddingTop(paddingTop);


        PdfPCell invoiceCertificatinoDateLabel = new PdfPCell(new Phrase(PDFConstants.INVOICE_CERTIFICATION_DATE.concat(COLON)));
        invoiceCertificatinoDateLabel.setBorder(Rectangle.NO_BORDER);
        invoiceCertificatinoDateLabel.setHorizontalAlignment(Element.ALIGN_LEFT);
        invoiceCertificatinoDateLabel.setPaddingTop(15f);

        PdfPCell invoiceCertificatinoDateValue = new PdfPCell(new Phrase(
                Optional.ofNullable(timbreFiscalDigital.getFechaTimbrado())
                        .map(x -> x.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime()
                                .format(DateTimeFormatter.ofPattern(DATETIME_FORMAT)))
                        .orElse(Strings.EMPTY),FONT_GRAY_LABEL));
        invoiceCertificatinoDateValue.setBorder(Rectangle.NO_BORDER);
        invoiceCertificatinoDateValue.setPaddingTop(15f);


        PdfPCell invoiceUUIDLabel = new PdfPCell(new Phrase(PDFConstants.INVOICE_UUID.concat(COLON)));
        invoiceUUIDLabel.setBorder(Rectangle.NO_BORDER);
        invoiceUUIDLabel.setHorizontalAlignment(Element.ALIGN_LEFT);

        PdfPCell invoiceUUIDValue = new PdfPCell(new Phrase(timbreFiscalDigital.getUuid(),FONT_GRAY_LABEL));
        invoiceUUIDValue.setBorder(Rectangle.NO_BORDER);

        PdfPCell invoiceDateLabel = new PdfPCell(new Phrase(PDFConstants.INVOICE_DATE.concat(COLON)));
        invoiceDateLabel.setBorder(Rectangle.NO_BORDER);
        invoiceDateLabel.setHorizontalAlignment(Element.ALIGN_LEFT);


        PdfPCell invoiceDateValue = new PdfPCell(new Phrase(
                Optional.ofNullable(fechaEmision)
                        .map(x -> x.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime()
                                .format(DateTimeFormatter.ofPattern(DATE_FORMAT)))
                        .orElse(Strings.EMPTY),FONT_GRAY_LABEL));
        invoiceDateValue.setBorder(Rectangle.NO_BORDER);

        certificationDetailTable.addCell(folioSerieInvoiceLabel);
        certificationDetailTable.addCell(folioSerieInvoiceValue);
        certificationDetailTable.addCell(invoiceCertificatinoDateLabel);
        certificationDetailTable.addCell(invoiceCertificatinoDateValue);
        certificationDetailTable.addCell(invoiceUUIDLabel);
        certificationDetailTable.addCell(invoiceUUIDValue);
        certificationDetailTable.addCell(invoiceDateLabel);
        certificationDetailTable.addCell(invoiceDateValue);

        return  certificationDetailTable;
    }

    private PdfPCell getTaxCell(String impuesto, BigDecimal tasaOCuota, BigDecimal base, BigDecimal importe,
                                String factor,BaseColor backgroundColor){

        String taxString = String.format("%s %s %s %s %s %s %s %s %s %s",PDFConstants.TAX_KEY.concat(COLON),impuesto,
                PDFConstants.TAX_RATE.concat(COLON), tasaOCuota.toPlainString(),PDFConstants.TAX_BASE.concat(COLON)
                ,base.toPlainString(),PDFConstants.TAX_AMOUNT.concat(COLON),importe.toPlainString()
                ,PDFConstants.TAX_FACTOR.concat(COLON),factor);
        PdfPCell taxCell = getCell(taxString,FONT_ITEM_DETAIL);
        taxCell.setBackgroundColor(backgroundColor);
        taxCell.setPaddingLeft(20f);
        taxCell.setColspan(4);
        return taxCell;
    }

    private PdfPTable getItemsTable(List<CFDI.Conceptos.Concepto> items) throws DocumentException {

        PdfPTable itemsTable = getTable(5, new int[]{305,65,80,75,70}, WIDTH_GENERIC_TABLE, WIDTH_PERCENT_GENERIC_TABLE, SPACING_AFTER_GENERIC_TABLE);
        final float headersPaddingTop = 10f;
        final float headersPaddingBottom = 15f;
        itemsTable.getDefaultCell().setPadding(0f);

        PdfPCell itemQuantity = new PdfPCell(new Phrase(PDFConstants.ITEM_QUANTITY,FONT_ITEMS_HEADERS));
        itemQuantity.setBorder(Rectangle.NO_BORDER);
        itemQuantity.setHorizontalAlignment(Element.ALIGN_CENTER);
        itemQuantity.setPaddingTop(headersPaddingTop);
        itemQuantity.setPaddingBottom(headersPaddingBottom);

        PdfPCell itemDescription = new PdfPCell(new Phrase(PDFConstants.ITEM_DESCRIPTION,FONT_ITEMS_HEADERS));
        itemDescription.setBorder(Rectangle.NO_BORDER);
        itemDescription.setHorizontalAlignment(Element.ALIGN_LEFT);
        itemDescription.setPaddingTop(headersPaddingTop);
        itemDescription.setPaddingLeft(20f);
        itemDescription.setPaddingBottom(headersPaddingBottom);

        PdfPCell discount = new PdfPCell(new Phrase(PDFConstants.ITEM_DISCOUNT,FONT_ITEMS_HEADERS));
        discount.setBorder(Rectangle.NO_BORDER);
        discount.setHorizontalAlignment(Element.ALIGN_CENTER);
        discount.setPaddingTop(headersPaddingTop);
        discount.setPaddingBottom(headersPaddingBottom);

        PdfPCell itemUnitPrice = new PdfPCell(new Phrase(PDFConstants.ITEM_UNIT_PRICE,FONT_ITEMS_HEADERS));
        itemUnitPrice.setBorder(Rectangle.NO_BORDER);
        itemUnitPrice.setHorizontalAlignment(Element.ALIGN_CENTER);
        itemUnitPrice.setPaddingTop(headersPaddingTop);
        itemUnitPrice.setPaddingBottom(headersPaddingBottom);

        PdfPCell itemTotal = new PdfPCell(new Phrase(PDFConstants.ITEM_TOTAL,FONT_ITEMS_HEADERS));
        itemTotal.setBorder(Rectangle.NO_BORDER);
        itemTotal.setHorizontalAlignment(Element.ALIGN_CENTER);
        itemTotal.setPaddingTop(headersPaddingTop);
        itemTotal.setPaddingBottom(headersPaddingBottom);

        itemsTable.addCell(itemDescription);
        itemsTable.addCell(itemQuantity);
        itemsTable.addCell(itemUnitPrice);
        itemsTable.addCell(discount);
        itemsTable.addCell(itemTotal);
        int numberLineCount = 0;
        final float fixedHeight = 45f;

        for (CFDI.Conceptos.Concepto conceptoDTO: items){

            ++numberLineCount;
            PdfPTable itemDetailTable = getTable(4,new int[]{90,80,60,75},305f,WIDTH_PERCENT_GENERIC_TABLE,0f);
            itemDetailTable.setKeepTogether(true);
            PdfPCell descriptionCell = getCell(conceptoDTO.getDescripcion(),null);
            descriptionCell.setBorder(Rectangle.NO_BORDER);
            descriptionCell.setHorizontalAlignment(Element.ALIGN_LEFT);
            BaseColor backgroundColor = numberLineCount % 2 == 0 ? WHITE_COLOR : COLOR_ROW;
            descriptionCell.setBackgroundColor(backgroundColor);
            descriptionCell.setPaddingLeft(20f);
            descriptionCell.setColspan(4);
            itemDetailTable.addCell(descriptionCell);

            PdfPCell objImpuestoCell = getCell(PDFConstants.ITEM_TAX_APPLY_TYPE.concat(COLON).concat(conceptoDTO.getObjetoImp()),FONT_ITEM_DETAIL);
            objImpuestoCell.setBackgroundColor(backgroundColor);
            objImpuestoCell.setPaddingLeft(20f);
            itemDetailTable.addCell(objImpuestoCell);
            PdfPCell unitKeyCell = getCell(PDFConstants.ITEM_UNIT.concat(COLON).concat(conceptoDTO.getClaveUnidad())
                    .concat(BLANK_SPACE).concat(Optional.ofNullable(conceptoDTO.getUnidad()).orElse(Strings.EMPTY)),FONT_ITEM_DETAIL);
            unitKeyCell.setBackgroundColor(backgroundColor);
            itemDetailTable.addCell(unitKeyCell);
            PdfPCell idItemCell = getCell(PDFConstants.ITEM_ID.concat(COLON).concat(Optional.ofNullable(conceptoDTO.getNoIdentificacion()).orElse(Strings.EMPTY)),FONT_ITEM_DETAIL);
            idItemCell.setBackgroundColor(backgroundColor);
            itemDetailTable.addCell(idItemCell);
            PdfPCell itemKeyCell = getCell(PDFConstants.ITEM_KEY.concat(COLON).concat(conceptoDTO.getClaveProdServ()),FONT_ITEM_DETAIL);
            itemKeyCell.setBackgroundColor(backgroundColor);
            itemDetailTable.addCell(itemKeyCell);

            if(conceptoDTO.getImpuestos()!=null && (conceptoDTO.getImpuestos().getRetenciones()!=null
                    || conceptoDTO.getImpuestos().getTraslados()!=null)){

                if(conceptoDTO.getImpuestos().getTraslados().getTraslado()!=null){

                    for (CFDI.Conceptos.Concepto.Impuestos.Traslados.Traslado trasladoDTO:
                            conceptoDTO.getImpuestos().getTraslados().getTraslado()) {

                        itemDetailTable.addCell(getTaxCell(trasladoDTO.getImpuesto(), trasladoDTO.getTasaOCuota(),
                                trasladoDTO.getBase(),trasladoDTO.getImporte(),trasladoDTO.getTipoFactor(),backgroundColor));
                    }
                }

                if(conceptoDTO.getImpuestos().getRetenciones().getRetencion()!=null){

                    for (CFDI.Conceptos.Concepto.Impuestos.Retenciones.Retencion retencionDTO:
                            conceptoDTO.getImpuestos().getRetenciones().getRetencion()) {

                        itemDetailTable.addCell(getTaxCell(retencionDTO.getImpuesto(), retencionDTO.getTasaOCuota(),
                                retencionDTO.getBase(),retencionDTO.getImporte(),retencionDTO.getTipoFactor(),backgroundColor));
                    }
                }
            }

            itemsTable.addCell(itemDetailTable);

            PdfPCell quantityCell = getCell(conceptoDTO.getCantidad().toPlainString(),null);
            quantityCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            quantityCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            quantityCell.setBackgroundColor(numberLineCount % 2 == 0 ? WHITE_COLOR : COLOR_ROW);
            quantityCell.setFixedHeight(fixedHeight);
            itemsTable.addCell(quantityCell);

            PdfPCell unitPriceCell = getCell(NUMBER_FORMAT.format(conceptoDTO.getValorUnitario()),null);
            unitPriceCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            unitPriceCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            unitPriceCell.setBackgroundColor(numberLineCount % 2 == 0 ? WHITE_COLOR : COLOR_ROW);
            unitPriceCell.setFixedHeight(fixedHeight);
            itemsTable.addCell(unitPriceCell);

            PdfPCell discountCell = getCell(NUMBER_FORMAT.format(conceptoDTO.getDescuento()),null);
            discountCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            discountCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            discountCell.setBackgroundColor(numberLineCount % 2 == 0 ? WHITE_COLOR : COLOR_ROW);
            discountCell.setFixedHeight(fixedHeight);
            itemsTable.addCell(discountCell);

            PdfPCell totalCell = getCell(NUMBER_FORMAT.format(conceptoDTO.getImporte()),null);
            totalCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            totalCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            totalCell.setBackgroundColor(numberLineCount % 2 == 0 ? WHITE_COLOR : COLOR_ROW);
            totalCell.setFixedHeight(fixedHeight);
            itemsTable.addCell(totalCell);


        }

        return itemsTable;

    }

    private PdfPTable getTotalAmountsTable(BigDecimal subTotal, BigDecimal descuento,
                                           BigDecimal total, CFDI.Impuestos impuestos) throws DocumentException {

        final float fixedHeightAmounts = 15f;
        PdfPTable totalInfoTable = getTable(2, new int[]{450,145}, WIDTH_GENERIC_TABLE, WIDTH_PERCENT_GENERIC_TABLE, 0f);
        totalInfoTable.getDefaultCell().setPadding(0f);
        totalInfoTable.addCell(getEmptyCell(1));

        PdfPTable amountsTable = getTable(2, new int[]{75,70}, 145, WIDTH_PERCENT_GENERIC_TABLE, 0f);
        amountsTable.getDefaultCell().setPadding(0f);

        PdfPCell subtotalLabel = getCell(PDFConstants.INVOICE_SUBTOTAL,FONT_GRAY_LABEL);
        subtotalLabel.setFixedHeight(fixedHeightAmounts);
        PdfPCell subtotalValue = getCell(NUMBER_FORMAT.format(Optional.ofNullable(subTotal)
                .orElse(BigDecimal.ZERO)),null);
        subtotalValue.setVerticalAlignment(Element.ALIGN_MIDDLE);
        subtotalValue.setHorizontalAlignment(Element.ALIGN_CENTER);
        subtotalValue.setFixedHeight(fixedHeightAmounts);

        PdfPCell discountLabel = getCell(PDFConstants.INVOICE_DISCOUNT,FONT_GRAY_LABEL);
        discountLabel.setFixedHeight(fixedHeightAmounts);
        PdfPCell discountValue = getCell(NUMBER_FORMAT.format(Optional.ofNullable(descuento)
                .orElse(BigDecimal.ZERO)),null);
        discountValue.setVerticalAlignment(Element.ALIGN_MIDDLE);
        discountValue.setHorizontalAlignment(Element.ALIGN_CENTER);
        discountValue.setFixedHeight(fixedHeightAmounts);


        PdfPCell totalLabel = getCell(PDFConstants.INVOICE_TOTAL,FONT_GRAY_LABEL);
        discountLabel.setFixedHeight(fixedHeightAmounts);
        PdfPCell totalValue = getCell(NUMBER_FORMAT.format(Optional.ofNullable(total)
                .orElse(BigDecimal.ZERO)),null);
        totalValue.setVerticalAlignment(Element.ALIGN_MIDDLE);
        totalValue.setHorizontalAlignment(Element.ALIGN_CENTER);
        totalValue.setFixedHeight(fixedHeightAmounts);

        //Impuestos
        //Cargos no facturables

        amountsTable.addCell(subtotalLabel);
        amountsTable.addCell(subtotalValue);
        amountsTable.addCell(discountLabel);
        amountsTable.addCell(discountValue);
        amountsTable.addCell(totalLabel);
        amountsTable.addCell(totalValue);
        totalInfoTable.addCell(amountsTable);

        return totalInfoTable;
    }

    private PdfPTable getPaymentInfoTable(String paymentType, String paymentMethod, String currency,
                                          BigDecimal grandTotal) throws DocumentException {

        final float fixedHeightAmounts = 15f;
        PdfPTable paymentMethodsTable = getTable(2, new int[]{400,195}, WIDTH_GENERIC_TABLE, WIDTH_PERCENT_GENERIC_TABLE, 0f);
        paymentMethodsTable.getDefaultCell().setPadding(0f);
        paymentMethodsTable.setKeepTogether(true);
        PdfPCell paymentHeader = getCell(PDFConstants.INVOICE_PAYMENT_INFO,null);
        paymentHeader.setColspan(2);
        paymentHeader.setBorderColorBottom(ITEMS_HEADERS_LINES_COLOR);
        paymentHeader.setPaddingLeft(20f);
        paymentHeader.setPaddingBottom(10f);
        paymentHeader.setBorderWidthBottom(2.5f);
        paymentMethodsTable.addCell(paymentHeader);

        PdfPTable paymentInfoTable = getTable(6, new int[]{100,20,100,20,80,30}, 400, WIDTH_PERCENT_GENERIC_TABLE, 0f);
        paymentInfoTable.getDefaultCell().setPadding(0f);
        PdfPCell paymentTypeLabel = getCell(PDFConstants.INVOICE_PAYMENT_TYPE.concat(COLON),null);
        paymentTypeLabel.setPaddingLeft(20f);
        PdfPCell paymentTypeValue = getCell(Optional.ofNullable(paymentType).orElse(Strings.EMPTY),FONT_GRAY_LABEL);
        PdfPCell paymentMethodLabel = getCell(PDFConstants.INVOICE_PAYMENT_METHOD.concat(COLON),null);
        paymentMethodLabel.setPaddingLeft(20f);
        PdfPCell paymentMethodValue = getCell(Optional.ofNullable(paymentMethod).orElse(Strings.EMPTY),FONT_GRAY_LABEL);
        PdfPCell currencyLabel = getCell(PDFConstants.INVOICE_PAYMENT_CURRENCY.concat(COLON),null);
        currencyLabel.setPaddingLeft(20f);
        PdfPCell currencyValue = getCell(Optional.ofNullable(currency).orElse(Strings.EMPTY),FONT_GRAY_LABEL);
//        FIXME: TIPO DE CAMBIO CELL
        paymentInfoTable.addCell(paymentTypeLabel);
        paymentInfoTable.addCell(paymentTypeValue);
        paymentInfoTable.addCell(paymentMethodLabel);
        paymentInfoTable.addCell(paymentMethodValue);
        paymentInfoTable.addCell(currencyLabel);
        paymentInfoTable.addCell(currencyValue);
        paymentInfoTable.addCell(getEmptyCell(2));

        paymentMethodsTable.addCell(paymentInfoTable);

        PdfPTable grandTotalTable = getTable(2, new int[]{100,95}, 195,
                WIDTH_PERCENT_GENERIC_TABLE, 0f);
        grandTotalTable.getDefaultCell().setPadding(0f);

        PdfPCell grandTotalLabel = getCell(PDFConstants.INVOICE_GRAND_TOTAL,FONT_GRAND_TOTAL);
        grandTotalLabel.setFixedHeight(fixedHeightAmounts);
        grandTotalLabel.setBackgroundColor(ITEMS_HEADERS_LINES_COLOR);
        grandTotalLabel.setVerticalAlignment(Element.ALIGN_MIDDLE);
        grandTotalLabel.setHorizontalAlignment(Element.ALIGN_CENTER);

        PdfPCell grandTotalValue = getCell(NUMBER_FORMAT.format(Optional.ofNullable(grandTotal)
                .orElse(BigDecimal.ZERO)),FONT_GRAND_TOTAL);
        grandTotalValue.setVerticalAlignment(Element.ALIGN_MIDDLE);
        grandTotalValue.setHorizontalAlignment(Element.ALIGN_CENTER);
        grandTotalValue.setBackgroundColor(ITEMS_HEADERS_LINES_COLOR);
        grandTotalValue.setFixedHeight(fixedHeightAmounts);

        grandTotalTable.addCell(grandTotalLabel);
        grandTotalTable.addCell(grandTotalValue);
        paymentMethodsTable.addCell(grandTotalTable);

        return  paymentMethodsTable;
    }

    private void addFooter(Document document , CFDI.Complemento.TimbreFiscalDigital timbreFiscalDigital,
                           String rfcEmisor, String rfcReceptor) throws DocumentException {

        PdfPTable stampQRTable = getTable(2, new int[]{400,195}, WIDTH_GENERIC_TABLE, WIDTH_PERCENT_GENERIC_TABLE, 0f);
        stampQRTable.setKeepTogether(true);
        stampQRTable.getDefaultCell().setPadding(0f);

        PdfPTable digitalStampsTable = getTable(1, new int[]{400}, 400, WIDTH_PERCENT_GENERIC_TABLE, 0f);

        PdfPCell digitalStampCFDILabel = getCell(PDFConstants.INVOICE_DIGITAL_STAMP_CFDI,FONT_DIGITAL_STAMPS);
        digitalStampCFDILabel.setPaddingLeft(20f);
        PdfPCell digitalStampCFDIValue = getCell(timbreFiscalDigital.getSelloCFD(), FONT_DIGITAL_STAMPS);
        digitalStampCFDIValue.setPaddingLeft(20f);

        PdfPCell digitalStampSATLabel = getCell(PDFConstants.INVOICE_DIGITAL_STAMP_SAT,FONT_DIGITAL_STAMPS);
        digitalStampSATLabel.setPaddingLeft(20f);
        PdfPCell digitalStampSATValue = getCell(timbreFiscalDigital.getSelloSAT(), FONT_DIGITAL_STAMPS);
        digitalStampSATValue.setPaddingLeft(20f);

        PdfPCell originalStringLabel = getCell(PDFConstants.INVOICE_ORIGINAL_STRING,FONT_DIGITAL_STAMPS);
        originalStringLabel.setPaddingLeft(20f);
        PdfPCell originalStringValue = getCell(timbreFiscalDigital.getCadenaOriginal(),FONT_DIGITAL_STAMPS);
        originalStringValue.setPaddingLeft(20f);

        digitalStampsTable.addCell(digitalStampCFDILabel);
        digitalStampsTable.addCell(digitalStampCFDIValue);
        digitalStampsTable.addCell(digitalStampSATLabel);
        digitalStampsTable.addCell(digitalStampSATValue);
        digitalStampsTable.addCell(originalStringLabel);
        digitalStampsTable.addCell(originalStringValue);

        stampQRTable.addCell(digitalStampsTable);
        stampQRTable.addCell(getQRTable(timbreFiscalDigital.getUuid(),rfcEmisor,rfcReceptor,BigDecimal.ZERO,
                timbreFiscalDigital.getSelloCFD()));

        document.add(stampQRTable);

    }

    private void addBody(Document document , CFDI cfdi) throws DocumentException {

        PdfPTable invoiceInfoTable = getTable(2, new int[]{300,295}, WIDTH_GENERIC_TABLE, WIDTH_PERCENT_GENERIC_TABLE, 15f);

        invoiceInfoTable.addCell(getReceiverTable(cfdi.getReceptor()));
//        FIX: Validar NULL de complemento de timbre fiscal
        invoiceInfoTable.addCell(getCertificationTableInfo(cfdi.getFolio(),cfdi.getSerie(),
                cfdi.getComplemento().getTimbreFiscalDigital(),cfdi.getFecha()));
        document.add(invoiceInfoTable);

//        ITEMS
        if (cfdi.getConceptos() != null && !Optional.ofNullable(cfdi.getConceptos()
                .getConcepto()).orElse(Collections.emptyList()).isEmpty()) {
            document.add(getItemsTable(cfdi.getConceptos().getConcepto()));
        }

        document.add(getTotalAmountsTable(cfdi.getSubTotal(),cfdi.getDescuento(),cfdi.getTotal(), cfdi.getImpuestos()));

//        PAYMENT
        document.add(getPaymentInfoTable(cfdi.getFormaPago(),cfdi.getMetodoPago(), cfdi.getMoneda(), cfdi.getGranTotal()));

    }


    private PdfPTable getQRTable(String uuid, String rfcEmisor, String rfcReceptor, BigDecimal totalComprobante, String selloCFDI) throws DocumentException {

//        FIXME
        String urlQRGenerator = "https://verificacfdi.facturaelectronica.sat.gob.mx/default.aspx?";

            PdfPTable table = getTable(1, new int[]{130}, 130, WIDTH_PERCENT_GENERIC_TABLE, 0F);

            StringBuilder query = new StringBuilder().append(urlQRGenerator)
                    .append(ID_QR_PARAM).append(uuid)
                    .append(RFC_EMISOR_QR_PARAM).append(Optional.ofNullable(rfcEmisor).orElse(Strings.EMPTY))
                    .append(RFC_RECEPTOR_QR_PARAM).append(Optional.ofNullable(rfcReceptor).orElse(Strings.EMPTY))
                    .append(TOTAL_QR_PARAM).append(Optional.ofNullable(totalComprobante).orElse(BigDecimal.ZERO).toPlainString())
                    .append(SELLO_CFDI_QR_PARAM).append(selloCFDI != null && selloCFDI.trim().length() > 9 ? selloCFDI.substring(selloCFDI.length() - 8) : Strings.EMPTY);

            Image imageQR = new BarcodeQRCode(query.toString(), 400, 400, null).getImage();
            imageQR.scaleAbsolute(50, 50);
            table.addCell(imageQR);

            return table;

    }

        private void addHeader(Document document, CFDI cfdi ) throws DocumentException {

        PdfPTable headerTable = getTable(2, new int[]{200,395}, WIDTH_GENERIC_TABLE, WIDTH_PERCENT_GENERIC_TABLE, SPACING_AFTER_GENERIC_TABLE);
        headerTable.getDefaultCell().setPadding(0f);
        BaseColor backgroundHeader = new BaseColor(49,52,61,255);

        PdfPCell invoiceTypeCell = new PdfPCell(new Paragraph(cfdi.getTipoDeComprobante(),FONT_INVOICE_TYPE));
        invoiceTypeCell.setBackgroundColor(backgroundHeader);
        invoiceTypeCell.setBorder(Rectangle.BOX);
        invoiceTypeCell.setBorderColor(backgroundHeader);
        invoiceTypeCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        invoiceTypeCell.setHorizontalAlignment(Element.ALIGN_CENTER);
        invoiceTypeCell.setFixedHeight(150f);
        invoiceTypeCell.setPaddingTop(20f);
        headerTable.addCell(invoiceTypeCell);

        PdfPTable issuerTable = getTable(3, new int[]{100,120,170}, 395, WIDTH_PERCENT_GENERIC_TABLE, SPACING_AFTER_GENERIC_TABLE);

        PdfPCell logoCell = getEmptyCell(3);
        logoCell.setFixedHeight(80f);
        logoCell.setBackgroundColor(backgroundHeader);
        logoCell.setBorder(Rectangle.BOX);
        logoCell.setBorderColor(backgroundHeader);
        logoCell.setPaddingTop(0f);

        PdfPCell invoiceIssuerRFC = new PdfPCell(new Paragraph(cfdi.getEmisor().getRfc(),FONT_ISSUER_INFO));
        invoiceIssuerRFC.setBackgroundColor(backgroundHeader);
        invoiceIssuerRFC.setBorder(Rectangle.BOX);
        invoiceIssuerRFC.setBorderColor(backgroundHeader);
        invoiceIssuerRFC.setFixedHeight(50f);
        invoiceIssuerRFC.setColspan(3);
        invoiceIssuerRFC.setHorizontalAlignment(Element.ALIGN_RIGHT);
        invoiceIssuerRFC.setPaddingRight(15f);

        PdfPCell issuerNameCell = new PdfPCell(new Paragraph(cfdi.getEmisor().getNombre(),FONT_ISSUER_INFO));
        issuerNameCell.setBackgroundColor(backgroundHeader);
        issuerNameCell.setBorder(Rectangle.BOX);
        issuerNameCell.setBorderColor(backgroundHeader);
        issuerNameCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        issuerNameCell.setPaddingBottom(0f);

        PdfPCell issuerRegimenCell = new PdfPCell(new Paragraph(cfdi.getEmisor().getRegimenFiscal(),FONT_ISSUER_INFO));
        issuerRegimenCell.setBackgroundColor(backgroundHeader);
        issuerRegimenCell.setBorder(Rectangle.BOX);
        issuerRegimenCell.setBorderColor(backgroundHeader);
        issuerRegimenCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        issuerRegimenCell.setPaddingBottom(0f);

        PdfPCell websiteCell = new PdfPCell(new Paragraph("www.domain.com.mx",FONT_ISSUER_INFO));
        websiteCell.setBackgroundColor(backgroundHeader);
        websiteCell.setBorder(Rectangle.BOX);
        websiteCell.setBorderColor(backgroundHeader);
        websiteCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        websiteCell.setPaddingBottom(0f);
        websiteCell.setPaddingRight(15f);

        issuerTable.addCell(logoCell);
        issuerTable.addCell(invoiceIssuerRFC);
        issuerTable.addCell(issuerNameCell);
        issuerTable.addCell(issuerRegimenCell);
        issuerTable.addCell(websiteCell);

        headerTable.addCell(issuerTable);
        document.add(headerTable);
    }

    private PdfPTable getTable(int colums, int[] widthColums, float totalWidth, float widthPercentage, float spacingAfter) throws DocumentException {

        PdfPTable table = new PdfPTable(colums);
        table.setWidths(widthColums);
        table.setTotalWidth(totalWidth);
        table.setLockedWidth(true);
        table.setWidthPercentage(widthPercentage);
        table.getDefaultCell().setBorder(Rectangle.NO_BORDER);
        table.setSpacingAfter(spacingAfter);
        return table;
    }

    private PdfPCell getCell(String phrase, Font font) {
        PdfPCell cell = new PdfPCell(new Paragraph(phrase, Optional.ofNullable(font).orElse(FONT_CELL_VALUE)));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setBorder(Rectangle.NO_BORDER);
        return cell;
    }

    private PdfPCell getEmptyCell(int colspan) {

        PdfPCell cell = new PdfPCell(new Paragraph(Strings.EMPTY));
        cell.setBorder(Rectangle.NO_BORDER);
        cell.setColspan(colspan);
        return cell;
    }
}
