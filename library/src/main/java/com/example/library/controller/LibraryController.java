package com.example.library.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.model.Library;
import com.example.library.service.LibraryService;
@RestController
@RequestMapping("/librarys")
public class LibraryController {

    @Autowired 
    private LibraryService service;

    @PostMapping
    public Library saveLibrary(@RequestBody Library library){
        return service.saveLibrary(library);
    }
    @GetMapping
    public List<Library> getAllLibrary(){
        return service.getAllLibrary();
    }
    @GetMapping("/{id}")
    public Optional<Library> getById(@PathVariable Long id){
        return service.getLibraryId(id);
    }

    @GetMapping("/title/{title}")
    public List<Library> getByTitle(@PathVariable String title){
        return service.getByTitle(title);
    }
    @GetMapping("/author/{author}")
    public List<Library> getByAuthor(@PathVariable String author){
        return service.getByAuthor(author);
    }
    @GetMapping("/price/{price}")
    public List<Library> getByPrice(@PathVariable Double price){
        return service.getByPrice(price);
    }
    @GetMapping("/available/{available}")
    public List<Library> getByAvailable(@PathVariable Boolean available){
        return service.getByAvailable(available);
    }


    @PutMapping("/{id}")
    public Library updateLibrary(@PathVariable Long id,@RequestBody Library library){
        return service.updateLibrary(id, library);
    }
    @DeleteMapping("/{id}")
    public void deleteLibrary(@PathVariable Long id){
        service.deleteLibrary(id);
        System.out.println("Delete Done");
    }

    
}
