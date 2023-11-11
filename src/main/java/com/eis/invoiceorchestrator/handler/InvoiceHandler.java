package com.eis.invoiceorchestrator.handler;

import com.eis.invoiceorchestrator.CFDI;
import com.eis.invoiceorchestrator.config.AbstractValidationHandler;
import com.eis.invoiceorchestrator.model.InvoiceResponse;
import com.eis.invoiceorchestrator.service.Orchestrator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class InvoiceHandler extends  AbstractValidationHandler<CFDI, Validator> {

    @Autowired
    private Orchestrator orchestrator;

    private InvoiceHandler(@Autowired Validator validator) {
        super(CFDI.class, validator);
//        this.orchestrator = orchestrator;
    }

    @Override
    protected Mono<ServerResponse> processBody(CFDI validBody, ServerRequest originalRequest) {

//        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
//                .body(orchestrator.createInvoice(Mono.just(validBody),null), InvoiceResponse.class);

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(orchestrator.createInvoice(validBody,null), InvoiceResponse.class);
    }
}
