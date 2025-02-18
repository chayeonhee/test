package com.mobigen.demo2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import com.mobigen.demo2.entity.User;
import com.mobigen.demo2.repository.*;
@Service
public class UserService {
    

    @Autowired
    private UserRepository userRepository;
    public String getMesg(){
        return "SERVICE";
    }

     public Iterable<User> all() {
         return userRepository.findAll();
     }

     public Optional<User> findById(@PathVariable Integer id) {
		return userRepository.findById(id);
	}
   
}
