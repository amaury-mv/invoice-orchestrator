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
        String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJ0TDNlNnlQV3Z4RWJnYVNyS1Vmelc1TlQyNkVaNHhiRjJOOGFFV0g1Iiwic3ViIjoiTmV4dCBUZWNobm9sb2dpZXMgW1NUQUdFXSIsImlzcyI6IkVNSVRFIFtTVEFHRV0iLCJhdWQiOiJCRU5HQUxBIFtTVEFHRV0ifQ.T4hgD3qsYjyWSMwB75ptbrBMQzTrKvVM3X9Cz4W-BQ8";
        return advansClient.getXMLSigned(PacEmiteRequest.builder().xml(xml).build(), requestId, token).
                map(PacEmiteResponse::getXml);
    }
}
