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
import com.lvyuan.vo.Result;

@Controller
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    
    public Result getUserInfo(@RequestParam(value="username", required=false) String username,@RequestParam(value="password", required=false) String password,@RequestParam(value="id", required=false) String id) {
    	Map paramMap = new HashMap();
    	paramMap.put("username",username);
    	paramMap.put("password",password);
    	paramMap.put("id",id);
    	
    	Result result = new Result(1, 0, null);
		try {
			List userlist = userService.getUserInfo(paramMap);
			List userlist2 = userService.getUser(paramMap);
			List userlist3 = userService.getUserList(paramMap);
			
			Map data = new HashMap();
			data.put("bar", userlist);
			data.put("pic", userlist2);
			data.put("user3", userlist3);
			
			result.setData(data);
			result.setRet(0);
			result.setSize(userlist.size() );  
		} catch (Exception e) {
			logger.error(e.getLocalizedMessage(), e);
		}
        return result;
    }
}
