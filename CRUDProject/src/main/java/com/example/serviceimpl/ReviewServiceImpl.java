package com.example.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Review;
import com.example.repository.ReviewRepository;
import com.example.service.ReviewService;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

	@Override
	public List<Review> getAllReviews() {
		// TODO Auto-generated method stub
		return reviewRepository.findAll();
	}

	@Override
	public Optional<Review> getReviewById(Long id) {
		// TODO Auto-generated method stub
		return reviewRepository.findById(id);
	}

	@Override
	public Review saveReview(Review review) {
		return reviewRepository.save(review);
	}

	@Override
	public void deleteReview(Long id) {
		// TODO Auto-generated method stub
		reviewRepository.deleteById(id);
	}

    // Implement methods
}
