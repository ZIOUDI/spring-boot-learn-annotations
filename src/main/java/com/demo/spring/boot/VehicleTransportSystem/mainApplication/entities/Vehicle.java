package com.demo.spring.boot.VehicleTransportSystem.mainApplication.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "Vehicle")

public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "vehicle")
    private List<Passenger> passengers;

    @OneToOne(mappedBy = "vehicle")
    private Driver driver;
    @Column(nullable = false)
    private Long capacity;

    @Column(nullable = false)
    private String insurance;

    @Column(nullable = false)
    private String technicalInspection;

    @Column(nullable = false)
    private String vignette;

    @Column(nullable = false)
    private int age;
    }


