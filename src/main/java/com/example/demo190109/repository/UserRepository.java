package com.example.demo190109.repository;

import com.example.demo190109.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @autuor zhaoyh
 * @data 2019/1/14 14:33
 */
public interface UserRepository extends JpaRepository<UserEntity,String> {
    public UserEntity findByUsername(String username);
}
