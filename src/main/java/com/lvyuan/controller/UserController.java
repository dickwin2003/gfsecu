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

import com.lvyuan.service.UserService;

@Controller
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    
    public Map getUserInfo(@RequestParam(value="username", required=false) String username,@RequestParam(value="password", required=false) String password,@RequestParam(value="id", required=false) String id) {
    	Map paramMap = new HashMap();
    	paramMap.put("username",username);
    	paramMap.put("password",password);
    	paramMap.put("id",id);
    	
        HashMap result = new HashMap();
		try {
			List userlist = userService.getUserInfo(paramMap);
			result.put("data",userlist ); 
			result.put("len",userlist.size());  
			result.put("ret", 0);  
		} catch (Exception e) {
			logger.error(e.getLocalizedMessage(), e);
			result.put("data", "获取信息失败！");
			result.put("ret", "1");
		}
        return result;
    }
}
