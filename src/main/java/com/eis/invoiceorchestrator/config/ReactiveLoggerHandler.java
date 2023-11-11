package com.eis.invoiceorchestrator.config;

import feign.MethodMetadata;
import feign.Target;
import org.springframework.context.annotation.Configuration;
import reactivefeign.client.ReactiveHttpRequest;
import reactivefeign.client.ReactiveHttpResponse;
import reactivefeign.client.log.ReactiveLoggerListener;

@Configuration
public class ReactiveLoggerHandler implements ReactiveLoggerListener {
    @Override
    public Object requestStarted(ReactiveHttpRequest reactiveHttpRequest, Target target, MethodMetadata methodMetadata) {
        return null;
    }

    @Override
    public boolean logRequestBody() {
        return false;
    }

    @Override
    public void bodySent(Object o, Object o2) {

    }

    @Override
    public void errorReceived(Throwable throwable, Object o) {

    }

    @Override
    public boolean logResponseBody() {
        return false;
    }

    @Override
    public void bodyReceived(Object o, Object o2) {

    }

    @Override
    public void responseReceived(ReactiveHttpResponse reactiveHttpResponse, Object o) {

    }
}
