package com.demo.spring.boot.VehicleTransportSystem.repositories;

import com.demo.spring.boot.VehicleTransportSystem.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

   Optional<City> findByNameAndCountry(String name, String country);

    void deleteById(Long id);

    Optional<City> findById(Long id);

    Optional<City> findByName(String name);


}
