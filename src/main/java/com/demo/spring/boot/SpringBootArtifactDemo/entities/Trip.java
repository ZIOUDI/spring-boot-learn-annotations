package com.demo.spring.boot.SpringBootArtifactDemo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Trip {
    private int id;
    private LocalDateTime departureDateTime;
    private City departureCity;
    private City destinationCity;
    private List<Segment> segments;
}
