package com.demo.spring.boot.VehicleTransportSystem.mainApplication.services.interfaces;

import com.demo.spring.boot.VehicleTransportSystem.mainApplication.entities.Trip;

public interface TripService {
    Trip getTripById(Long id);

    Trip createTrip(Trip trip);
}
