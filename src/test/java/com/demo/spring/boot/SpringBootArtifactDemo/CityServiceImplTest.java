package com.demo.spring.boot.SpringBootArtifactDemo;

import com.demo.spring.boot.SpringBootArtifactDemo.repositories.CityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
