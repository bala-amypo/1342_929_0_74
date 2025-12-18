package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class Vehicle {
    @Id
    private Long id;
    @Column(unique=true)
    private String vehicleNumber;
    @Min(100)
    private Double capacityKg;
    @Max(10000)
    private Double fuelEfficiency;


}
