package com.gyamtech.graphql_playground.sec01.lec02.service;

import com.gyamtech.graphql_playground.sec01.lec02.domain.AgeRangeFilter;
import com.gyamtech.graphql_playground.sec01.lec02.domain.Customer;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerService {

    private final Flux<Customer> flux = Flux.just(
            new Customer(1, "John", 30, "New York"),
            new Customer(2, "Jane", 25, "Los Angeles"),
            new Customer(3, "Bob", 35, "Chicago"),
            new Customer(4, "Alice", 40, "Houston"),
            new Customer(5, "Mike", 45, "Phoenix")
    );

    public Flux<Customer> findAll() {
        return flux;
    }

    public Mono<Customer> findById(Integer id) {
        return flux.filter(customer ->
                customer.getId().equals(id)).next();
    }

    public Flux<Customer> nameContains(String name) {
        return flux.filter(customer -> customer.getName().contains(name));
    }

    public Flux<Customer> ageRange(AgeRangeFilter filter) {
        return flux.filter(customer -> customer.getAge() >= filter.getMinAge()
                && customer.getAge() <= filter.getMaxAge());
    }
}
