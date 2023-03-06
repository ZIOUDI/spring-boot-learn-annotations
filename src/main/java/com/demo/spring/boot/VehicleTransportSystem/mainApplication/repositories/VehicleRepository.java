package com.demo.spring.boot.VehicleTransportSystem.mainApplication.repositories;

import com.demo.spring.boot.VehicleTransportSystem.mainApplication.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
