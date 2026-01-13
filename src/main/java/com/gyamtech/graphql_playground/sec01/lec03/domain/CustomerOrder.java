package com.gyamtech.graphql_playground.sec01.lec03.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "create")
public class CustomerOrder {

    private UUID id;
    private String description;
}
