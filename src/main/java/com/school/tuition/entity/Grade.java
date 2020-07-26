package com.school.tuition.entity;

import java.io.Serializable;

/**
 * (Grade)实体类
 *
 * @author makejava
 * @since 2020-07-12 20:18:34
 */
public class Grade implements Serializable {
    private static final long serialVersionUID = -35829766749061103L;
    
    private Integer id;
    
    private String gradeName;
    
    private String gradeCode;
    
    private Integer campusId;
    
    private Boolean enable;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getGradeCode() {
        return gradeCode;
    }

    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode;
    }

    public Integer getCampusId() {
        return campusId;
    }

    public void setCampusId(Integer campusId) {
        this.campusId = campusId;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

}