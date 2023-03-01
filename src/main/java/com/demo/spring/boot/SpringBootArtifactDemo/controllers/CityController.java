package com.demo.spring.boot.SpringBootArtifactDemo.controllers;


import com.demo.spring.boot.SpringBootArtifactDemo.entities.City;
import com.demo.spring.boot.SpringBootArtifactDemo.services.interfaces.CityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cities")
public class CityController {
    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    // Endpoint pour récupérer une ville par son nom et son pays
    @GetMapping("/{name}/{country}")
    public City getCityByNameAndCountry(@PathVariable String name, @PathVariable String country) {
        return cityService.getCityByNameAndCountry(name, country);
    }

    // Endpoint pour créer une ville
    @PostMapping("")
    public City createCity(@RequestBody City city) {
        return cityService.createCity(city);
    }
}
