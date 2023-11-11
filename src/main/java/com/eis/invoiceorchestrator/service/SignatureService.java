package com.eis.invoiceorchestrator.service;

import com.eis.invoiceorchestrator.factory.PACFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * Service Class to sign an XML to get a UUID SAT
 */
@Service
@AllArgsConstructor
public class SignatureService {

    private final PACFactory pacFactory;


    /**
     * Method to get XML signed by config PAC
     * @return XML signed
     */
    public Mono<String> getXMLSigned(String xml){

        return pacFactory.getPACByPriority(PACService.class)
                .signXML(xml);

    }

}
