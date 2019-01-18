package com.example.demo190109.service.sys;

import com.example.demo190109.entity.sys.UserEntity;

/**
 * @autuor zhaoyh
 * @data 2019/1/16 15:30
 */
public interface UserService {
    public UserEntity findByUserName(String userName);

    public boolean registerUser(String userName,String password);
}
