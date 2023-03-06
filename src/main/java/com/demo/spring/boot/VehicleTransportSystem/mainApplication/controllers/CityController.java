package com.demo.spring.boot.VehicleTransportSystem.mainApplication.controllers;


import com.demo.spring.boot.VehicleTransportSystem.mainApplication.dto.CityDTO;
import com.demo.spring.boot.VehicleTransportSystem.mainApplication.entities.City;
import com.demo.spring.boot.VehicleTransportSystem.mainApplication.exceptions.CityNotFoundException;
import com.demo.spring.boot.VehicleTransportSystem.mainApplication.mappers.interfaces.CityMapper;
import com.demo.spring.boot.VehicleTransportSystem.mainApplication.services.interfaces.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cities")
 // @Api(tags = " City -------------------------")
public class CityController {

    @Autowired
    private CityService cityService;

    @Autowired
    private CityMapper cityMapper;

    // Endpoint pour récupérer toutes les villes
    @GetMapping
    public List<CityDTO> getCities() {
        List<City> cities = cityService.getAllCities();
        return cityMapper.toDtoList(cities);
    }

    // Endpoint pour récupérer une ville par son id
    @GetMapping("/{id}")
    public CityDTO getCityById(@PathVariable Long id) throws CityNotFoundException {
        City city = cityService.getCityById(id);
        return cityMapper.toDto(city);
    }

    // Endpoint pour ajouter une nouvelle ville
    @PostMapping
    public CityDTO createCity(@RequestBody CityDTO cityDTO) {
        City city = cityMapper.toEntity(cityDTO);
        city = cityService.createCity(city);
        return cityMapper.toDto(city);
    }

    // Endpoint pour mettre à jour une ville existante
    @PutMapping("/{id}")
    public CityDTO updateCity(@PathVariable Long id, @RequestBody CityDTO cityDTO) throws CityNotFoundException {
        City cityToUpdate = cityService.getCityById(id);
        City city = cityMapper.toEntity(cityDTO);
        city.setId(cityToUpdate.getId());
        city = cityService.updateCity(id, city);
        return cityMapper.toDto(city);
    }

    // Endpoint pour supprimer une ville existante
    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable Long id) throws CityNotFoundException {
        cityService.deleteCityById(id);
    }
}

