package com.eis.invoiceorchestrator.client;


import com.eis.invoiceorchestrator.config.ReactiveErrorHandler;
import com.eis.invoiceorchestrator.config.ReactiveLoggerHandler;
import com.eis.invoiceorchestrator.model.PacEmiteRequest;
import com.eis.invoiceorchestrator.model.PacEmiteResponse;
import feign.Headers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Mono;

@ReactiveFeignClient(name = "emite-pac",url = "https://api-stage.emite.dev/v1",
        configuration = {ReactiveErrorHandler.class, ReactiveLoggerHandler.class})
@Headers("request_id: {requestId}")
public interface PACEmiteClient {

    @PostMapping(value = "/stamp", consumes = "application/json", produces = "application/json")
//            @Headers({"Authorization: {bearerToken}"})
    //FIXME Add headers to trace request
    Mono<PacEmiteResponse> getXMLSigned(@RequestBody PacEmiteRequest request, @RequestHeader("requestId") String requestId,
                                        @RequestHeader(value = "Authorization", required = true) String bearerToken);
}
