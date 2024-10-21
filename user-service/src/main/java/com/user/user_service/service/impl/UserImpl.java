package com.user.user_service.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.user_service.clients.hotelClient;
import com.user.user_service.clients.ratingClient;
import com.user.user_service.dao.UserRepo;
import com.user.user_service.entity.Hotel;
import com.user.user_service.entity.Rating;
import com.user.user_service.entity.User;
import com.user.user_service.exceptions.ResourceNotFoundException;
import com.user.user_service.service.UserService;


@Service
public class UserImpl implements UserService{

    @Autowired
    UserRepo userRepo;

    @Autowired
    ratingClient ratingClient;

    @Autowired
    hotelClient hotelClient;

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
    List<User> users = userRepo.findAll();

    for (User user : users) {
        List<Rating> ratings = ratingClient.getUserRatings(user.getUserId());

        for (Rating rating : ratings) {
            if (rating.getHotelId() != null) {
                try {
                    Hotel hotel = hotelClient.getHotelById(rating.getHotelId());
                    rating.setHotel(hotel);
                } catch (Exception e) {
                    // Handle the case when the hotel is not found or another error occurs
                    rating.setHotel(null);
                }
            }
        }

        user.setRatings(ratings);
    }

    return users;
}

    @Override
public User getUser(long userId) {
    User user = userRepo.findById(userId)
            .orElseThrow(() -> new ResourceNotFoundException("User not found"));

    List<Rating> ratings = ratingClient.getUserRatings(userId);
    
    for (Rating rating : ratings) {
        if (rating.getHotelId() != null) {
            try {
                Hotel hotel = hotelClient.getHotelById(rating.getHotelId());
                rating.setHotel(hotel);
            } catch (Exception e) {
                // Handle the case when the hotel is not found or another error occurs
                rating.setHotel(null);
            }
        }
    }

    user.setRatings(ratings);

    return user;
}

}
