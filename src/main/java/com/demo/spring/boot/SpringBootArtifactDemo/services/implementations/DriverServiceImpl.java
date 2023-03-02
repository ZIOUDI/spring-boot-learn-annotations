package com.demo.spring.boot.SpringBootArtifactDemo.services.implementations;

import com.demo.spring.boot.SpringBootArtifactDemo.dto.DriverDTO;
import com.demo.spring.boot.SpringBootArtifactDemo.entities.Driver;
import com.demo.spring.boot.SpringBootArtifactDemo.mappers.interfaces.DriverMapper;
import com.demo.spring.boot.SpringBootArtifactDemo.repositories.DriverRepository;
import com.demo.spring.boot.SpringBootArtifactDemo.services.interfaces.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private DriverMapper driverMapper;

    @Override
    public List<DriverDTO> getAllDrivers() {
        List<Driver> drivers = driverRepository.findAll();
        return driverMapper.toDtoList(drivers);
    }

    @Override
    public Optional<Driver> getDriverById(Long id) {
        return driverRepository.findById(id);
     }

    @Override
    public Driver createDriver(Driver driver) {
         return driverRepository.save(driver);
    }

    @Override
    public Driver updateDriver(Long id, Driver driver) {
        Optional<Driver> existingDriverOptional = driverRepository.findById(id);
        if (existingDriverOptional.isPresent()) {
            Driver existingDriver = existingDriverOptional.get();
             driver.setId(existingDriver.getId()); // Set the ID to the existing driver's ID
            return driverRepository.save(driver);
         } else {
            throw new EntityNotFoundException("Driver with id " + id + " not found.");
        }
    }

    @Override
    public void deleteDriverById(Long id) {
        driverRepository.deleteById(id);
    }
}
