package com.api.parkingcontrol.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_PARKING_SPOT")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSpotModel  implements Serializable{
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;

    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;
    
    @Column(nullable = false, unique = true, length = 70)
    private String brabdCar;

    @Column(nullable = false, unique = true, length = 70)
    private String modelCar;

    @Column(nullable = false, unique = true, length = 70)
    private String colorCar;

    @Column(nullable = false)
    private LocalDateTime registrationDate;

    @Column(nullable = false,  length = 130)
    private String responsibleName;

    @Column(nullable = false,  length = 30)
    private String apartment;

    @Column(nullable = false,  length = 30)
    private String block;

    
}
