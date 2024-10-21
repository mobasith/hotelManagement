package com.rating.rating_service.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rating.rating_service.entity.Rating;

public interface RatingRepo extends JpaRepository<Rating, String>{
    //custom finder method
    List<Rating> findByUserId(Long userId);
    List<Rating> findByHotelId(String hotelId);
}
