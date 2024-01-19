package com.example.user.service.entities;

//we don't need to save these ratngs to the database as we will be fetching the ratings using another microservice ratings

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ratings {
    private String ratingId;
    private int rating;
    private String userId;
    private String hotelId;
//    private String feedback;
}
