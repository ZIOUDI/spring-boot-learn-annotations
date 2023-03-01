package com.demo.spring.boot.SpringBootArtifactDemo.dto;

import lombok.Data;
import lombok.Getter;
@Data
public class DriverDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    public DriverDTO(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
