package com.demo.spring.boot.VehicleTransportSystem.exceptions;

public class CityNotFoundException extends RuntimeException {

    public CityNotFoundException(Long id) {
        super("La ville avec l'ID " +   id  + " n'a pas été trouvée.");
    }
}
