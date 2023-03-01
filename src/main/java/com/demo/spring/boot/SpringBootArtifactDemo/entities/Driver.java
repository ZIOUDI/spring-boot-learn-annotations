package com.demo.spring.boot.SpringBootArtifactDemo.entities;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
    @Getter
    @Setter
    @AllArgsConstructor
    public class Driver {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String email;

        public Driver(String phoneNumber, String firstName, String lastName) {
            this.phoneNumber = phoneNumber;
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }



