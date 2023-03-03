package com.demo.spring.boot.VehicleTransportSystem.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CityDTO {
    private Long id;

    private Long reference;
    private String name;
    private String country;

    public CityDTO(Long reference, String name, String country) {
        this.reference = reference;
        this.name = name;
        this.country = country;
    }
}
