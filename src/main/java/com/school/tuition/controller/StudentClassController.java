package com.school.tuition.controller;

import com.school.tuition.entity.StudentClass;
import com.school.tuition.service.StudentClassService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (StudentClass)表控制层
 *
 * @author makejava
 * @since 2020-07-12 19:21:17
 */
@RestController
@RequestMapping("studentClass")
public class StudentClassController {
    /**
     * 服务对象
     */
    @Resource
    private StudentClassService studentClassService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public StudentClass selectOne(Integer id) {
        return this.studentClassService.queryById(id);
    }

}