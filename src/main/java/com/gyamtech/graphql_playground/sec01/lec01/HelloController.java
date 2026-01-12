package com.gyamtech.graphql_playground.sec01.lec01;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

import java.util.concurrent.ThreadLocalRandom;

@Controller
public class HelloController {

    @QueryMapping
    public Mono<String> sayHello() {
        return Mono.just("Hello World");
    }

    @QueryMapping
    public Mono<String> sayHelloTo(@Argument String name) {
        return Mono.fromSupplier(() -> "Hello " + name);
    }

    @QueryMapping
    public Mono<Integer> random() {
        return Mono.just(ThreadLocalRandom.current().nextInt(1, 100));
    }
}
