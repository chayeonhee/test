package com.mobigen.demo2.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

import com.mobigen.demo2.entity.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    
}