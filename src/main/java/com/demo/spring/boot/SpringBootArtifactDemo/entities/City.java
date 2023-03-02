package com.demo.spring.boot.SpringBootArtifactDemo.entities;


import javax.persistence.*;

import lombok.*;

import java.util.List;


@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class City {
    /*
     name (nom de la ville), country (nom du pays), latitude (latitude de la ville) et longitude (longitude de la ville).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long reference;
    private String name;
    private String country;

    @OneToMany(mappedBy = "startCity")
    private List<Trip> tripsFrom;

    @OneToMany(mappedBy = "endCity")
    private List<Trip> tripsTo;

    public City(Long reference, String name, String country) {
        this.reference = reference;
        this.name = name;
        this.country = country;
    }
}
