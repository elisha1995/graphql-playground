package com.gyamtech.graphql_playground.sec01.lec03.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer2 {

    private Integer id;
    private String name;
    private Integer age;
    private String city;
}
