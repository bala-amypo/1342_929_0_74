package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Negative;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class Vehicle {
    @Id
    private Long id;
    @Column(unique=true)
    private String vehicleNumber;
    @Min(100)
    private Double capacityKg;
    @Max(10000)
    private Double fuelEfficiency;
    @Size(min = 1,max=10)
    private String name;
    @Positive
    private int rollno;
    @Negative
    private float remainder;
    @PositiveOrZero
    private Double value;

}
