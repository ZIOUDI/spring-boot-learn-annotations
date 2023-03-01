package com.demo.spring.boot.SpringBootArtifactDemo.services.implementations;

import com.demo.spring.boot.SpringBootArtifactDemo.entities.Vehicle;
import com.demo.spring.boot.SpringBootArtifactDemo.repositories.VehicleRepository;
import com.demo.spring.boot.SpringBootArtifactDemo.services.interfaces.VehicleService;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {
    private final VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle getVehicleById(int id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
}
