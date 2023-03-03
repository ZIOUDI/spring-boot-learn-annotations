package com.demo.spring.boot.VehicleTransportSystem.repositories;

import com.demo.spring.boot.VehicleTransportSystem.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
      Optional<Driver> findById( Long id);
 }
