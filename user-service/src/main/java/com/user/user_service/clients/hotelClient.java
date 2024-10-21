package com.user.user_service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.user.user_service.entity.Hotel;

@FeignClient(name = "hotel")
public interface hotelClient {
    @GetMapping("/hotels/{hotelId}")
    Hotel getHotelById(@PathVariable("hotelId") String hotelId);
}
