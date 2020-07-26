package com.school.tuition.entity;

import java.io.Serializable;

/**
 * (Campus)实体类
 *
 * @author makejava
 * @since 2020-07-12 20:18:34
 */
public class Campus implements Serializable {
    private static final long serialVersionUID = -57158364205043817L;
    
    private Integer id;
    
    private String campusName;
    
    private String campusCode;
    
    private Integer schoolId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    public String getCampusCode() {
        return campusCode;
    }

    public void setCampusCode(String campusCode) {
        this.campusCode = campusCode;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

}