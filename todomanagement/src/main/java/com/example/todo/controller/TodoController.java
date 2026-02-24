package com.example.todo.controller;

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

import com.example.todo.model.Todo;
import com.example.todo.service.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    private TodoService service;

    @PostMapping
    public Todo saveTodo(@RequestBody Todo todo){
    return service.saveTodo(todo);
    }

    @GetMapping
    public List<Todo> getAllTodo(){
        return service.getAllTodo();
    }
    @GetMapping("/{id}")
    public Optional<Todo> getById(@PathVariable Long id){
        return service.getTodoById(id);
    }
    @GetMapping("completed/{status}")
    public List<Todo> getTodosByCompleted(@PathVariable Boolean status){
        return service.getByCompleted(status);
    }
    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable Long id, @RequestBody Todo todo){
        return service.updateTodo(id, todo);
    }
    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id){
         service.deleteTodo(id);

    }

    
}
