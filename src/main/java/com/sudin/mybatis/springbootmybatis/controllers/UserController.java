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

    @GetMapping("/insert")
    private List<Users> insert() {
        Users users = new Users();
        users.setName("John");
        users.setSalary(1111L);
        userMapper.insert(users);
        return userMapper.findAll();
    }

    @GetMapping("/update")
    public List<Users> update() {
        Users users = new Users();
        users.setName("sudin");
        users.setSalary(555L);
        userMapper.update(users);
        return userMapper.findAll();
    }

    @GetMapping("/delete")
        public List<Users> delete () {
            Users users = new Users();
            users.setName("John");
            userMapper.delete(users);
            return userMapper.findAll();

    }
}
