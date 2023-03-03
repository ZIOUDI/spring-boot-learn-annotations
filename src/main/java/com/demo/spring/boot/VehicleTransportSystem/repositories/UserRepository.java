package com.demo.spring.boot.VehicleTransportSystem.repositories;

import com.demo.spring.boot.VehicleTransportSystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}