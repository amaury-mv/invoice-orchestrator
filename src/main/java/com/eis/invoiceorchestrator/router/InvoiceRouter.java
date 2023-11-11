package com.eis.invoiceorchestrator.router;

import com.eis.invoiceorchestrator.handler.InvoiceHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class InvoiceRouter {

    private final static String path = "/api/v1/invoices";

    @Bean
    public RouterFunction<ServerResponse> route(InvoiceHandler invoiceHandler){

        return RouterFunctions.route(POST(path)
                .and(accept(MediaType.APPLICATION_JSON)),invoiceHandler::handleRequest);
    }
}
