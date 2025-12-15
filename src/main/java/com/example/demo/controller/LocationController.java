package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Location;
import com.example.demo.service.LocationService;

@RestController

public class LocationController {
    @Autowired
    LocationService lcs;

    // public LocationController(LocationService lcs){
    //     this.lcs=lcs;
    // }

    @PostMapping("/locations")
    public Location addLocation(@RequestBody Location loc){
        return lcs.createLocation(loc);
    }

    @GetMapping("/locations")
    public List<Location> getAll(){
        return lcs.getAllLocations();
    }
}