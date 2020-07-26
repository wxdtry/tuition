package com.school.tuition.controller;

import com.school.tuition.entity.Campus;
import com.school.tuition.service.CampusService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Campus)表控制层
 *
 * @author makejava
 * @since 2020-07-12 19:18:14
 */
@RestController
@RequestMapping("campus")
public class CampusController {
    /**
     * 服务对象
     */
    @Resource
    private CampusService campusService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Campus selectOne(Integer id) {
        return this.campusService.queryById(id);
    }

}