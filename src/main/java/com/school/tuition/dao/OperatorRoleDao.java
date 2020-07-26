package com.school.tuition.dao;

import com.school.tuition.entity.OperatorRole;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (OperatorRole)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-12 19:21:14
 */
public interface OperatorRoleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OperatorRole queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OperatorRole> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param operatorRole 实例对象
     * @return 对象列表
     */
    List<OperatorRole> queryAll(OperatorRole operatorRole);

    /**
     * 新增数据
     *
     * @param operatorRole 实例对象
     * @return 影响行数
     */
    int insert(OperatorRole operatorRole);

    /**
     * 修改数据
     *
     * @param operatorRole 实例对象
     * @return 影响行数
     */
    int update(OperatorRole operatorRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}