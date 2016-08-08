package com.service;

import com.models.Roles;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UserCredPropertiesService {

    public static final String USERNAME_PROPERTY_KEY = "username";
    public static final String PASSWORD_PROPERTY_KEY = "password";
    private String userName;
    private String password;
    private String path;
    private Roles role;

    public UserCredPropertiesService(String path, Roles role) {
        this.path = path;
        this.role = role;
    }

    public UserCredPropertiesService(String userName, String password, String path) {
        this.userName = userName;
        this.password = password;
        this.path = path;
    }

    public void init() throws IOException {
        InputStream resourceAsStream = UserCredPropertiesService.class.getResourceAsStream(path);
        Properties property = new Properties();
        property.load(resourceAsStream);
        this.userName = property.getProperty(USERNAME_PROPERTY_KEY);
        this.password = property.getProperty(PASSWORD_PROPERTY_KEY);
    }

    public String getUserName() {
        return userName == null ? "" : userName;
    }


    public String getPassword() {
        return password == null ? "" : password;
    }

    public Roles getRole() {
        return role;
    }
}
