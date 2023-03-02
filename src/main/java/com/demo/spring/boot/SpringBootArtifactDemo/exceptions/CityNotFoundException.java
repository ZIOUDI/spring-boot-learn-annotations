package com.demo.spring.boot.SpringBootArtifactDemo.exceptions;

public class CityNotFoundException extends RuntimeException {

    public CityNotFoundException(Integer id) {
        super("La ville avec l'ID " +   id  + " n'a pas été trouvée.");
    }
}
