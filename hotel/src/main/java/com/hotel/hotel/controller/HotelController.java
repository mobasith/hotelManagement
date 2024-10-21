package com.hotel.hotel.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.hotel.entity.Hotel;
import com.hotel.hotel.service.HotelService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    //create new hotel
    @PostMapping("")
    public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.addNewHotel(hotel)); 
    }

    //get all hotels
    @GetMapping()
    public ResponseEntity<List<Hotel>> getAllHotels(){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAllHotels()); 
    }

    //get hotel by Id
    @GetMapping("/{hId}")
    public ResponseEntity<Hotel> getHotel(@PathVariable("hId") String hId) {
       return ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotel(hId)); 
    }
}
