package com.lvyuan.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lvyuan.model.User;
import com.lvyuan.service.UserService;

@Controller
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    
    public List getUserInfo(@RequestParam(value="username", required=false) String username,@RequestParam(value="password", required=false) String password,@RequestParam(value="id", required=false) String id) {
    	Map paramMap = new HashMap();
    	paramMap.put("username",username);
    	paramMap.put("password",password);
    	paramMap.put("id",id);
        List user = userService.getUserInfo(paramMap);
//        if(user!=null){
//            System.out.println("user.getName():"+user.getName());
//            logger.info("user.getAge():"+user.getAge());
//        }
        return user;
    }
}
