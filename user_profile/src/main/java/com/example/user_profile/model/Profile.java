package com.example.user_profile.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phone;
    private String address;
    private String dob;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Long getId(){
        return id;
    }
    public String getPhone(){
        return phone;
    }
    public String getAddress(){
        return address;
    }
    public String getDob(){
        return dob;
    }
    public User getUser(){
        return user;
    }
    public void setId(Long id){
        this.id=id;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setUser(User user){
        this.user=user;
    }
    public void setDob(String dob){
        this.dob=dob;
    }
}
