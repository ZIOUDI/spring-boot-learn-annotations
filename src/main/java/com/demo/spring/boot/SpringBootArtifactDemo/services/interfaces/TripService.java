package com.demo.spring.boot.SpringBootArtifactDemo.services.interfaces;

import com.demo.spring.boot.SpringBootArtifactDemo.entities.Trip;

public interface TripService {
    Trip getTripById(Long id);

    Trip createTrip(Trip trip);
}
