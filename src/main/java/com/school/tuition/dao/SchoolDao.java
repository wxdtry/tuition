package com.school.tuition.dao;

import com.school.tuition.entity.School;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (School)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-12 19:21:16
 */
public interface SchoolDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    School queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<School> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param school 实例对象
     * @return 对象列表
     */
    List<School> queryAll(School school);

    /**
     * 新增数据
     *
     * @param school 实例对象
     * @return 影响行数
     */
    int insert(School school);

    /**
     * 修改数据
     *
     * @param school 实例对象
     * @return 影响行数
     */
    int update(School school);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}