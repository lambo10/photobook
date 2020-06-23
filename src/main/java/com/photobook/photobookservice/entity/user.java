package com.photobook.photobookservice.entity;

import org.springframework.data.annotation.Id;

public class user {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private long phoneNo;
}
