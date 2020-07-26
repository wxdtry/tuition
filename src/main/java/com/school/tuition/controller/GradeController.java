package com.school.tuition.controller;

import com.school.tuition.entity.Grade;
import com.school.tuition.service.GradeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Grade)表控制层
 *
 * @author makejava
 * @since 2020-07-12 19:19:56
 */
@RestController
@RequestMapping("grade")
public class GradeController {
    /**
     * 服务对象
     */
    @Resource
    private GradeService gradeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Grade selectOne(Integer id) {
        return this.gradeService.queryById(id);
    }

}