package com.demo.spring.boot.VehicleTransportSystem.services.interfaces;

import com.demo.spring.boot.VehicleTransportSystem.entities.Vehicle;

public interface VehicleService {
    Vehicle getVehicleById(Long id);

    Vehicle createVehicle(Vehicle vehicle);
}
