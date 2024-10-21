package com.hotel.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.hotel.entity.Hotel;
import com.hotel.hotel.exceptions.ResourceNotFoundException;
import com.hotel.hotel.repo.HotelRepository;

@Service
public class HotelServiceImplementation implements HotelService{

    @Autowired
    HotelRepository hotelRepository;


    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(String hId) {
        return hotelRepository.findById(hId).orElseThrow(()-> new ResourceNotFoundException("no hotel found "));
    }

    @Override
    public Hotel addNewHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

}
