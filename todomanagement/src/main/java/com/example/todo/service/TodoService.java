package com.example.todo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.model.Todo;
import com.example.todo.repository.TodoRepository;

@Service
public class TodoService {
    @Autowired 
    private TodoRepository repository;

    public Todo saveTodo(Todo todo){
        return repository.save(todo);
    }
    public List<Todo> getAllTodo(){
        return repository.findAll();
    }

    public Optional<Todo> getTodoById(Long id){
        return repository.findById(id);
    }

    public List<Todo> getByCompleted(Boolean completed){
        return repository.findByCompleted(completed);
    }

    public Todo updateTodo(Long id, Todo todo){
       Todo existing= repository.findById(id).orElse(null); 
        existing.setTitle(todo.getTitle());
        existing.setDescription(todo.getDescription());
        existing.setCompleted(todo.getCompleted());
        return repository.save(existing);
    }


    public void deleteTodo(Long id){
        repository.deleteById(id);
    }
    
}
