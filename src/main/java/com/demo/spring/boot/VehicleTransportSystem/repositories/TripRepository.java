package com.demo.spring.boot.VehicleTransportSystem.repositories;

import com.demo.spring.boot.VehicleTransportSystem.entities.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
}
