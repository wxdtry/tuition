package com.school.tuition.service;

import com.school.tuition.entity.OperatorRole;

import java.util.List;

/**
 * (OperatorRole)表服务接口
 *
 * @author makejava
 * @since 2020-07-12 19:21:14
 */
public interface OperatorRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OperatorRole queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OperatorRole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param operatorRole 实例对象
     * @return 实例对象
     */
    OperatorRole insert(OperatorRole operatorRole);

    /**
     * 修改数据
     *
     * @param operatorRole 实例对象
     * @return 实例对象
     */
    OperatorRole update(OperatorRole operatorRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}