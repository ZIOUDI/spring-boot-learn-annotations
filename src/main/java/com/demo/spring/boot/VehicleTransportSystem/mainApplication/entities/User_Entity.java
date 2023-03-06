package com.demo.spring.boot.VehicleTransportSystem.mainApplication.entities;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;


//@Data
@Getter
@Setter
@Entity
@Table(name = "user_entity")
public class User_Entity {


        @Id // Indique que cette propriété est la clé primaire de l'entité
       @GeneratedValue(strategy = GenerationType.IDENTITY) // Indique que la valeur de cette propriété est générée automatiquement
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
