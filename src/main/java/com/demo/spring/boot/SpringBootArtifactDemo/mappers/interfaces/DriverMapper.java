package com.demo.spring.boot.SpringBootArtifactDemo.mappers.interfaces;


import com.demo.spring.boot.SpringBootArtifactDemo.dto.DriverDTO;
import com.demo.spring.boot.SpringBootArtifactDemo.entities.Driver;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

import static com.demo.spring.boot.SpringBootArtifactDemo.entities.Driver.*;


@Component
public class DriverMapper {

    public DriverDTO toDto(Driver driver) {
        return DriverDTO.builder()
                .id(driver.getId())
                .firstName(driver.getFirstName())
                .lastName(driver.getLastName())
                .email(driver.getEmail())
                .build();
    }

    public Driver toEntity(DriverDTO driverDTO) {
        return Driver.builder()
                .id(driverDTO.getId())
                .firstName(driverDTO.getFirstName())
                .lastName(driverDTO.getLastName())
                .email(driverDTO.getEmail())
                .build();
    }


    public List<DriverDTO> toDtoList(List<Driver> drivers) {
        return drivers.stream().map(this::toDto).collect(Collectors.toList());
    }


}
