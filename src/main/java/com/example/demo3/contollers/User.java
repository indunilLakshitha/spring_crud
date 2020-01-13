package com.example.demo3.contollers;


import com.example.demo3.models.UserModel;
import com.example.demo3.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//User Controller class controll the route

@RestController
@RequestMapping("/users")
public class User {

    @Autowired
    private UserServices us;

    //view data
    @GetMapping("/all")
    public List<UserModel> allUsers(){
        return us.findAllUsers();
    }
    //save data
    @PostMapping("/add")
    public String addUser(@RequestBody UserModel userModel){
        us.saveUser(userModel);
        return "user saved";
    }

    //update user
    @PutMapping("/update")
    public String upUser(@RequestBody UserModel newUserModel){
        return us.updateUser(newUserModel);
    }
}
