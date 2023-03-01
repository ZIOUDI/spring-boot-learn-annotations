package com.demo.spring.boot.SpringBootArtifactDemo.repositories;

import com.demo.spring.boot.SpringBootArtifactDemo.entities.City;
import com.demo.spring.boot.SpringBootArtifactDemo.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
    City findByNameAndCountry(String name, String country);
}
