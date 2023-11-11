package com.eis.invoiceorchestrator.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import reactivefeign.client.ReactiveErrorMapper;
import reactivefeign.client.ReactiveHttpRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.BiFunction;
import java.util.function.Function;

@Configuration
@Slf4j
public class ReactiveErrorHandler implements ReactiveErrorMapper {
    @Override
    public Throwable apply(ReactiveHttpRequest reactiveHttpRequest, Throwable throwable) {

        if(reactiveHttpRequest.body()!=null){
            if(reactiveHttpRequest.body() instanceof Mono){
                ((Mono<Object>) reactiveHttpRequest.body())
                        .doOnNext(body -> log.error("REQUEST BODY [{}]",body)).subscribe();
            }else if (reactiveHttpRequest.body() instanceof Flux){

                ((Flux<Object>) reactiveHttpRequest.body())
                        .doOnNext(body -> log.error("REQUEST BODY [{}]",body)).subscribe();
            }
        }

        return throwable;
    }

    @Override
    public <V> BiFunction<ReactiveHttpRequest, Throwable, V> andThen(Function<? super Throwable, ? extends V> after) {
        return ReactiveErrorMapper.super.andThen(after);
    }
}
