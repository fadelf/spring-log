package com.delfa.springbootlogging.model;

import jakarta.persistence.*;

@Entity
@Table(
        name = "airline",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "airlineNumber")
        }
)
public class Airline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "airline_name", nullable = false, length = 100)
    private String airlineName;

    @Column(name = "airline_number", nullable = false, length = 20)
    private String airlineNumber;

    @Column(nullable = false, length = 10)
    private String origin;

    @Column(nullable = false, length = 10)
    private String destination;

    // === constructor ===
    public Airline() {}

    // === getter & setter ===
    public Long getId() {
        return id;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineNumber() {
        return airlineNumber;
    }

    public void setAirlineNumber(String airlineNumber) {
        this.airlineNumber = airlineNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}

