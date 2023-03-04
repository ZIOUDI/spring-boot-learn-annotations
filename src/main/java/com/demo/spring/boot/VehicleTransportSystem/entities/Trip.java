package com.demo.spring.boot.VehicleTransportSystem.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "trip")
public class Trip  /* voyage */{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime departureDateTime;
    private City departureCity;
    private City destinationCity;

     private Date departureDate;
    private Date arrivalDate;
    private List<Vehicle> vehicles;

    private List<Segment> segments;
}
