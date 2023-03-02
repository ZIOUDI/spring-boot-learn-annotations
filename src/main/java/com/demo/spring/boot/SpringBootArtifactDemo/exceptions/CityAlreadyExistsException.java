package com.demo.spring.boot.SpringBootArtifactDemo.exceptions;

public class CityAlreadyExistsException extends RuntimeException {

    public CityAlreadyExistsException(String cityName) {
        super("City with name " + cityName + " already exists.");
    }
}