package com.school.tuition.service.impl;

import com.school.tuition.dao.StudentClassDao;
import com.school.tuition.entity.StudentClass;
import com.school.tuition.service.StudentClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (StudentClass)表服务实现类
 *
 * @author makejava
 * @since 2020-07-12 19:21:17
 */
@Service("studentClassService")
public class StudentClassServiceImpl implements StudentClassService {
    @Resource
    private StudentClassDao studentClassDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public StudentClass queryById(Integer id) {
        return this.studentClassDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<StudentClass> queryAllByLimit(int offset, int limit) {
        return this.studentClassDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param studentClass 实例对象
     * @return 实例对象
     */
    @Override
    public StudentClass insert(StudentClass studentClass) {
        this.studentClassDao.insert(studentClass);
        return studentClass;
    }

    /**
     * 修改数据
     *
     * @param studentClass 实例对象
     * @return 实例对象
     */
    @Override
    public StudentClass update(StudentClass studentClass) {
        this.studentClassDao.update(studentClass);
        return this.queryById(studentClass.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.studentClassDao.deleteById(id) > 0;
    }
}