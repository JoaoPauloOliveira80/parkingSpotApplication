package com.api.parkingcontrol.services;


import org.springframework.stereotype.Service;

import com.api.parkingcontrol.repositores.ParkingSpotRepository;

@Service
public class ParkingSpotServices {   
    
    final ParkingSpotRepository repository;

    public ParkingSpotServices(ParkingSpotRepository parkingSpotRepository){
        this.repository = parkingSpotRepository;
    }
}
