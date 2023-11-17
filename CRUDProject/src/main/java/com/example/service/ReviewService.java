package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Review;

public interface ReviewService {
    List<Review> getAllReviews();
    Optional<Review> getReviewById(Long id);
    Review saveReview(Review review);
    void deleteReview(Long id);
}
