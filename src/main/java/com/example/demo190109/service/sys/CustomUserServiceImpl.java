package com.example.demo190109.service.sys;

import com.example.demo190109.entity.sys.PermissionEntity;
import com.example.demo190109.entity.sys.UserEntity;
import com.example.demo190109.repository.sys.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @autuor zhaoyh
 * @data 2019/1/14 14:32
 */
@Service
@Slf4j
public class CustomUserServiceImpl implements UserDetailsService,UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(s);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        System.out.println("s:"+s);
        System.out.println("username:"+user.getUsername()+";password:"+user.getPassword());
        return user;
    }

    @Override
    public UserEntity findByUserName(String userName) {
        return userRepository.findByUsername(userName);
    }

    @Override
    public boolean registerUser(String userName, String password) {

        String pwd=new BCryptPasswordEncoder().encode(password);
        UserEntity userEntity = userRepository.findByUsername(userName);
        if (userEntity!=null){
            return false;
        }else {
            userEntity = new UserEntity();
            userEntity.setPassword(pwd);
            userEntity.setUsername(userName);
            userRepository.save(userEntity);
            return true;
        }
    }
}
