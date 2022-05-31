package com.application.LibraryApp.service;

import com.application.LibraryApp.entity.Author;
import com.application.LibraryApp.entity.Book;
import com.application.LibraryApp.entity.Publisher;
import com.application.LibraryApp.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    public List<Publisher> findAllPublishers() {
        return publisherRepository.findAll();
    }

    public Publisher findPublisherById(Long id) {
        Publisher publisher = publisherRepository.findById(id).orElseThrow(() -> new RuntimeException("Publisher not found"));
        return publisher;
    }

    public void createPublisher(Publisher publisher) {

        publisherRepository.save(publisher);
    }

    public void updatePublisher(Publisher publisher) {

        publisherRepository.save(publisher);
    }

    public void deletePublisher(Long id) {
        Publisher publisher = publisherRepository.findById(id).orElseThrow(() -> new RuntimeException("Publisher not found"));
        publisherRepository.deleteById(publisher.getId());
    }
}
