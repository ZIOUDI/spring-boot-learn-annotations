package com.demo.spring.boot.SpringBootArtifactDemo.services.implementations;

import com.demo.spring.boot.SpringBootArtifactDemo.entities.Driver;
import com.demo.spring.boot.SpringBootArtifactDemo.repositories.DriverRepository;
import com.demo.spring.boot.SpringBootArtifactDemo.services.interfaces.DriverService;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {
    private final DriverRepository driverRepository;

    public DriverServiceImpl(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @Override
    public Driver getDriverById(int id) {
        return driverRepository.findById(id).orElse(null);
    }

    @Override
    public Driver createDriver(Driver driver) {
        return driverRepository.save(driver);
    }
}
