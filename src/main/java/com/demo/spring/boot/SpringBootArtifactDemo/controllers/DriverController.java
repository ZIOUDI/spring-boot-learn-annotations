package com.demo.spring.boot.SpringBootArtifactDemo.controllers;

import com.demo.spring.boot.SpringBootArtifactDemo.dto.DriverDTO;
import com.demo.spring.boot.SpringBootArtifactDemo.entities.Driver;
import com.demo.spring.boot.SpringBootArtifactDemo.mappers.interfaces.DriverMapper;
import com.demo.spring.boot.SpringBootArtifactDemo.services.interfaces.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/drivers")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @Autowired
    private DriverMapper driverMapper;

    // Endpoint pour récupérer tous les conducteurs
    @GetMapping
    public List<DriverDTO> getAllDrivers() {
         return driverService.getAllDrivers();
    }

    // Endpoint pour récupérer un conducteur par son identifiant
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Driver>> getDriverById(@PathVariable Long id) {
        Optional<Driver> driverDTO  = driverService.getDriverById(id);
        if (driverDTO == null) {
            return ResponseEntity.notFound().build();
        }
         return ResponseEntity.ok(driverDTO);
    }

    // Endpoint pour créer un nouveau conducteur
    @PostMapping
    public ResponseEntity<DriverDTO> createDriver(@RequestBody DriverDTO driverDTO) {
        Driver driver = driverMapper.toEntity(driverDTO);     // Conversion du DTO en entité OK
        Driver createdDriver = driverService.createDriver(driver);          // Appel de la méthode de création du driver dans la couche Service
        driverDTO = driverMapper.toDto(createdDriver);              // Conversion de l'entité en DTO

        // Retour de la réponse avec le DTO du driver créé
        return ResponseEntity.status(HttpStatus.CREATED).body(driverDTO);
    }

    // Endpoint pour mettre à jour un conducteur existant
    @PutMapping("/{id}")
    public ResponseEntity<DriverDTO> updateDriver(@PathVariable Long id, @RequestBody DriverDTO driverDTO) {
        Optional<Driver> existingDriver = driverService.getDriverById(id);
        if (existingDriver == null) {
            return ResponseEntity.notFound().build();
        }
        Driver driver = driverMapper.toEntity(driverDTO);
        driver.setId(id);
        driver = driverService.updateDriver(id, driver);
        driverDTO = driverMapper.toDto(driver);
        return ResponseEntity.ok(driverDTO);
    }

    // Endpoint pour supprimer un conducteur existant
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDriver(@PathVariable Long id) {
        Optional<Driver> existingDriver = driverService.getDriverById(id);
        if (existingDriver == null) {
            return ResponseEntity.notFound().build();
        }
        driverService.deleteDriverById(id);
        return ResponseEntity.noContent().build();
    }
}
