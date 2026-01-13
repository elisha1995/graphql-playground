package com.gyamtech.graphql_playground.sec01.lec03.controller;

import com.gyamtech.graphql_playground.sec01.lec02.service.OrderService;
import com.gyamtech.graphql_playground.sec01.lec03.domain.Customer2;
import com.gyamtech.graphql_playground.sec01.lec03.domain.CustomerOrder;
import com.gyamtech.graphql_playground.sec01.lec03.service.Customer2Service;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

@Controller
public class Customer2Controller {

    private final Customer2Service customer2Service;

    private final OrderService orderService;

    public Customer2Controller(Customer2Service customer2Service, OrderService orderService) {
        this.customer2Service = customer2Service;
        this.orderService = orderService;
    }

    @QueryMapping
    public Flux<Customer2> customers2() {
        return customer2Service.findAll();
    }

    @SchemaMapping(typeName = "Customer2")
    public Flux<CustomerOrder> orders(Customer2 customer) {
        return orderService.ordersByCustomerName(customer.getName());
    }
}
