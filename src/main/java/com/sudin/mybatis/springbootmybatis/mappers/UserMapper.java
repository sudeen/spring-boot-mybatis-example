package com.sudin.mybatis.springbootmybatis.mappers;

import com.sudin.mybatis.springbootmybatis.model.Users;
import org.apache.ibatis.annotations.*;


import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from Users")
    List<Users> findAll();

    @Insert("insert into Users(name,salary) values(#{name},#{salary})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()" ,keyProperty = "id",
    before = false,resultType = Integer.class)
    void insert(Users users);

    @Update("update Users set salary=#{salary} where name=#{name}")
    void update(Users users);

    @Delete("delete from Users where name=#{name}")
    void delete(Users users);
}
