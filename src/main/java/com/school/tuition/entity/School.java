package com.school.tuition.entity;

import java.io.Serializable;

/**
 * (School)实体类
 *
 * @author makejava
 * @since 2020-07-12 20:18:34
 */
public class School implements Serializable {
    private static final long serialVersionUID = 750772825285528814L;
    
    private Integer id;
    
    private String schoolName;
    
    private String schoolCode;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

}