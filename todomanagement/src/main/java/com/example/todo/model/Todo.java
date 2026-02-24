package com.example.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private Boolean completed;
    
    public Todo(){}

    public Todo(String title, String description, Boolean completed){
        this.title=title;
        this.description=description;
        this.completed=completed;
    }

    public Long getId(){
        return id;
    }
    public void setID(Long id){
        this.id=id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
         this.description=description;
    }
    public Boolean getCompleted(){
        return completed;
    }
    public void setCompleted(Boolean completed){
        this.completed=completed;
    }
    
}
