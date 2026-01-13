package com.gyamtech.graphql_playground.sec01.lec03.service;

import com.gyamtech.graphql_playground.sec01.lec03.domain.Customer2;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class Customer2Service {

    private final Flux<Customer2> flux = Flux.just(
            new Customer2(1, "John Doe", 30, "New York"),
            new Customer2(2, "Jane Smith", 25, "Los Angeles"),
            new Customer2(3, "Bob Johnson", 35, "Chicago"),
            new Customer2(4, "Alice Williams", 40, "Houston"),
            new Customer2(5, "Mike Brown", 45, "Phoenix")
    );

    public Flux<Customer2> findAll() {
        return flux;
    }
}
