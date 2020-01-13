package com.example.demo3.services;

import com.example.demo3.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCrud extends JpaRepository<UserModel,Integer> {

}
