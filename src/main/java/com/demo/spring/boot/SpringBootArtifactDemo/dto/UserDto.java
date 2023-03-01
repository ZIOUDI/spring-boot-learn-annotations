package com.demo.spring.boot.SpringBootArtifactDemo.dto;

import com.demo.spring.boot.SpringBootArtifactDemo.entities.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private String email;

    private String password;

    private String firstName;

    private String lastName;


    // getters et setters
}
