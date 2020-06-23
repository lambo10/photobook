package com.photobook.photobookservice.dal;

import com.photobook.photobookservice.entity.user;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface user_repo extends MongoRepository<user, String> {
    user findByEmail(String email);
}
