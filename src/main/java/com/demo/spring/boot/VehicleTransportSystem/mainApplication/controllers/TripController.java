package com.demo.spring.boot.VehicleTransportSystem.mainApplication.controllers;

import com.demo.spring.boot.VehicleTransportSystem.mainApplication.entities.Trip;
import com.demo.spring.boot.VehicleTransportSystem.mainApplication.services.interfaces.TripService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trips")
public class TripController {
    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    // Endpoint pour récupérer un voyage par son ID
    @GetMapping("/{id}")
    public Trip getTripById(@PathVariable Long id) {
        return tripService.getTripById(id);
    }

    // Endpoint pour créer un voyage
    @PostMapping("")
    public Trip createTrip(@RequestBody Trip trip) {
        return tripService.createTrip(trip);
    }
}
