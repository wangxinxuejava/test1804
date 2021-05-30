package com.bjpowernode.settings.web.controller;

import com.bjpowernode.settings.domain.User;
import com.bjpowernode.settings.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/user")
public class UserController {
       //查询用户的账号和密码的信息进行登录
       @Resource
       private UserService userService;

        @Resource
        private User user;
       @RequestMapping("/login.do")
       public ModelAndView login(User user){

           if (user!=null ){

           }
           ModelAndView mv=new ModelAndView();
           return mv;
       }
 }
