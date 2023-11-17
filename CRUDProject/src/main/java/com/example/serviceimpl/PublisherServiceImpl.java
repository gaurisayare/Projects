package com.example.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Publisher;
import com.example.repository.PublisherRepository;
import com.example.service.PublisherService;

@Service
public class PublisherServiceImpl implements PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

	@Override
	public List<Publisher> getAllPublishers() {
		// TODO Auto-generated method stub
		return publisherRepository.findAll();
	}

	@Override
	public Optional<Publisher> getPublisherById(Long id) {
		// TODO Auto-generated method stub
		return publisherRepository.findById(id);
	}

	@Override
	public Publisher savePublisher(Publisher publisher) {
		return publisherRepository.save(publisher);
	}

	@Override
	public void deletePublisher(Long id) {
		// TODO Auto-generated method stub
		publisherRepository.deleteById(id);
	}

    // Implement methods
}