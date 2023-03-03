package com.demo.spring.boot.VehicleTransportSystem.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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




    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String email;


        private Builder() {}

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

        public DriverDTO build() {

            DriverDTO driverDTO = new DriverDTO();

            driverDTO.setId(id);
            driverDTO.setFirstName( firstName);
            driverDTO.setLastName(lastName);
            driverDTO.setPhoneNumber(phoneNumber);
            driverDTO.setEmail(email);

            return driverDTO;
        }
    }


}
