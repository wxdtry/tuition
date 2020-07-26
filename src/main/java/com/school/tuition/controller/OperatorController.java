package com.school.tuition.controller;

import com.school.tuition.entity.Operator;
import com.school.tuition.service.OperatorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Operator)表控制层
 *
 * @author makejava
 * @since 2020-07-12 19:21:12
 */
@RestController
@RequestMapping("operator")
public class OperatorController {
    /**
     * 服务对象
     */
    @Resource
    private OperatorService operatorService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Operator selectOne(Integer id) {
        return this.operatorService.queryById(id);
    }

}