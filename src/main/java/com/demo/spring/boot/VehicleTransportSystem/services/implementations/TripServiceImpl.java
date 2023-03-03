package com.demo.spring.boot.VehicleTransportSystem.services.implementations;

import com.demo.spring.boot.VehicleTransportSystem.entities.Trip;
import com.demo.spring.boot.VehicleTransportSystem.repositories.TripRepository;
import com.demo.spring.boot.VehicleTransportSystem.services.interfaces.TripService;
import org.springframework.stereotype.Service;

@Service
public class TripServiceImpl implements TripService {
    private final TripRepository tripRepository;

    public TripServiceImpl(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    @Override
    public Trip getTripById(Long id) {
        return tripRepository.findById(id).orElse(null);
    }

    @Override
    public Trip createTrip(Trip trip) {
        return tripRepository.save(trip);
    }
}
