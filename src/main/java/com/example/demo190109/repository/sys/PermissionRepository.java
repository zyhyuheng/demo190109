package com.example.demo190109.repository.sys;

import com.example.demo190109.entity.sys.PermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @autuor zhaoyh
 * @data 2019/1/16 16:18
 */
public interface PermissionRepository extends JpaRepository<PermissionEntity,String> {


    public List<PermissionEntity> findByIdIn(List<String> ids);
}
