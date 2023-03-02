package com.demo.spring.boot.SpringBootArtifactDemo.entities;


import com.demo.spring.boot.SpringBootArtifactDemo.dto.DriverDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
//import javax.persistence.*;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // @NotBlank(message = "Driver's first name cannot be blank")
    private String firstName;
    private String lastName;
    // @NotNull(message = "Driver's age cannot be null")
    // @Min(value = 18, message = "Driver's age must be at least 18")
    private String phoneNumber;
    private String email;
    

    // @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Trip> trips;


    public Driver(String phoneNumber, String firstName, String lastName) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public static Builder builder() {
        return new Builder();
    }

    public void setLicenseNumber(String abc123) {
    }

    public static class Builder {
        private Long id;
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String email;


        private Builder() {
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Driver build() {

            Driver driver = new Driver();

            driver.setId(id);
            driver.setFirstName(firstName);
            driver.setLastName(lastName);
            driver.setPhoneNumber(phoneNumber);
            driver.setEmail(email);

            return driver;
        }
    }

}



