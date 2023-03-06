package com.demo.spring.boot.VehicleTransportSystem.mainApplication.mappers.interfaces;

import com.demo.spring.boot.VehicleTransportSystem.mainApplication.dto.CityDTO;
import com.demo.spring.boot.VehicleTransportSystem.mainApplication.entities.City;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CityMapper {

    public CityDTO toDto(City city) {
        CityDTO cityDTO = new CityDTO();
        cityDTO.setId(city.getId());
        cityDTO.setName(city.getName());
        cityDTO.setCountry(city.getCountry());
        cityDTO.setReference(city.getReference());
        return cityDTO;
    }

    public List<CityDTO> toDtoList(List<City> cities) {
        List<CityDTO> cityDTOs = new ArrayList<>();
        for (City city : cities) {
            cityDTOs.add(toDto(city));
        }
        return cityDTOs;
    }

    public City toEntity(CityDTO cityDTO) {
        City city = new City();
        city.setId(cityDTO.getId());
        city.setName(cityDTO.getName());
        city.setCountry(cityDTO.getCountry());
        city.setReference(cityDTO.getReference());
        return city;
    }

}
