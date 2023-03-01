package com.demo.spring.boot.SpringBootArtifactDemo.services.implementations;

import com.demo.spring.boot.SpringBootArtifactDemo.dto.DriverDTO;
import com.demo.spring.boot.SpringBootArtifactDemo.entities.Driver;
import com.demo.spring.boot.SpringBootArtifactDemo.repositories.DriverRepository;
import com.demo.spring.boot.SpringBootArtifactDemo.services.interfaces.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class DriverServiceImpl implements DriverService {
    private final DriverRepository driverRepository;

    @Autowired
    public DriverServiceImpl(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }
    /**
     * Cette méthode renvoie une liste de DriverDTO contenant tous les conducteurs de la base de données.
     *
     * @return une liste de DriverDTO
     */
    @Override
    public List<DriverDTO> getAllDrivers() {
        // On utilise le repository pour récupérer tous les conducteurs de la base de données
        List<Driver> drivers = driverRepository.findAll();

        // On utilise un stream pour mapper chaque Driver à un DriverDTO
        return drivers.stream()
                .map(driver -> new DriverDTO(driver.getId(), driver.getFirstName(), driver.getLastName()))
                .collect(Collectors.toList());
    }

    /**
     * Cette méthode récupère un conducteur spécifique en utilisant son ID
     * et renvoie un DriverDTO contenant les informations de ce conducteur.
     *
     * @param id l'ID du conducteur à récupérer
     * @return un DriverDTO contenant les informations du conducteur
     * @throws NoSuchElementException si le conducteur n'est pas trouvé
     */
    @Override
    public DriverDTO getDriverById(int id) {
        // On utilise le repository pour récupérer le conducteur spécifique en utilisant son ID
        Optional<Driver> driverOptional = driverRepository.findById(id);
        if (driverOptional.isPresent()) {
            // Si le conducteur est trouvé, on crée un DriverDTO avec ses informations et on le renvoie
            Driver driver = driverOptional.get();
            return new DriverDTO(driver.getId(), driver.getFirstName(), driver.getLastName());
        }
        // Si le conducteur n'est pas trouvé, on lance une exception
        throw new NoSuchElementException("Driver not found with id " + id);
    }
    /**
     * Cette méthode crée un nouveau conducteur en utilisant les informations fournies dans le DriverDTO
     * et renvoie un DriverDTO contenant les informations de ce nouveau conducteur.
     *
     * @param driverDTO les informations du nouveau conducteur
     * @return un DriverDTO contenant les informations du nouveau conducteur
     */
    @Override
    public DriverDTO createDriver(DriverDTO driverDTO) {
        // On crée un nouveau Driver avec les informations fournies dans le DriverDTO
        Driver driver = new Driver(driverDTO.getPhoneNumber(), driverDTO.getFirstName(), driverDTO.getLastName());

        // On utilise le repository pour sauvegarder le nouveau Driver dans la base de données
        driverRepository.save(driver);

        // On crée un DriverDTO avec les informations du nouveau Driver et on le renvoie
        return new DriverDTO(driver.getId(), driver.getFirstName(), driver.getLastName());
    }




    /**
     * Cette méthode met à jour les informations d'un conducteur existant en utilisant les informations fournies
     * dans le DriverDTO et renvoie un DriverDTO contenant les nouvelles informations de ce conducteur.
     *
     * @param id        l'ID du conducteur à mettre à jour
     * @param driverDTO les nouvelles informations du conducteur
     * @return un DriverDTO contenant les nouvelles informations du conducteur
     * @throws NoSuchElementException si le conducteur n'est pas trouvé
     */
    @Override
    public DriverDTO updateDriver(int id, DriverDTO driverDTO) {
        // On utilise le repository pour récupérer le conducteur spécifique en utilisant son ID
        Optional<Driver> driverOptional = driverRepository.findById(id);
        if (driverOptional.isPresent()) {
            // Si le conducteur est trouvé, on met à jour ses informations et on sauvegarde les changements
            Driver driver = driverOptional.get();
            driver.setFirstName(driverDTO.getFirstName());
            driver.setLastName(driverDTO.getLastName());
            driverRepository.save(driver);

            // On crée un DriverDTO avec les nouvelles informations du conducteur et on le renvoie
            return new DriverDTO(driver.getId(), driver.getFirstName(), driver.getLastName());
        }
        // Si le conducteur n'est pas trouvé, on lance une exception
        throw new NoSuchElementException("Driver not found with id " + id);
    }

    /**
     * Cette méthode supprime un conducteur spécifique en utilisant son ID.

     */
    @Override
    public void deleteDriver(int id) {
        // On utilise le repository pour récupérer le conducteur spécifique en utilisant son ID
        Optional<Driver> driverOptional = driverRepository.findById(id);
        if (driverOptional.isPresent()) {
            // Si le conducteur est trouvé, on le supprime de la base de données
            driverRepository.delete(driverOptional.get());
        } else {
            // Si le conducteur n'est pas trouvé, on lance une exception
            throw new NoSuchElementException("Driver not found with id " + id);
        }
    }



    }
