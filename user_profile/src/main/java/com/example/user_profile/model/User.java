package com.example.user_profile.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne(mappedBy="user", cascade=CascadeType.ALL)
      private Profile profile;
      public Long getId(){
        return id;
      }  
      public String getName(){
        return name;
      }
      public Profile getProfile(){
        return profile;
      }
      public void setId(Long id){
        this.id=id;
      }
      public void setName(String name){
        this.name=name;
      }
      public void setProfile(Profile profile){
        this.profile=profile;
      }
}
