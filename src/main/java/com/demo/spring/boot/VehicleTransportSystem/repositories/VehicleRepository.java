package com.demo.spring.boot.VehicleTransportSystem.repositories;

import com.demo.spring.boot.VehicleTransportSystem.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
