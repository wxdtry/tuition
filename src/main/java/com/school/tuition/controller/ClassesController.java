package com.school.tuition.controller;

import com.school.tuition.entity.Classes;
import com.school.tuition.service.ClassesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Classes)表控制层
 *
 * @author makejava
 * @since 2020-07-12 19:30:03
 */
@RestController
@RequestMapping("classes")
public class ClassesController {
    /**
     * 服务对象
     */
    @Resource
    private ClassesService classesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Classes selectOne(Integer id) {
        return this.classesService.queryById(id);
    }

}