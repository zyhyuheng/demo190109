package com.example.demo190109.repository.sys;

import com.example.demo190109.entity.sys.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @autuor zhaoyh
 * @data 2019/1/16 16:21
 */
public interface RoleRepository extends JpaRepository<RoleEntity,String> {
    public List<RoleEntity> findByIdIn(List<String> ids);
}
