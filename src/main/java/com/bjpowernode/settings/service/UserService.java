package com.bjpowernode.settings.service;

import com.bjpowernode.settings.domain.User;

import java.util.List;

public interface UserService {
    //查询用户信息信息
     List<User> selectUsers();

     //添加用户信息
    int insertUser(User user);

    //删除用户信息
    int deleteUser(User user);

    //修改用户信息
    int updateUser(User user);
}
