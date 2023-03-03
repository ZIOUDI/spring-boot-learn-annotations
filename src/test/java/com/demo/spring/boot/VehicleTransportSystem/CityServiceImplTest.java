package com.demo.spring.boot.VehicleTransportSystem;

import com.demo.spring.boot.VehicleTransportSystem.repositories.CityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertNotNull;

//@SpringBootTest
class CityServiceImplTest {

    @Autowired
    private CityRepository cityRepository;

    @Test
    void testCityRepository() {
        assertNotNull(cityRepository);
    }

    // autres tests
}
