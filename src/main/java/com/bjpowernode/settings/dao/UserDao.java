package com.bjpowernode.settings.dao;

import com.bjpowernode.settings.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    //查询的User账号密码是否正确
   User loginUser(User user);




}
