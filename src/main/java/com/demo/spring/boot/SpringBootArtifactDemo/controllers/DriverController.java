package com.demo.spring.boot.SpringBootArtifactDemo.controllers;

import com.demo.spring.boot.SpringBootArtifactDemo.entities.Driver;
import com.demo.spring.boot.SpringBootArtifactDemo.services.interfaces.DriverService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/drivers")
public class DriverController {
    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    // Endpoint pour récupérer un chauffeur par son ID
    @GetMapping("/{id}")
    public Driver getDriverById(@PathVariable int id) {
        return driverService.getDriverById(id);
    }

    // Endpoint pour créer un chauffeur
    @PostMapping("")
    public Driver createDriver(@RequestBody Driver driver) {
        return driverService.createDriver(driver);
    }
}


