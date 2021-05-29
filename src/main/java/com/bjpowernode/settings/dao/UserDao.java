package com.bjpowernode.settings.dao;

import com.bjpowernode.settings.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {
    //查询所有的学生信息
    List<User> selectUsers();

    //增加用户信息
    int insetUser(User user);

    //修改用户信息
    int updateUser(User user);

    //删除用户信息
    int deleteUser(User user);


}
