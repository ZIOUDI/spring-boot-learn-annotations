package com.demo.spring.boot.VehicleTransportSystem.mainApplication.services.interfaces;

import com.demo.spring.boot.VehicleTransportSystem.mainApplication.entities.Vehicle;

public interface VehicleService {
    Vehicle getVehicleById(Long id);

    Vehicle createVehicle(Vehicle vehicle);
}
