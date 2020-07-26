package com.school.tuition.service.impl;

import com.school.tuition.dao.OperatorDao;
import com.school.tuition.entity.Operator;
import com.school.tuition.service.OperatorService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Operator)表服务实现类
 *
 * @author makejava
 * @since 2020-07-12 19:21:12
 */
@Service("operatorService")
public class OperatorServiceImpl implements OperatorService, UserDetailsService {
    @Resource
    private OperatorDao operatorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Operator queryById(Integer id) {
        return this.operatorDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Operator> queryAllByLimit(int offset, int limit) {
        return this.operatorDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param operator 实例对象
     * @return 实例对象
     */
    @Override
    public Operator insert(Operator operator) {
        this.operatorDao.insert(operator);
        return operator;
    }

    /**
     * 修改数据
     *
     * @param operator 实例对象
     * @return 实例对象
     */
    @Override
    public Operator update(Operator operator) {
        this.operatorDao.update(operator);
        return this.queryById(operator.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.operatorDao.deleteById(id) > 0;
    }

    @Override
    public UserDetails loadUserByUsername(String userAccount) throws UsernameNotFoundException {
        Operator operator = operatorDao.loadUserByUsername(userAccount);
        if(operator == null){
            throw new UsernameNotFoundException(String.format("User Account:[%s] does not exist!",userAccount));
        }
        operator.setRoles(operatorDao.getUserRoles(operator.getId()));
        return operator;
    }
}