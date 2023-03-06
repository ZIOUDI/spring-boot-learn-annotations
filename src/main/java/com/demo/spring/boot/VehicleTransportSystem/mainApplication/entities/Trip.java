package com.demo.spring.boot.VehicleTransportSystem.mainApplication.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
@NoArgsConstructor
public class Trip  /* voyage */{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime departureDateTime;
      @ManyToOne
      @JoinColumn(name = "departure_city_id")
      private City departureCity;

     @ManyToOne
     @JoinColumn(name = "destination_city_id")
     private City destinationCity;

     private Date departureDate;
    private Date arrivalDate;


    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

}
