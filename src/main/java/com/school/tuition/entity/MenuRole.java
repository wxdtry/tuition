package com.school.tuition.entity;

import java.io.Serializable;

/**
 * (MenuRole)实体类
 *
 * @author makejava
 * @since 2020-07-12 20:18:34
 */
public class MenuRole implements Serializable {
    private static final long serialVersionUID = -55191538355534424L;
    
    private Integer id;
    
    private Integer menuId;
    
    private Integer roleId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

}