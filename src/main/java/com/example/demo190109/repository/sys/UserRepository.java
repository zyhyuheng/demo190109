package com.example.demo190109.repository.sys;

import com.example.demo190109.entity.sys.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @autuor zhaoyh
 * @data 2019/1/14 14:33
 */
public interface UserRepository extends JpaRepository<UserEntity,String> {
    public UserEntity findByUsername(String username);

}
