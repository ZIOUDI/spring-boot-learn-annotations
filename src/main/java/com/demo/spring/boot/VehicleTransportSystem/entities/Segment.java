package com.demo.spring.boot.VehicleTransportSystem.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "segment")
public class Segment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private City departureCity;
    private City arrivalCity;
    private Vehicle vehicle;
}


