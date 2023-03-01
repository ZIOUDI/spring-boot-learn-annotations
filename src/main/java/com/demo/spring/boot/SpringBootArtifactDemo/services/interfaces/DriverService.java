package com.demo.spring.boot.SpringBootArtifactDemo.services.interfaces;

import com.demo.spring.boot.SpringBootArtifactDemo.dto.DriverDTO;
import com.demo.spring.boot.SpringBootArtifactDemo.entities.Driver;

import java.util.List;

public interface DriverService {

    List<DriverDTO> getAllDrivers();

    DriverDTO getDriverById(int id);

    DriverDTO createDriver(DriverDTO driverDTO);

    DriverDTO updateDriver(int id, DriverDTO driverDTO);

    void deleteDriver(int id);
}
