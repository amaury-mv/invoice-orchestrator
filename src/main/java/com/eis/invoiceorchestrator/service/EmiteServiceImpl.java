package com.eis.invoiceorchestrator.service;

import com.eis.invoiceorchestrator.client.PACEmiteClient;
import com.eis.invoiceorchestrator.model.PacEmiteRequest;
import com.eis.invoiceorchestrator.model.PacEmiteResponse;
import com.eis.invoiceorchestrator.utilities.Constants;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service(Constants.EMITE_SERVICE)
@AllArgsConstructor
@Slf4j
public class EmiteServiceImpl implements PACService{

    private final PACEmiteClient emiteClient;

    @Override
    public Mono<String> signXML(String xml) {

        //FIXME: Recuperar el Request ID de MDC
        String requestId = UUID.randomUUID().toString();
        log.info("Request ID {} XML {}",requestId,xml);
        String token = "emite-token";
        return emiteClient.getXMLSigned(PacEmiteRequest.builder().xml(xml).build(), requestId, token).
                map(PacEmiteResponse::getXml);
    }
}
