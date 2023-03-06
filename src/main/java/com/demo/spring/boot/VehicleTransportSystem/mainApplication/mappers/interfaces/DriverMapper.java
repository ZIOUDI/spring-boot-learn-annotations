package com.demo.spring.boot.VehicleTransportSystem.mainApplication.mappers.interfaces;


import com.demo.spring.boot.VehicleTransportSystem.mainApplication.dto.DriverDTO;
import com.demo.spring.boot.VehicleTransportSystem.mainApplication.entities.Driver;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


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
