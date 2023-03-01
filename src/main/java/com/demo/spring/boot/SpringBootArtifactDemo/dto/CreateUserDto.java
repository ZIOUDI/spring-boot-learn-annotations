package com.demo.spring.boot.SpringBootArtifactDemo.dto;

import lombok.Getter;
import lombok.Setter;

//
// @Data
@Getter
@Setter
public class CreateUserDto {

    private String name;

    private String email;

    private String password;

    // constructeurs, getters et setters
}