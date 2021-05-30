package com.bjpowernode.settings.dao;

import com.bjpowernode.settings.domain.User;
import org.springframework.stereotype.Repository;
@Repository
public interface UserDao {
    //查询的User账号密码是否正确
    User selectUser(User user);

    //增加用户信息
    int insetUser(User user);

    //修改用户信息
    int updateUser(User user);

    //删除用户信息
    int deleteUser(User user);


}
