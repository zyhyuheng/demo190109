package com.example.demo190109.entity.sys;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @autuor zhaoyh
 * @data 2019/1/16 16:13
 */
@Entity(name = "permission")
@Data
public class PermissionEntity {
    @Id
    @Column(name = "id",length = 64)
    private String id;
    //权限名称
    @Column
    private String name;

    //权限描述
    @Column
    private String descritpion;

    //授权链接
    @Column
    private String url;

    //父节点id
    @Column
    private String pid;
}
