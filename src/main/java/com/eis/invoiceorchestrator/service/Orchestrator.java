package com.eis.invoiceorchestrator.service;

import com.eis.invoiceorchestrator.CFDI;
import com.eis.invoiceorchestrator.client.CertificateClient;
import com.eis.invoiceorchestrator.model.InvoiceResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
@Slf4j
@AllArgsConstructor
public class Orchestrator {

    private final XMLService xmlService;
    private final CertificateClient certificateClient;
    private final SignatureService signatureService;
    public Mono<InvoiceResponse> createInvoice(CFDI cfdi, HttpHeaders headers) {

        //FIXME: Procesar api key y determinar centro de costo
        //String issuerCenter = headers.getFirst("header-api-key");
        //FIXME Obtener el key del certificado desde el centro de costo o emisor
        String certificateKey = "UUID-KEY";


        certificateClient.getCertificate(certificateKey)
                .map(certificateData -> {
                    try {
                        return xmlService.getXML(cfdi,certificateData);
                    } catch (Exception e) {
                        e.printStackTrace();
                        throw new RuntimeException(e);
                    }
                }).flatMap(signatureService::getXMLSigned)
                .log()
                .onErrorResume(ex -> {
                    log.error("Error: ",ex);
                    return Mono.empty();
                })
                .subscribe();



        return Mono.just(new InvoiceResponse(UUID.randomUUID().toString()));

    }
}
