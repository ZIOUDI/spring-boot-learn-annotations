package com.demo.spring.boot.SpringBootArtifactDemo.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

    @Getter
    @Setter
    @AllArgsConstructor
    public class Vehicle {
        private int id;
        private int capacity;
        private Driver driver;
    }


