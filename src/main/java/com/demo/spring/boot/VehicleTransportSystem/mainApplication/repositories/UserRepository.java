package com.demo.spring.boot.VehicleTransportSystem.mainApplication.repositories;

import com.demo.spring.boot.VehicleTransportSystem.mainApplication.entities.User_Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User_Entity, Long> {

    User_Entity findByEmail(String email);
}