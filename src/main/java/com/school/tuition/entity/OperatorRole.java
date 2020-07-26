package com.school.tuition.entity;

import java.io.Serializable;

/**
 * (OperatorRole)实体类
 *
 * @author makejava
 * @since 2020-07-12 20:18:34
 */
public class OperatorRole implements Serializable {
    private static final long serialVersionUID = -98569353415274040L;
    
    private Integer id;
    
    private Integer operatorId;
    
    private Integer roleId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

}