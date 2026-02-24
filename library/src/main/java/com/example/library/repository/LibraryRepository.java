package com.example.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.model.Library;

public interface LibraryRepository extends JpaRepository<Library, Long> {

    List<Library> findByTitle(String title);
    List<Library> findByAuthor(String author);
    List<Library> findByPrice(Double price);
    List<Library> findByAvailable(Boolean available);
    
}
