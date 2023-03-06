package com.demo.spring.boot.VehicleTransportSystem.mainApplication.services.implementations;

import com.demo.spring.boot.VehicleTransportSystem.mainApplication.entities.Vehicle;
import com.demo.spring.boot.VehicleTransportSystem.mainApplication.repositories.VehicleRepository;
import com.demo.spring.boot.VehicleTransportSystem.mainApplication.services.interfaces.VehicleService;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {
    private final VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle getVehicleById(Long id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
}
