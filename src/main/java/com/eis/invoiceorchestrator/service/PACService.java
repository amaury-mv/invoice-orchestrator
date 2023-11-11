package com.eis.invoiceorchestrator.service;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

/**
 * Interface with PAC operations available
 */
@Component
public interface PACService {

    /**
     * Method to sign an XML using a PAC
     * @param xml XML without timbre fiscal
     * @return XML String signed by PAC
     */
    Mono<String> signXML(String xml);

}
