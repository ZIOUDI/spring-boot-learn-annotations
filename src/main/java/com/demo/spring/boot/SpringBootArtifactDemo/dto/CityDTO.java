package com.demo.spring.boot.SpringBootArtifactDemo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CityDTO {
    private Integer id;

    private int reference;
    private String name;
    private String country;

    public CityDTO(int reference, String name, String country) {
        this.reference = reference;
        this.name = name;
        this.country = country;
    }
}
