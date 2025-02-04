package com.school.tuition.service;

import com.school.tuition.entity.Operator;

import java.util.List;

/**
 * (Operator)表服务接口
 *
 * @author makejava
 * @since 2020-07-12 19:21:12
 */
public interface OperatorService  {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Operator queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Operator> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param operator 实例对象
     * @return 实例对象
     */
    Operator insert(Operator operator);

    /**
     * 修改数据
     *
     * @param operator 实例对象
     * @return 实例对象
     */
    Operator update(Operator operator);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}