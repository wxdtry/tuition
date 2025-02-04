package com.school.tuition.dao;

import com.school.tuition.entity.Campus;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Campus)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-12 19:18:14
 */
public interface CampusDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Campus queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Campus> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param campus 实例对象
     * @return 对象列表
     */
    List<Campus> queryAll(Campus campus);

    /**
     * 新增数据
     *
     * @param campus 实例对象
     * @return 影响行数
     */
    int insert(Campus campus);

    /**
     * 修改数据
     *
     * @param campus 实例对象
     * @return 影响行数
     */
    int update(Campus campus);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}