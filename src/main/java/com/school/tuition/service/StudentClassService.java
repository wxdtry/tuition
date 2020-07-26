package com.school.tuition.service;

import com.school.tuition.entity.StudentClass;

import java.util.List;

/**
 * (StudentClass)表服务接口
 *
 * @author makejava
 * @since 2020-07-12 19:21:17
 */
public interface StudentClassService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    StudentClass queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<StudentClass> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param studentClass 实例对象
     * @return 实例对象
     */
    StudentClass insert(StudentClass studentClass);

    /**
     * 修改数据
     *
     * @param studentClass 实例对象
     * @return 实例对象
     */
    StudentClass update(StudentClass studentClass);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}