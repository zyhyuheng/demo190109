package com.example.demo190109.entity.sys;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * @autuor zhaoyh
 * @data 2019/1/16 15:43
 */
@Entity(name="role")
@Data
public class RoleEntity {
    @Id
    @Column(name = "id",length = 64)
    private String id;
    @Column(name = "role_name")
    private String roleName;
    @ManyToMany(cascade = {CascadeType.REFRESH},fetch = FetchType.EAGER)
    private List<PermissionEntity> permissions;

}
