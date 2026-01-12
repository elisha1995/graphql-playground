package com.gyamtech.graphql_playground.sec01.lec02.controller;

import com.gyamtech.graphql_playground.sec01.lec02.domain.Customer;
import com.gyamtech.graphql_playground.sec01.lec02.service.CustomerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @QueryMapping
    public Flux<Customer> customers() {
        return customerService.findAll();
    }

    @QueryMapping
    public Mono<Customer> customerById(@Argument Integer id) {
        return customerService.findById(id);
    }

    @QueryMapping
    public Flux<Customer> customersNameContains(@Argument String name) {
        return customerService.nameContains(name);
    }
}
