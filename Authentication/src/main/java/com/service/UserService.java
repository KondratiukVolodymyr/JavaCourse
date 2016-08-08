package com.service;

import com.models.Admin;
import com.models.Anonym;
import com.models.UserBase;

import java.util.Arrays;

import static com.models.Roles.*;

public class UserService {

    private UserBase userBaseDB[] = new UserBase[0];

    public UserBase[] getUserBaseDB() {
        return userBaseDB;
    }

    public void addNewUser(UserBase newUserBase) {
        userBaseDB = Arrays.copyOf(userBaseDB, userBaseDB.length + 1);
        userBaseDB[userBaseDB.length - 1] = newUserBase;
    }

    public void userDbFunctionalTesting() {
        for (UserBase userBase : userBaseDB) {
            if (ADMIN.equals(userBase.getRole())) {
                Admin admin = (Admin) userBase;
                admin.setDbPrivilagies();
                continue;
            }

            if (USER.equals(userBase.getRole())) {
                userBase.commonUserMethods();
                continue;
            }

            if (ANONYM.equals(userBase.getRole())) {
                Anonym anonym = (Anonym) userBase;
                anonym.simpleAnonymMethod();
                continue;
            }
        }
    }

    public UserBase getFirstAnonymUser() {
        for(UserBase userBase : userBaseDB) {
            if(ANONYM.equals(userBase)){
                return userBase;
            }
        }
        throw new IllegalArgumentException();//return null; -- все зависит от вашей бизнес-логики
        // (на сколько отсутствие данной сущности критично)
        //сущность = объект (синонимы)
    }


    public void setUserRoleByPropertyService(UserCredPropertiesService service, UserBase user){
        if(service.getUserName().equals(user.getUserName()) &&
                service.getPassword().equals(user.getPassword())) {
            user.setRole(service.getRole());
        }
    }
}
