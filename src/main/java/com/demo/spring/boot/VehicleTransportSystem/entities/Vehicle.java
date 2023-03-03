package com.demo.spring.boot.VehicleTransportSystem.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

    @Getter
    @Setter
    @AllArgsConstructor
    public class Vehicle {
        private Long id;
        private Long capacity;
        private Driver driver;
    }

