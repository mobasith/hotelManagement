package com.hotel.hotel.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.hotel.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String>{

}
