package com.school.tuition.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (StudentClass)实体类
 *
 * @author makejava
 * @since 2020-07-12 20:18:34
 */
public class StudentClass implements Serializable {
    private static final long serialVersionUID = -33602833893215551L;
    
    private Integer id;
    
    private Integer classId;
    
    private Integer studentId;
    
    private Boolean stutus;
    
    private Date date;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Boolean getStutus() {
        return stutus;
    }

    public void setStutus(Boolean stutus) {
        this.stutus = stutus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}