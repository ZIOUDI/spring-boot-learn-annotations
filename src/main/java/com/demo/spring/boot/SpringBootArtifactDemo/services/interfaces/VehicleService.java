package com.demo.spring.boot.SpringBootArtifactDemo.services.interfaces;

import com.demo.spring.boot.SpringBootArtifactDemo.entities.Vehicle;

public interface VehicleService {
    Vehicle getVehicleById(int id);

    Vehicle createVehicle(Vehicle vehicle);
}
