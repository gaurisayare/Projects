package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
