package com.demo.spring.boot.VehicleTransportSystem.mainApplication.controllers;

import com.demo.spring.boot.VehicleTransportSystem.mainApplication.entities.Vehicle;
import com.demo.spring.boot.VehicleTransportSystem.mainApplication.services.interfaces.VehicleService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    // Endpoint pour récupérer un véhicule par son ID
    @GetMapping("/{id}")
    public Vehicle getVehicleById(@PathVariable Long id) {
        return vehicleService.getVehicleById(id);
    }

    // Endpoint pour créer un véhicule
    @PostMapping("")
    public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.createVehicle(vehicle);
    }
}
