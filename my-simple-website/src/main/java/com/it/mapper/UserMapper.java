package com.it.mapper;

import com.it.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users")
    List<User> findAll();

    @Insert("INSERT INTO users (username, password) VALUES (#{username}, #{password})")
    void insertUser(User user);

    @Select("SELECT * FROM users WHERE username = #{username}")
    User findByUsername(String username);

    //sql注入   ' OR 1=1 LIMIT 1 --
    @Select("SELECT * FROM users WHERE username = '${username}' and password = '${password}'")
    User findUserByUsernameAndPassword(User user);
}

