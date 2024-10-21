package com.hotel.hotel.service;

import java.util.List;

import com.hotel.hotel.entity.Hotel;

public interface HotelService {

    List<Hotel> getAllHotels();

    Hotel getHotel(String hId);

    Hotel addNewHotel(Hotel hotel);
}
