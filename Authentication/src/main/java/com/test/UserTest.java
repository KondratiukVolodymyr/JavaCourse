package com.test;

import com.models.UserBase;
import com.service.UserCredPropertiesService;
import com.service.UserService;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import static com.models.Roles.*;

public class UserTest {
    public static void main(String[] args) throws IOException {
        UserService userService = new UserService();
        UserCredPropertiesService adminPropertiesService = new UserCredPropertiesService("/admin.properties", ADMIN);
        adminPropertiesService.init();

        UserCredPropertiesService userPropertiesService = new UserCredPropertiesService("/base_user.properties", USER);
        userPropertiesService.init();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            String username = scanner.next();
            String password = scanner.next();
            UserBase userBase = new UserBase(username, password);
            userService.setUserRoleByPropertyService(adminPropertiesService, userBase);
            userService.setUserRoleByPropertyService(userPropertiesService, userBase);
            userService.addNewUser(userBase);
        }

        System.out.println(Arrays.toString(userService.getUserBaseDB()));
    }
}
