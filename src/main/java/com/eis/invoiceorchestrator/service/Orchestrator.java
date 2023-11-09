package com.eis.invoiceorchestrator.service;

import com.eis.invoiceorchestrator.CFDI;
import com.eis.invoiceorchestrator.client.CertificateClient;
import com.eis.invoiceorchestrator.model.InvoiceResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Slf4j
@AllArgsConstructor
public class Orchestrator {

    private final XMLService xmlService;
    private final CertificateClient certificateClient;

    public Mono<InvoiceResponse> createInvoice(CFDI cfdi, HttpHeaders headers) {


        try {

            cfdi = new CFDI();
            cfdi.setEmisor(new CFDI.Emisor("MAVM900610EU6", "Easy Invoice Solutions SA. DE C.V", "308", null));
            cfdi.setReceptor(new CFDI.Receptor("XAXX010101000", "PUBLICO EN GENERAL", "03810", "CDMX",
                    null, "401", "03"));
            cfdi.setConceptos(new CFDI.Conceptos(List.of(new CFDI.Conceptos.Concepto(new CFDI.Conceptos.Concepto.Impuestos(
                    new CFDI.Conceptos.Concepto.Impuestos.Traslados(
                            List.of(new CFDI.Conceptos.Concepto.Impuestos.Traslados.Traslado(new BigDecimal(3450),
                                    "002", "Tasa", BigDecimal.valueOf(0.16), new BigDecimal(45555)))),
                    new CFDI.Conceptos.Concepto.Impuestos.Retenciones(null)), new CFDI.Conceptos.Concepto.ACuentaTerceros("xaxx", "nombre", "regimen", "dd"), null, List.of(new CFDI.Conceptos.Concepto.CuentaPredial("1234"), new CFDI.Conceptos.Concepto.CuentaPredial("5555")), null, null, "001100", null
                    , BigDecimal.ONE, "H24", "PZA", "Cargo por hospedaje 3 noches", new BigDecimal(4474), new BigDecimal(355555),
                    BigDecimal.ZERO, "01"))));

            cfdi.setImpuestos(new CFDI.Impuestos(null,
                    new CFDI.Impuestos.Traslados(List.of(new CFDI.Impuestos.Traslados.Traslado(new BigDecimal(3399), "002",
                            "Tasa", BigDecimal.valueOf(0.16), new BigDecimal(3909)))), BigDecimal.ZERO,
                    new BigDecimal(3000)));

            cfdi.setComplemento(new CFDI.Complemento(null, null,
                    new CFDI.Complemento.TimbreFiscalDigital(null, "EEEEEEEE-99E2-47B0-955CDEA7293920AD",
                            new Date(), null, null, "GTklcpowGkjiqUv11C8T5jiNeJenwZF7yMxLb1GoXfzod95oQ4Zq3sZz3aUu8Aqe4yduMAzBrYfbQmGFX1Y4QoHUnEAL14XlK6pHNyL5Tt4T5xbySlQhGQp7VZBSL87fb3ijs\n" +
                            "kDYRauu3dgglPONbkoYDl1LLNzqvyo1NOllqPnMbdnW1ap30mFZdAYQ9SmA/VkGHo1thddAlj0x53V7juFOtyeAG8s+HohKY9om+m8wYq/YXY/RyLwWor0KA37S+/l96egg\n" +
                            "1+kiJu2fdCJseAIWHUjaSJk/h21g4KJtpOCeYYYcz3eIoiXU4xhRSNtC9xQQNBUyr/22SuybCumTTA==", null,
                            "n8m+cn1DSkm+j1ugMMHVO+ROIgca/MOzFlcmONx5iTeFdoziqWsO0BUNFzQvuizxmQZJU6lXdVjK3byl+pxlw9gy4taXSj9Rg2wqhNxoIl3WD2kzjO75wIVRaR5dWvWnqLP\n" +
                                    "TzKrKim8LGORYO7esjVHHpZi6CGLEvNkTKaTxRTfIW03n+6ZF+K30yNJWr/OF4eW0AQU/AFs/S+5WLyWs1MzoQFxS7DTCXGvajvdKhM70xuzD372Bz4EEHI074bHIBX7\n" +
                                    "MaFz/8i8fzmPeFqftTW6MpszvUxeDnFv4e9X+fIeT4vChg7SL1Og4MowWi82BWEwpRBVnL2QKrz+g5JtY4g==",
                            "||1.1|EEEEEEEE-99E2-47B0-955C-DEA7293920AD|EEEEEEEE-99E2-47B0-955C-DEA7293920AD|2022-10-17T17:57:06|EFA100217SU5|Este documento fue timbrado\n" +
                                    "en el ambiente de pruebas de Emite - Soluciones Fiscales Digitales, Proveedor Autorizado de Certificación:\n" +
                                    "56080|GTklcpowGkjiqUv11C8T5jiNeJenwZF7yMxLb1GoXfzod95oQ4Zq3sZz3aUu8Aqe4yduMAzBrYfbQmGFX1Y4QoHUnEAL14XlK6pHNyL5Tt4T5xbySlQhGQp7VZBSL8\n" +
                                    "7fb3ijskDYRauu3dgglPONbkoYDl1LLNzqvyo1NOllqPnMbdnW1ap30mFZdAYQ9SmA/VkGHo1thddAlj0x53V7juFOtyeAG8s+HohKY9om+m8wYq/YXY/RyLwWor0KA37S+/l\n" +
                                    "96egg1+kiJu2fdCJseAIWHUjaSJk/h21g4KJtpOCeYYYcz3eIoiXU4xhRSNtC9xQQNBUyr/22SuybCumTTA==|30001000000400002495||")));
            cfdi.setSerie("FAC");
            cfdi.setFolio("123ABC");
            cfdi.setFecha(new Date());
            cfdi.setFormaPago("03");
            cfdi.setSubTotal(new BigDecimal(78790));
            cfdi.setDescuento(BigDecimal.ZERO);
            cfdi.setMoneda("USD");
            cfdi.setTipoCambio(BigDecimal.valueOf(18.64));
            cfdi.setTotal(new BigDecimal(43555));
            cfdi.setGranTotal(new BigDecimal(45545));
            cfdi.setTipoDeComprobante("INGRESO");
            cfdi.setMetodoPago("PPD");
            cfdi.setLugarExpedicion("03420");
            cfdi.setInformacionGlobal(new CFDI.InformacionGlobal("01", "01", 2022));
            cfdi.setCfdiRelacionados(List.of(new CFDI.CfdiRelacionados(List.of(new CFDI.CfdiRelacionados.CfdiRelacionado("FFFFFFFF-5499-4265-A27A-1C5BCAC3AD10")), "01")));
            cfdi.setCondicionesDePago("sin condicion");
            cfdi.getComplemento().setImpuestosLocales(new ArrayList<>());
            cfdi.getComplemento().getImpuestosLocales().add(new CFDI.Complemento.ImpuestosLocales(null, List.of(new CFDI.Complemento.ImpuestosLocales.TrasladoLocal("ISH", BigDecimal.TEN, BigDecimal.TEN)), BigDecimal.ONE, BigDecimal.TEN));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        CFDI cfdi1 = cfdi;

        certificateClient.getCertificate("header-api-key")
                .map(certificateData -> {
                    try {
                        return xmlService.getXML(cfdi1,certificateData);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                })
                .log()
                .onErrorResume(throwable -> {
                    System.out.println(throwable);
                    return Mono.empty();
                })
                .subscribe();



        return Mono.just(new InvoiceResponse(UUID.randomUUID().toString()));

    }
}
