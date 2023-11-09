package com.eis.invoiceorchestrator.handler;

import com.eis.invoiceorchestrator.model.InvoiceResponse;
import com.eis.invoiceorchestrator.service.Orchestrator;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@Slf4j
@AllArgsConstructor
public class InvoiceHandler {

    private Orchestrator orchestrator;


    public Mono<ServerResponse> createInvoice(ServerRequest serverRequest){

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(orchestrator.createInvoice(null,null), InvoiceResponse.class);
    }
}
