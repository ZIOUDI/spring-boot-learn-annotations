package com.demo.spring.boot.VehicleTransportSystem.entities;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

//@Entity
//@Table(name = "users")
//@Data
@Getter
@Setter
public class User {


        @Id // Indique que cette propriété est la clé primaire de l'entité
       // @GeneratedValue(strategy = GenerationType.IDENTITY) // Indique que la valeur de cette propriété est générée automatiquement
       private Long id;

        @Column(nullable = false, unique = true)
        private String email;

        @Column(nullable = false)
        private String password;

        @Column(nullable = false)
        private String firstName;

        @Column(nullable = false)
        private String lastName;
}
