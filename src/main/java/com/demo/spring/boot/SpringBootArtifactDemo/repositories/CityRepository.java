package com.demo.spring.boot.SpringBootArtifactDemo.repositories;

import com.demo.spring.boot.SpringBootArtifactDemo.dto.CityDTO;
import com.demo.spring.boot.SpringBootArtifactDemo.entities.City;
import com.demo.spring.boot.SpringBootArtifactDemo.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
    City findByNameAndCountry(String name, String country);

    void deleteById(Long id);

    //     @Query("SELECT new com.example.dto.CityDTO(c.name, c.population) FROM City c WHERE c.id = :id")
    Optional<City> findById(Long id);


    City findByName ( String lastName);
}
