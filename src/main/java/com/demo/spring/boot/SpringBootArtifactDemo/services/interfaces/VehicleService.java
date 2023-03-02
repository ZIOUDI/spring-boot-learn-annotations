package com.demo.spring.boot.SpringBootArtifactDemo.services.interfaces;

import com.demo.spring.boot.SpringBootArtifactDemo.entities.Vehicle;

public interface VehicleService {
    Vehicle getVehicleById(Long id);

    Vehicle createVehicle(Vehicle vehicle);
}
