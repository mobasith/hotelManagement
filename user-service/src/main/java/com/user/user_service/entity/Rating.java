package com.user.user_service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Rating {
    private String ratingId;
    private Long userId;
    private String HotelId;
    private int rating;
    private String feedback;
    private Hotel hotel;
}
