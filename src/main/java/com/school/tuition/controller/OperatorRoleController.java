package com.school.tuition.controller;

import com.school.tuition.entity.OperatorRole;
import com.school.tuition.service.OperatorRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (OperatorRole)表控制层
 *
 * @author makejava
 * @since 2020-07-12 19:21:14
 */
@RestController
@RequestMapping("operatorRole")
public class OperatorRoleController {
    /**
     * 服务对象
     */
    @Resource
    private OperatorRoleService operatorRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OperatorRole selectOne(Integer id) {
        return this.operatorRoleService.queryById(id);
    }

}