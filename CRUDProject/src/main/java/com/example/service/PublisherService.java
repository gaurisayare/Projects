package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Publisher;

public interface PublisherService {
    List<Publisher> getAllPublishers();
    Optional<Publisher> getPublisherById(Long id);
    Publisher savePublisher(Publisher publisher);
    void deletePublisher(Long id);
}
