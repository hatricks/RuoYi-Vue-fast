package com.ruoyi.project.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.mapper.UserSalaryMapper;
import com.ruoyi.project.system.domain.UserSalary;
import com.ruoyi.project.system.service.IUserSalaryService;

/**
 * 员工薪资Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-11
 */
@Service
public class UserSalaryServiceImpl implements IUserSalaryService 
{
    @Autowired
    private UserSalaryMapper userSalaryMapper;

    /**
     * 查询员工薪资
     * 
     * @param id 员工薪资主键
     * @return 员工薪资
     */
    @Override
    public UserSalary selectUserSalaryById(Long id)
    {
        return userSalaryMapper.selectUserSalaryById(id);
    }

    /**
     * 查询员工薪资列表
     * 
     * @param userSalary 员工薪资
     * @return 员工薪资
     */
    @Override
    public List<UserSalary> selectUserSalaryList(UserSalary userSalary)
    {
        return userSalaryMapper.selectUserSalaryList(userSalary);
    }

    /**
     * 新增员工薪资
     * 
     * @param userSalary 员工薪资
     * @return 结果
     */
    @Override
    public int insertUserSalary(UserSalary userSalary)
    {
        return userSalaryMapper.insertUserSalary(userSalary);
    }

    /**
     * 修改员工薪资
     * 
     * @param userSalary 员工薪资
     * @return 结果
     */
    @Override
    public int updateUserSalary(UserSalary userSalary)
    {
        return userSalaryMapper.updateUserSalary(userSalary);
    }

    /**
     * 批量删除员工薪资
     * 
     * @param ids 需要删除的员工薪资主键
     * @return 结果
     */
    @Override
    public int deleteUserSalaryByIds(Long[] ids)
    {
        return userSalaryMapper.deleteUserSalaryByIds(ids);
    }

    /**
     * 删除员工薪资信息
     * 
     * @param id 员工薪资主键
     * @return 结果
     */
    @Override
    public int deleteUserSalaryById(Long id)
    {
        return userSalaryMapper.deleteUserSalaryById(id);
    }
}
