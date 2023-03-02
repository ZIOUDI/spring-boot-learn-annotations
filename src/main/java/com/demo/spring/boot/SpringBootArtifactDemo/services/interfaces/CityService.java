package com.demo.spring.boot.SpringBootArtifactDemo.services.interfaces;

import com.demo.spring.boot.SpringBootArtifactDemo.dto.CityDTO;
import com.demo.spring.boot.SpringBootArtifactDemo.entities.City;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CityService {

    // Méthode pour créer une nouvelle ville
    City createCity(City city);

    // Méthode pour récupérer une ville par son ID
    City getCityById(Long id);

    // Méthode pour mettre à jour une ville existante
    City updateCity(Long id, City updatedCity);

    // Méthode pour supprimer une ville existante
    void deleteCityById(Long id);

    // Méthode pour récupérer toutes les villes dans la base de données
    List<City> getAllCities();
}
