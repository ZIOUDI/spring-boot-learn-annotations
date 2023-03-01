package com.demo.spring.boot.SpringBootArtifactDemo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class City {
    /*
     name (nom de la ville), country (nom du pays), latitude (latitude de la ville) et longitude (longitude de la ville).
     */
    private String name;
    private String country;
    private double latitude;
    private double longitude;
}
