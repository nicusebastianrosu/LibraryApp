package com.application.LibraryApp.repository;

import com.application.LibraryApp.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
