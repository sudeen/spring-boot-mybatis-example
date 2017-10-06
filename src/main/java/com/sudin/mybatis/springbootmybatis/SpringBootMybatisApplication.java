package com.sudin.mybatis.springbootmybatis;

import com.sudin.mybatis.springbootmybatis.model.Users;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Users.class)
@MapperScan("com.sudin.mybatis.springbootmybatis.mappers")
@SpringBootApplication
public class SpringBootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisApplication.class, args);
    }
}
