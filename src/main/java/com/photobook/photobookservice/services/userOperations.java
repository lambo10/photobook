package com.photobook.photobookservice.services;

import com.photobook.photobookservice.dal.user_repo;
import com.photobook.photobookservice.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userOperations {
    @Autowired
    private user_repo userRepository;

    public user findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }


    public void saveOrUpdateUser(user user) {
        userRepository.save(user);
    }
}
