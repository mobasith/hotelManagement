package com.user.user_service.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.user.user_service.entity.Rating;

@FeignClient(name = "rating-service")

public interface ratingClient {
    @GetMapping("/ratings/users/{userId}")
    List<Rating> getUserRatings(@PathVariable("userId") Long userId);
}

