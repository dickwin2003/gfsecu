package com.lvyuan.mapper;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    public List findUserInfo(Map paramMap);
    public List findUser(Map paramMap);
    public List findUserList(Map paramMap);
}
