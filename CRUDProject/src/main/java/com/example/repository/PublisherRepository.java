package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
