package com.demo.spring.boot.SpringBootArtifactDemo.controllers;

import com.demo.spring.boot.SpringBootArtifactDemo.dto.DriverDTO;
import com.demo.spring.boot.SpringBootArtifactDemo.entities.Driver;
import com.demo.spring.boot.SpringBootArtifactDemo.services.interfaces.DriverService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/drivers")
public class DriverController {

    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    /**
     * Cette méthode renvoie une liste de tous les conducteurs.
     *
     * @return une liste de DriverDTO représentant tous les conducteurs
     */
    @GetMapping
    public List<DriverDTO> getAllDrivers() {
        List<DriverDTO> drivers = driverService.getAllDrivers();
        return drivers;
    }

    /**
     * Cette méthode renvoie un conducteur spécifique en utilisant son ID.
     *
     * @param id l'ID du conducteur à récupérer
     * @return un DriverDTO représentant le conducteur spécifique
     * @throws java.util.NoSuchElementException si le conducteur n'est pas trouvé
     */
    @GetMapping("/{id}")
    public DriverDTO getDriverById(@PathVariable int id) {
        DriverDTO driver = driverService.getDriverById(id);
        return driver;
    }

    /**
     * Cette méthode ajoute un nouveau conducteur à la base de données.
     *
     * @param driverDTO un DriverDTO représentant le nouveau conducteur
     * @return un DriverDTO représentant le conducteur ajouté
     */
    @PostMapping
    public DriverDTO addDriver(@RequestBody DriverDTO driverDTO) {
        DriverDTO newDriver = driverService.createDriver(driverDTO);
        return newDriver;
    }

    /**
     * Cette méthode met à jour les informations d'un conducteur spécifique en utilisant son ID.
     *
     * @param id l'ID du conducteur à mettre à jour
     * @param driverDTO un DriverDTO représentant les nouvelles informations du conducteur
     * @return un DriverDTO représentant le conducteur mis à jour
     * @throws java.util.NoSuchElementException si le conducteur n'est pas trouvé
     */
    @PutMapping("/{id}")
    public DriverDTO updateDriver(@PathVariable int id, @RequestBody DriverDTO driverDTO) {
        DriverDTO updatedDriver = driverService.updateDriver(id, driverDTO);
        return updatedDriver;
    }

    /**
     * Cette méthode supprime un conducteur spécifique en utilisant son ID.
     *
     * @param id l'ID du conducteur à supprimer
     * @throws java.util.NoSuchElementException si le conducteur n'est pas trouvé
     */
    @DeleteMapping("/{id}")
    public void deleteDriver(@PathVariable int id) {
        driverService.deleteDriver(id);
    }
}

