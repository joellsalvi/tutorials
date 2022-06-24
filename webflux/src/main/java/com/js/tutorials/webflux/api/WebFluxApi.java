package com.js.tutorials.webflux.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/webflux")
public interface WebFluxApi {

    @GetMapping("/flux")
    Flux<String> fluxHelloWorld();

    @GetMapping("/mono")
    Mono<String> monoHelloWorld();

}
