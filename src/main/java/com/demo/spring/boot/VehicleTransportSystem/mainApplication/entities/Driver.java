package com.demo.spring.boot.VehicleTransportSystem.mainApplication.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
//import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "driver")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;


    private String phoneNumber;
    private String email;




     @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Trip> trips;
    @OneToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

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



