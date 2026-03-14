package com.example.user_profile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user_profile.model.Profile;
import com.example.user_profile.model.User;
import com.example.user_profile.repository.ProfileRepository;
import com.example.user_profile.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProfileRepository profileRepository;

    // Create User with Profile
    public User createUser(User user) {

        Profile profile = user.getProfile();
        profile.setUser(user);

        return userRepository.save(user);
    }

    // Get User with Profile
    public User getUser(Long id) {

        return userRepository.findById(id).orElse(null);
    }

    // Update Profile
    public User updateProfile(Long id, Profile updatedProfile) {

        User user = userRepository.findById(id).orElse(null);

        if (user != null) {

            Profile profile = user.getProfile();

            profile.setPhone(updatedProfile.getPhone());
            profile.setAddress(updatedProfile.getAddress());
            profile.setDob(updatedProfile.getDob());

            profileRepository.save(profile);
        }

        return user;
    }

    // Delete Profile only
    public String deleteProfile(Long id) {

        User user = userRepository.findById(id).orElse(null);

        if (user != null) {

            Profile profile = user.getProfile();

            user.setProfile(null);

            profileRepository.delete(profile);

            userRepository.save(user);
        }

        return "Profile Deleted";
    }
}