package com.rating.rating_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "Ratings")
public class Rating {
    @Id
    private String ratingId;
    private Long userId;
    private String hotelId;
    private int rating;
    private String feedback;
}
