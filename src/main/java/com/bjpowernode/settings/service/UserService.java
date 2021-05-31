package com.bjpowernode.settings.service;

import com.bjpowernode.settings.domain.User;

import java.util.List;

public interface UserService {
    //查询用户信息信息
    public List<User> selectUsers();

    //用户登陆信息
    public User loginUser(User user);

     public   int insertUser(User user);


    public int deleteUser(User user);


    public int updateUser(User user);


}
