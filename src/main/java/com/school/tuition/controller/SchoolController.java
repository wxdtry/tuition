package com.school.tuition.controller;

import com.school.tuition.entity.School;
import com.school.tuition.service.SchoolService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (School)表控制层
 *
 * @author makejava
 * @since 2020-07-12 19:21:16
 */
@RestController
@RequestMapping("school")
public class SchoolController {
    /**
     * 服务对象
     */
    @Resource
    private SchoolService schoolService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public School selectOne(Integer id) {
        return this.schoolService.queryById(id);
    }

}