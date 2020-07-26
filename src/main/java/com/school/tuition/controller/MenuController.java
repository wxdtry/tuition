package com.school.tuition.controller;

import com.school.tuition.entity.Menu;
import com.school.tuition.service.MenuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Menu)表控制层
 *
 * @author makejava
 * @since 2020-07-12 19:20:44
 */
@RestController
@RequestMapping("menu")
public class MenuController {
    /**
     * 服务对象
     */
    @Resource
    private MenuService menuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Menu selectOne(Integer id) {
        return this.menuService.queryById(id);
    }

}