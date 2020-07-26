package com.school.tuition.service.impl;

import com.school.tuition.dao.OperatorRoleDao;
import com.school.tuition.entity.OperatorRole;
import com.school.tuition.service.OperatorRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (OperatorRole)表服务实现类
 *
 * @author makejava
 * @since 2020-07-12 19:21:14
 */
@Service("operatorRoleService")
public class OperatorRoleServiceImpl implements OperatorRoleService {
    @Resource
    private OperatorRoleDao operatorRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OperatorRole queryById(Integer id) {
        return this.operatorRoleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OperatorRole> queryAllByLimit(int offset, int limit) {
        return this.operatorRoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param operatorRole 实例对象
     * @return 实例对象
     */
    @Override
    public OperatorRole insert(OperatorRole operatorRole) {
        this.operatorRoleDao.insert(operatorRole);
        return operatorRole;
    }

    /**
     * 修改数据
     *
     * @param operatorRole 实例对象
     * @return 实例对象
     */
    @Override
    public OperatorRole update(OperatorRole operatorRole) {
        this.operatorRoleDao.update(operatorRole);
        return this.queryById(operatorRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.operatorRoleDao.deleteById(id) > 0;
    }
}