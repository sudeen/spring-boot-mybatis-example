package com.sudin.mybatis.springbootmybatis.controllers;


import com.sudin.mybatis.springbootmybatis.mappers.UserMapper;
import com.sudin.mybatis.springbootmybatis.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserController {

    @Autowired
    private UserMapper userMapper;


    @GetMapping("/all")
    public List<Users> getAll() {
        return userMapper.findAll();
    }

    @GetMapping("/update")
    private List<Users> update(){
        Users users=new Users();
        users.setName("sammy");
        users.setSalary(8758L);
        userMapper.insert(users);
        return userMapper.findAll();
    }
}
