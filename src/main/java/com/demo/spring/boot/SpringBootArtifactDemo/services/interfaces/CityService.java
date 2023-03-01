package com.demo.spring.boot.SpringBootArtifactDemo.services.interfaces;

import com.demo.spring.boot.SpringBootArtifactDemo.entities.City;

public interface CityService {
    City getCityByNameAndCountry(String name, String country);

    City createCity(City city);
}
