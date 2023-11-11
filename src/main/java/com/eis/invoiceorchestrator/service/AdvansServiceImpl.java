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

@Service(Constants.ADVANS_SERVICE)
@AllArgsConstructor
@Slf4j
public class AdvansServiceImpl implements PACService{

    //FIXME: Cambiar por el PAC especifico
    private final PACEmiteClient advansClient;

    @Override
    public Mono<String> signXML(String xml) {
        //FIXME: Recuperar el Request ID de MDC
        String requestId = UUID.randomUUID().toString();
        log.info("Request ID {} XML {}",requestId,xml);

        String token = "";
        return advansClient.getXMLSigned(PacEmiteRequest.builder().xml(xml).build(), requestId, token).
                map(PacEmiteResponse::getXml);
    }
}
