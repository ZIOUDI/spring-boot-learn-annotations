package com.demo.spring.boot.SpringBootArtifactDemo.services.implementations;

import com.demo.spring.boot.SpringBootArtifactDemo.entities.City;
import com.demo.spring.boot.SpringBootArtifactDemo.repositories.CityRepository;
import com.demo.spring.boot.SpringBootArtifactDemo.services.interfaces.CityService;
import org.springframework.stereotype.Service;


@Service
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public City getCityByNameAndCountry(String name, String country) {
        return cityRepository.findByNameAndCountry(name, country);
    }

    @Override
    public City createCity(City city) {
        return cityRepository.save(city);
    }
}

