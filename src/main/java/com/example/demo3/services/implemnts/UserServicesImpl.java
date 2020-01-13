package com.example.demo3.services.implemnts;


import com.example.demo3.models.UserModel;
import com.example.demo3.services.UserCrud;
import com.example.demo3.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserCrud userCrud;

    @Override
    public List<UserModel> findAllUsers() {
       List<UserModel> allUsers = userCrud.findAll();
       return  allUsers;
    }

    @Override
    public void saveUser(UserModel userModel) {
        userCrud.save(userModel);
    }

    @Override
    public String updateUser(UserModel newUser) {

        String msg=null;
        if (newUser.getId() !=null){
            userCrud.save(newUser);
            msg="updated";
        }else {
            msg="invalid user id";
        }
        return msg;
    }
}
