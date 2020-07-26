package com.school.tuition.entity;

import java.io.Serializable;

/**
 * (Classes)实体类
 *
 * @author makejava
 * @since 2020-07-12 20:18:34
 */
public class Classes implements Serializable {
    private static final long serialVersionUID = 145805617110256388L;
    
    private Integer id;
    
    private String className;
    
    private String classCode;
    
    private Integer gradeId;
    
    private Boolean enable;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

}