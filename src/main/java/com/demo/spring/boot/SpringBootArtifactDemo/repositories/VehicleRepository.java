package com.demo.spring.boot.SpringBootArtifactDemo.repositories;

import com.demo.spring.boot.SpringBootArtifactDemo.entities.Driver;
import com.demo.spring.boot.SpringBootArtifactDemo.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
