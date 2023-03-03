package com.demo.spring.boot.VehicleTransportSystem.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Segment {
    private Long id;
    private City departureCity;
    private City arrivalCity;
    private Vehicle vehicle;
}


