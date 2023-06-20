package com.example.springapi.service;

import com.example.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    //Simulacion de una base de datos
    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Franco", 24, "franro4251@gmail.com");
        User user2 = new User(2, "Manuel", 62, "manu@gmail.com");
        User user3 = new User(3, "Nicolas", 33, "nicolas@gmail.com");

        userList.addAll(Arrays.asList(user1, user2, user3));
    }

    public User getUser(Integer id) {
        User aux = null;
        for (User user : userList) {
            if (id == user.getIdUser()) {
                aux = user;
                break;
            }
        }
        return aux;
    }
}
