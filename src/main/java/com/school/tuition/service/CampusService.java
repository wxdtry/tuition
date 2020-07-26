package com.school.tuition.service;

import com.school.tuition.entity.Campus;

import java.util.List;

/**
 * (Campus)表服务接口
 *
 * @author makejava
 * @since 2020-07-12 19:18:14
 */
public interface CampusService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Campus queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Campus> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param campus 实例对象
     * @return 实例对象
     */
    Campus insert(Campus campus);

    /**
     * 修改数据
     *
     * @param campus 实例对象
     * @return 实例对象
     */
    Campus update(Campus campus);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}