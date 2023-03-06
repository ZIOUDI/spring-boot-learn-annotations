package com.demo.spring.boot.VehicleTransportSystem.mainApplication.services.interfaces;

import com.demo.spring.boot.VehicleTransportSystem.mainApplication.dto.DriverDTO;
import com.demo.spring.boot.VehicleTransportSystem.mainApplication.entities.Driver;

import java.util.List;
import java.util.Optional;

public interface DriverService {

    List<DriverDTO> getAllDrivers();

    Optional<Driver> getDriverById(Long id);



    Driver createDriver(Driver driver);

    Driver updateDriver(Long id, Driver driver);

    void deleteDriverById(Long id);
}
