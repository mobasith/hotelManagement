package com.rating.rating_service.service;

import java.util.List;

import com.rating.rating_service.entity.Rating;

public interface RatingService {

    //create new rating 
    Rating create(Rating rating);

    //list all the ratings
    List<Rating> getAllRating();

    //get all by userId
    List<Rating> getRatingByUserId(Long userId);

    //get all by hotelId
    List<Rating> getRatingByHotelId(String hotelId);
    
}
