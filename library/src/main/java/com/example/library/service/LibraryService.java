package com.example.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.model.Library;
import com.example.library.repository.LibraryRepository;
@Service
public class LibraryService {


    @Autowired
    private LibraryRepository repository;

    public Library saveLibrary(Library library){
        return repository.save(library);
    }
    public List<Library> getAllLibrary(){
        return repository.findAll();
    }
    public Optional<Library> getLibraryId(Long id){
        return repository.findById(id);
    }

    public List<Library>getByTitle(String title){
        return repository.findByTitle(title);
    }
    public List<Library>getByAuthor(String author){
        return repository.findByAuthor(author);
    }
    public List<Library>getByPrice(Double price){
        return repository.findByPrice(price);
    }
    public List<Library>getByAvailable(Boolean available){
        return repository.findByAvailable(available);
    }




    public Library updateLibrary(Long id, Library library){
        Library existing=repository.findById(id).orElse(null);
        existing.setTitle(library.getTitle());
        existing.setAuthor(library.getAuthor());
        existing.setPrice(library.getPrice());
        existing.setAvailable(library.getAvailable());
        return repository.save(existing);
    }
    public void deleteLibrary(Long id){
        repository.deleteById(id);
    }
    
}
