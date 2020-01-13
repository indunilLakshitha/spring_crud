package com.example.demo3.services;


import com.example.demo3.models.UserModel;

import java.util.List;

public interface UserServices {

    List<UserModel> findAllUsers();

    void saveUser(UserModel userModel);

    String updateUser(UserModel newUser);
}
