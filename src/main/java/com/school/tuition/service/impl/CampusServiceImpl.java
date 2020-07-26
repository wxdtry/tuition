package com.school.tuition.service.impl;

import com.school.tuition.dao.CampusDao;
import com.school.tuition.entity.Campus;
import com.school.tuition.service.CampusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Campus)表服务实现类
 *
 * @author makejava
 * @since 2020-07-12 19:18:14
 */
@Service("campusService")
public class CampusServiceImpl implements CampusService {
    @Resource
    private CampusDao campusDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Campus queryById(Integer id) {
        return this.campusDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Campus> queryAllByLimit(int offset, int limit) {
        return this.campusDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param campus 实例对象
     * @return 实例对象
     */
    @Override
    public Campus insert(Campus campus) {
        this.campusDao.insert(campus);
        return campus;
    }

    /**
     * 修改数据
     *
     * @param campus 实例对象
     * @return 实例对象
     */
    @Override
    public Campus update(Campus campus) {
        this.campusDao.update(campus);
        return this.queryById(campus.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.campusDao.deleteById(id) > 0;
    }
}