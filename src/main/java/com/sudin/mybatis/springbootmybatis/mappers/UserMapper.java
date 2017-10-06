package com.sudin.mybatis.springbootmybatis.mappers;

import com.sudin.mybatis.springbootmybatis.model.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import javax.websocket.server.PathParam;
import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from Users where name=#{name}")
    List<Users> findAll(@PathParam("name") final String name);

    @Insert("insert into Users(name,salary) values(#{name},#{salary})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()" ,keyProperty = "id",
    before = false,resultType = Integer.class)
    void insert(Users users);
}
