package com.demo.spring.boot.SpringBootArtifactDemo;

import com.demo.spring.boot.SpringBootArtifactDemo.entities.Driver;
import com.demo.spring.boot.SpringBootArtifactDemo.repositories.DriverRepository;
import com.demo.spring.boot.SpringBootArtifactDemo.services.implementations.DriverServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class DriverServiceImplTest {

    @Mock
    private DriverRepository driverRepository;

    @InjectMocks
    private DriverServiceImpl driverService;


    @Test
    void testDriverRepository() {
        assertNotNull(driverRepository);
    }

    /*
    @Test
    public void testCreateDriver() throws DriverAlreadyExistsException {
        // Given
        DriverDTO driverDTO = new DriverDTO();
        driverDTO.setLastName("John Doe");
        driverDTO.setLicenseNumber("ABC123");
        Driver driver = new Driver();
        driver.setId(1);
        driver.setLastName("John Doe");
        driver.setLicenseNumber("ABC123");
        when(driverRepository.save(any(Driver.class))).thenReturn(driver);

        // When
        Driver createdDriver = driverService.createDriver(driverDTO);

        // Then
        assertNotNull(createdDriver);
        assertEquals(driver.getName(), createdDriver.getName());
        assertEquals(driver.getLicenseNumber(), createdDriver.getLicenseNumber());
    }

    @Test(expected = DriverAlreadyExistsException.class)
    public void testCreateDriverThrowsException() throws DriverAlreadyExistsException {
        // Given
        DriverDTO driverDTO = new DriverDTO();
        driverDTO.setLastName("John Doe");
        driverDTO.setLicenseNumber("ABC123");
        Driver driver = new Driver();
        driver.setId(1);
        driver.setLastName("John Doe");
        driver.setLicenseNumber("ABC123");
        when(driverRepository.findByName(driverDTO.getName())).thenReturn(driver);

        // When
        driverService.createDriver(driverDTO);

        // Then
        // Exception is thrown
    }

    @Test
    public void testUpdateDriver() throws DriverNotFoundException {
        // Given
        Long driverId = 1;
        DriverDTO updatedDriverDTO = new DriverDTO();
        updatedDriverDTO.setLastName("John Doe");
        updatedDriverDTO.setLicenseNumber("DEF456");
        Driver existingDriver = new Driver();
        existingDriver.setId(driverId);
        existingDriver.setLastName("John Doe");
        existingDriver.setLicenseNumber("ABC123");
        when(driverRepository.findById(driverId)).thenReturn(Optional.of(existingDriver));
        when(driverRepository.save(any(Driver.class))).thenReturn(existingDriver);

        // When
        Driver updatedDriver = driverService.updateDriver(driverId, updatedDriverDTO);

        // Then
        assertNotNull(updatedDriver);
        assertEquals(driverId, updatedDriver.getId());
        assertEquals(updatedDriverDTO.getName(), updatedDriver.getName());
        assertEquals(updatedDriverDTO.getLicenseNumber(), updatedDriver.getLicenseNumber());
    }

    @Test(expected = DriverNotFoundException.class)
    public void testUpdateDriverThrowsException() throws DriverNotFoundException {
        // Given
        Long driverId = 1;
        DriverDTO updatedDriverDTO = new DriverDTO();
        updatedDriverDTO.setLastName("John Doe");
        updatedDriverDTO.setLicenseNumber("DEF456");
        when(driverRepository.findById(driverId)).thenReturn(Optional.empty());

        // When
        driverService.updateDriver(driverId, updatedDriverDTO);

        // Then
        // Exception is thrown
    }

    @Test
    public void testDeleteDriverById() throws DriverNotFoundException {
        // Given
        Long driverId = 1;
        Driver existingDriver = new Driver();
        existingDriver.setId(driverId);
        existingDriver.setLastName("John Doe");
        existingDriver.setLicenseNumber("ABC123");
        when(driverRepository.findById(driverId)).thenReturn(Optional.of(existingDriver));
        doNothing().when(driverRepository).deleteById(driverId);

        // When
        driverService.deleteDriverById(driverId);

        // Then
        verify(driverRepository, times(1)).deleteById(driverId);
    }

    @Test
    public void testDeleteDriverByIdThrowsException() {
        // given
        Long id = 1;
        when(driverRepository.findById(id)).thenReturn(Optional.empty());

        // when, then
        assertThrows(DriverNotFoundException.class, () -> driverService.deleteDriverById(id));
        verify(driverRepository, times(1)).findById(id);
        verify(driverRepository, never()).deleteById(id);
    }



        @Test
        public void testUpdateDriverWithExistingEmail() {
            // Arrange
            Driver driverToUpdate = new Driver(1, "John", "Doe", "johndoe@gmail.com");
            Driver updatedDriver = new Driver(1, "John", "Doe", "janedoe@gmail.com");
            when(driverRepository.findById(1)).thenReturn(Optional.of(driverToUpdate));
            when(driverRepository.findByEmail(updatedDriver.getEmail())).thenReturn(Optional.of(new Driver()));

            // Act and assert
            assertThrows(DriverAlreadyExistsException.class, () -> driverService.updateDriver(1, updatedDriver));
        }

        @Test
        public void testUpdateDriverWithNonExistingEmail() {
            // Arrange
            Driver driverToUpdate = new Driver(1, "John", "Doe", "johndoe@gmail.com");
            Driver updatedDriver = new Driver(1, "John", "Doe", "janedoe@gmail.com");
            when(driverRepository.findById(1)).thenReturn(Optional.of(driverToUpdate));
            when(driverRepository.findByEmail(updatedDriver.getEmail())).thenReturn(Optional.empty());
            when(driverRepository.save(updatedDriver)).thenReturn(updatedDriver);

            // Act
            Driver result = driverService.updateDriver(1, updatedDriver);

            // Assert
            assertEquals(updatedDriver, result);
        }

        @Test
        public void testDeleteDriverById() {
            // Arrange
            Long driverId = 1;
            Driver driverToDelete = new Driver(driverId, "John", "Doe", "johndoe@gmail.com");
            when(driverRepository.findById(driverId)).thenReturn(Optional.of(driverToDelete));

            // Act
            driverService.deleteDriverById(driverId);

            // Assert
            verify(driverRepository, times(1)).deleteById(driverId);
        }

        @Test
        public void testDeleteDriverByIdWithNonExistingDriver() {
            // Arrange
            Long driverId = 1;
            when(driverRepository.findById(driverId)).thenReturn(Optional.empty());

            // Act and assert
            assertThrows(DriverNotFoundException.class, () -> driverService.deleteDriverById(driverId));
        }

        */
    }
