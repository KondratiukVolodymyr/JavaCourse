package com.models;

import static com.models.Roles.*;

public class UserBase {
    private String userName;
    private String password;
    private Roles role = ANONYM;

    public UserBase() {
    }

    public UserBase(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public void commonUserMethods() {
        if (role.equals(ADMIN) || role.equals(USER)) {
            System.out.println("good user role)");
        } else {
            throw new RuntimeException("role is incorrect " + ANONYM);
        }
    }

    @Override
    public String toString() {
        return "UserBase{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
