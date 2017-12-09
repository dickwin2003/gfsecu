package com.lvyuan.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lvyuan.mapper.UserMapper;
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List getUserInfo(Map paramMap){
        List user=userMapper.findUserInfo(paramMap);
        return user;
    }
    public List getUser(Map paramMap){
        List user=userMapper.findUser(paramMap);
        return user;
    }
    
    public List getUserList(Map paramMap){
        List user=userMapper.findUserList(paramMap);
        return user;
    }
}
