package com.demo.spring.boot.SpringBootArtifactDemo.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Segment {
    private int id;
    private City departureCity;
    private City arrivalCity;
    private Vehicle vehicle;
}


