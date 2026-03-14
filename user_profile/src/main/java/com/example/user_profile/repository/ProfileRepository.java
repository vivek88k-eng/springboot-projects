package com.example.user_profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user_profile.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
    
}
