package com.eis.invoiceorchestrator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CFDI {

    private Emisor emisor;
    private Receptor receptor;
    private InformacionGlobal informacionGlobal;
    private List<CfdiRelacionados> cfdiRelacionados;
    private Conceptos conceptos;
    private Impuestos impuestos;
    private Complemento complemento;
    //    private Addenda addenda;
    private String serie;
    private String folio;
    private Date fecha;
    private String sello;
    private String formaPago;
    private String noCertificado;
    private String certificado;
    private String condicionesDePago;
    private BigDecimal subTotal;
    private BigDecimal descuento;
    private String moneda;
    private BigDecimal tipoCambio;
    private BigDecimal total;
    private BigDecimal granTotal;
    private String tipoDeComprobante;
    private String exportacion;
    private String metodoPago;
    private String lugarExpedicion;
    private String confirmacion;

//    private HashMap<String, String> datosAdicionales;
//    private List cargos no facturables

    @Data
    @AllArgsConstructor
    public static class Complemento {

        //private CartaPorte cartaPorte;
        //private Donatarias donatarias;
        private Pagos pagos;
        //private INE ine;
        private List<ImpuestosLocales> impuestosLocales;
        //private Nomina nomina;
        //private LeyendasFiscales leyendasFiscales;
        //private ComercioExterior comercioExterior;
        private TimbreFiscalDigital timbreFiscalDigital;

        @Data
        @AllArgsConstructor
        public static class TimbreFiscalDigital {

            private String version;
            private String uuid;
            private Date fechaTimbrado;
            private String rfcProvCertif;
            private String leyenda;
            private String selloCFD;
            private String noCertificadoSAT;
            private String selloSAT;
            private String cadenaOriginal;//no es un valor del XML

        }


        @Data
        @AllArgsConstructor
        public static class ImpuestosLocales {


            private List<RetencionLocal> retencionesLocales;
            private List<TrasladoLocal> trasladoLocales;
            private BigDecimal totaldeRetenciones;
            private BigDecimal totaldeTraslados;

            @Data
            @AllArgsConstructor
            public static class RetencionLocal implements Serializable {

                private String impuesto;
                private BigDecimal importe;
                private BigDecimal tasa;

            }

            @Data
            @AllArgsConstructor
            public static class TrasladoLocal implements Serializable {

                private String impuesto;
                private BigDecimal tasa;
                private BigDecimal importe;

            }
        }

        @Data
        @AllArgsConstructor
        public static class Pagos {

            private Totales totales;
            private List<Pago> pago;

            @Data
            @AllArgsConstructor
            public static class Pago {

                private List<DoctoRelacionado> doctoRelacionado;
                private ImpuestosP impuestosP;
                private XMLGregorianCalendar fechaPago;
                private String formaDePagoP;
                private String monedaP;
                private BigDecimal tipoCambioP;
                private BigDecimal monto;
                private String numOperacion;
                private String rfcEmisorCtaOrd;
                private String nomBancoOrdExt;
                private String ctaOrdenante;
                private String rfcEmisorCtaBen;
                private String ctaBeneficiario;
                private String tipoCadPago;
                private byte[] certPago;
                private String cadPago;
                private byte[] selloPago;

                @Data
                @AllArgsConstructor
                public static class ImpuestosP {

                    private RetencionesP retencionesP;
                    private TrasladosP trasladosP;

                    @Data
                    @AllArgsConstructor
                    public static class TrasladosP {

                        private List<TrasladoP> trasladoP;

                        @Data
                        @AllArgsConstructor
                        public static class TrasladoP {

                            private BigDecimal baseP;
                            private String impuestoP;
                            private String tipoFactorP;
                            private BigDecimal tasaOCuotaP;
                            private BigDecimal importeP;
                        }

                    }

                    @Data
                    @AllArgsConstructor
                    public static class RetencionesP {

                        private List<RetencionP> retencionP;

                        @Data
                        @AllArgsConstructor
                        public static class RetencionP {

                            private String impuestoP;
                            private BigDecimal importeP;

                        }

                    }
                }

                @Data
                @AllArgsConstructor
                public static class DoctoRelacionado {

                    private ImpuestosDR impuestosDR;
                    private String idDocumento;
                    private String serie;
                    private String folio;
                    private String monedaDR;
                    private BigDecimal equivalenciaDR;
                    private BigInteger numParcialidad;
                    private BigDecimal impSaldoAnt;
                    private BigDecimal impPagado;
                    private BigDecimal impSaldoInsoluto;
                    private String objetoImpDR;

                    @AllArgsConstructor
                    @Data
                    public static class ImpuestosDR {

                        private RetencionesDR retencionesDR;
                        private TrasladosDR trasladosDR;

                        @Data
                        @AllArgsConstructor
                        public static class TrasladosDR {

                            private List<TrasladoDR> trasladoDR;

                            @Data
                            @AllArgsConstructor
                            public static class TrasladoDR {

                                private BigDecimal baseDR;
                                private String impuestoDR;
                                private String tipoFactorDR;
                                private BigDecimal tasaOCuotaDR;
                                private BigDecimal importeDR;
                            }

                        }

                        @AllArgsConstructor
                        @Data
                        public static class RetencionesDR {

                            private List<RetencionDR> retencionDR;

                            @Data
                            @AllArgsConstructor
                            public static class RetencionDR {

                                private BigDecimal baseDR;
                                private String impuestoDR;
                                private String tipoFactorDR;
                                private BigDecimal tasaOCuotaDR;
                                private BigDecimal importeDR;
                            }
                        }


                    }

                }
            }

            @Data
            @AllArgsConstructor
            public static class Totales {

                private BigDecimal totalRetencionesIVA;
                private BigDecimal totalRetencionesISR;
                private BigDecimal totalRetencionesIEPS;
                private BigDecimal totalTrasladosBaseIVA16;
                private BigDecimal totalTrasladosImpuestoIVA16;
                private BigDecimal totalTrasladosBaseIVA8;
                private BigDecimal totalTrasladosImpuestoIVA8;
                private BigDecimal totalTrasladosBaseIVA0;
                private BigDecimal totalTrasladosImpuestoIVA0;
                private BigDecimal totalTrasladosBaseIVAExento;
                private BigDecimal montoTotalPagos;
            }
        }
    }

    @Data
    @AllArgsConstructor
    public static class Impuestos {

        private Retenciones retenciones;
        private Traslados traslados;
        private BigDecimal totalImpuestosRetenidos;
        private BigDecimal totalImpuestosTrasladados;

        @AllArgsConstructor
        @Data
        public static class Traslados {

            private List<Traslado> traslado;

            @Data
            @AllArgsConstructor
            public static class Traslado {

                private BigDecimal base;
                private String impuesto;
                private String tipoFactor;
                private BigDecimal tasaOCuota;
                private BigDecimal importe;
            }

        }

        @AllArgsConstructor
        @Data
        public static class Retenciones {

            private List<Retencion> retencion;

            @AllArgsConstructor
            @Data
            public static class Retencion {

                private String impuesto;
                private BigDecimal importe;
            }
        }

    }

    @Data
    @AllArgsConstructor
    public static class Conceptos {

        private List<Concepto> concepto;

        @Data
        @AllArgsConstructor
        public static class Concepto {


            private Impuestos impuestos;
            private ACuentaTerceros aCuentaTerceros;
            private List<InformacionAduanera> informacionAduanera;
            private List<CuentaPredial> cuentaPredial;
            private ComplementoConcepto complementoConcepto;
            private List<Parte> parte;
            private String claveProdServ;
            private String noIdentificacion;
            private BigDecimal cantidad;
            private String claveUnidad;
            private String unidad;
            private String descripcion;
            private BigDecimal valorUnitario;
            private BigDecimal importe;
            private BigDecimal descuento;
            private String objetoImp;

            @Data
            @AllArgsConstructor
            public static class Parte {

                private List<InformacionAduanera> informacionAduanera;
                private String claveProdServ;
                private String noIdentificacion;
                private BigDecimal cantidad;
                private String unidad;
                private String descripcion;
                private BigDecimal valorUnitario;
                private BigDecimal importe;
            }

            @Data
            @AllArgsConstructor
            public static class ComplementoConcepto {

                private InstEducativas instEducativas;

                @AllArgsConstructor
                @Data
                public class InstEducativas {

                    private String version;
                    private String nombreAlumno;
                    private String curp;
                    private String nivelEducativo;
                    private String autRVOE;
                    private String rfcPago;
                }
            }

            @Data
            @AllArgsConstructor
            public static class CuentaPredial {
                private String numero;
            }

            @Data
            @AllArgsConstructor
            public static class InformacionAduanera {

                private String numeroPedimento;
            }

            @Data
            @AllArgsConstructor
            public static class ACuentaTerceros {

                private String rfcACuentaTerceros;
                private String nombreACuentaTerceros;
                private String regimenFiscalACuentaTerceros;
                private String domicilioFiscalACuentaTerceros;
            }

            @Data
            @AllArgsConstructor
            public static class Impuestos {

                private Traslados traslados;
                private Retenciones retenciones;

                @Data
                @AllArgsConstructor
                public static class Retenciones {

                    private List<Retencion> retencion;

                    @Data
                    @AllArgsConstructor
                    public static class Retencion {

                        private BigDecimal base;
                        private String impuesto;
                        private String tipoFactor;
                        private BigDecimal tasaOCuota;
                        private BigDecimal importe;
                    }
                }

                @Data
                @AllArgsConstructor
                public static class Traslados {

                    private List<Traslado> traslado;

                    @Data
                    @AllArgsConstructor
                    public static class Traslado {

                        private BigDecimal base;
                        private String impuesto;
                        private String tipoFactor;
                        private BigDecimal tasaOCuota;
                        private BigDecimal importe;
                    }

                }


            }

        }
    }


    @Data
    @AllArgsConstructor
    public static class Receptor {

        private String rfc;
        private String nombre;
        private String domicilioFiscalReceptor;
        private String residenciaFiscal;
        private String numRegIdTrib;
        private String regimenFiscalReceptor;
        private String usoCFDI;
    }


    /**
     * Only for internal use
     */
    @Data
    @AllArgsConstructor
    public static class Emisor {

        private String rfc;
        private String nombre;
        private String regimenFiscal;
        private String facAtrAdquirente;
    }

    @Data
    @AllArgsConstructor
    public static class CfdiRelacionados {
        private List<CfdiRelacionado> cfdiRelacionado;
        private String tipoRelacion;

        @Data
        @AllArgsConstructor
        public static class CfdiRelacionado {
            private String uuid;
        }
    }


    @Data
    @AllArgsConstructor
    public static class InformacionGlobal {

        private String periodicidad;
        private String meses;
        private int anio;

    }


}
