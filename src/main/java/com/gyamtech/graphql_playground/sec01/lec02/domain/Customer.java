package com.gyamtech.graphql_playground.sec01.lec02.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private Integer id;
    private String name;
    private Integer age;
    private String city;
}
