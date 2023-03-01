package com.demo.spring.boot.SpringBootArtifactDemo.services.interfaces;

import com.demo.spring.boot.SpringBootArtifactDemo.entities.Driver;

public interface DriverService {
    Driver getDriverById(int id);

    Driver createDriver(Driver driver);
}
