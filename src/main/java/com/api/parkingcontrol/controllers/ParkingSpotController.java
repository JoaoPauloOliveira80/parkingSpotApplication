package com.api.parkingcontrol.controllers;

import java.security.Provider.Service;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositores.ParkingSpotRepository;

import jakarta.validation.Valid;



@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("")
public class ParkingSpotController {

  @Autowired
  private ParkingSpotRepository parkingSpotRepository;
  
  @GetMapping("/listar")
  public List<ParkingSpotModel> listar(){
    
    return  parkingSpotRepository.findAll();
  }

  @RequestMapping(value = "/cadastrar", method =  RequestMethod.POST)
  public ParkingSpotModel  Post(@Valid @RequestBody ParkingSpotModel p){
    return parkingSpotRepository.save(p);
  }

  @PostMapping("/cadastrar")
 // @ResponseStatus(code = HttpStatus.CREATED)
  public ParkingSpotModel cadastrar(@RequestBody ParkingSpotModel p){
       
       return parkingSpotRepository.save(p);
  } 
}
