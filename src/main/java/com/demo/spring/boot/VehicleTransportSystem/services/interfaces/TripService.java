package com.demo.spring.boot.VehicleTransportSystem.services.interfaces;

import com.demo.spring.boot.VehicleTransportSystem.entities.Trip;

public interface TripService {
    Trip getTripById(Long id);

    Trip createTrip(Trip trip);
}
