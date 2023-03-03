package com.demo.spring.boot.VehicleTransportSystem.services.implementations;

import com.demo.spring.boot.VehicleTransportSystem.entities.City;
import com.demo.spring.boot.VehicleTransportSystem.exceptions.CityAlreadyExistsException;
import com.demo.spring.boot.VehicleTransportSystem.exceptions.CityNotFoundException;
import com.demo.spring.boot.VehicleTransportSystem.repositories.CityRepository;
import com.demo.spring.boot.VehicleTransportSystem.services.interfaces.CityService;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


@Service
public class CityServiceImpl implements CityService {

    // Injection du CityRepository
    @Autowired
    private CityRepository cityRepository;

    // Méthode pour créer une nouvelle ville
    @Override
    public City createCity(City city) {
        // Vérifier si la ville existe déjà dans la base de données
        if (cityRepository.findByName(city.getName()) != null) {
            throw new CityAlreadyExistsException("La ville " + city.getName() + " existe déjà.");
        }
        // Sauvegarder la ville dans la base de données
        return cityRepository.save(city);
    }

    // Méthode pour récupérer une ville par son ID
    @Override
    public City getCityById(Long id) {
        // Vérifier si la ville existe dans la base de données
        Optional<City> city = cityRepository.findById(id);
        if (city.isPresent()) {
            return city.get();
        } else {
            throw new CityNotFoundException( id  );
        }
    }

    // Méthode pour mettre à jour une ville existante
    @Override
    public City updateCity(Long id, City updatedCity) {
        // Vérifier si la ville existe dans la base de données
        Optional<City> city = cityRepository.findById(id);
        if (city.isPresent()) {
            // Vérifier si une autre ville existe déjà avec le même nom

            Optional<City> existingCity = cityRepository.findByName(updatedCity.getName());
            if (existingCity.isPresent() && !existingCity.get().getId().equals(id)) {
                throw new CityAlreadyExistsException("Une autre ville avec le nom " + updatedCity.getName() + " existe déjà.");
            }

            // Mettre à jour les attributs de la ville existante
            City cityToUpdate = city.get();
            cityToUpdate.setName(updatedCity.getName());
            cityToUpdate.setReference(updatedCity.getReference());
            cityToUpdate.setCountry(updatedCity.getCountry());
             // Sauvegarder les modifications dans la base de données
            return cityRepository.save(cityToUpdate);
        } else {
            throw new CityNotFoundException( id  );
        }
    }

    // Méthode pour supprimer une ville existante
    @Override
    public void deleteCityById(Long id) {
        // Vérifier si la ville existe dans la base de données
        if (cityRepository.existsById(id)) {
            // Supprimer la ville de la base de données
            cityRepository.deleteById(id);
        } else {
            throw new CityNotFoundException( id );
        }
    }

    // Méthode pour récupérer toutes les villes dans la base de données
    @Override
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }
}

