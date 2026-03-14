package com.example.emp_parking.model;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    private ParkingSpace parkingSpace;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParkingSpace(ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }
}