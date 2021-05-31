package com.bjpowernode.settings.web.controller;

import com.bjpowernode.settings.domain.User;
import com.bjpowernode.settings.exception.LoginException;
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

       @RequestMapping("/login.do")
       public ModelAndView login(String loginAct, String loginPwd) throws LoginException {
           ModelAndView mv=new ModelAndView();
           User user=new User();
           user.setLoginAct(loginAct);
           user.setLoginPwd(loginPwd);
           if (user!=null ){
                //将信息传输进行测试
               mv.addObject("loginAct",user.getLoginAct());
               mv.addObject("loginPwd",user.getLoginPwd());
               mv.setViewName("forward:/test.jsp");
           }else {
              throw new LoginException("账号密码不匹配");
           }
           return mv;
       }


 }
