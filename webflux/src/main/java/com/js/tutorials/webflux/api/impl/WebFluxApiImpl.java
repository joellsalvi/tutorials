package com.js.tutorials.webflux.api.impl;

import com.js.tutorials.webflux.api.WebFluxApi;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class WebFluxApiImpl implements WebFluxApi {

    @Override
    public Flux<String> fluxHelloWorld() {
        return Flux.just("Flux Hello World!");
    }

    @Override
    public Mono<String> monoHelloWorld() {
        return Mono.just("Mono Hello World!");
    }
}
