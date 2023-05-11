package com.ruoyi.project.system.mapper;

import java.util.List;
import com.ruoyi.project.system.domain.UserSalary;

/**
 * 员工薪资Mapper接口
 * 
 * @author ruoyi
 * @date 2023-05-11
 */
public interface UserSalaryMapper 
{
    /**
     * 查询员工薪资
     * 
     * @param id 员工薪资主键
     * @return 员工薪资
     */
    public UserSalary selectUserSalaryById(Long id);

    /**
     * 查询员工薪资列表
     * 
     * @param userSalary 员工薪资
     * @return 员工薪资集合
     */
    public List<UserSalary> selectUserSalaryList(UserSalary userSalary);

    /**
     * 新增员工薪资
     * 
     * @param userSalary 员工薪资
     * @return 结果
     */
    public int insertUserSalary(UserSalary userSalary);

    /**
     * 修改员工薪资
     * 
     * @param userSalary 员工薪资
     * @return 结果
     */
    public int updateUserSalary(UserSalary userSalary);

    /**
     * 删除员工薪资
     * 
     * @param id 员工薪资主键
     * @return 结果
     */
    public int deleteUserSalaryById(Long id);

    /**
     * 批量删除员工薪资
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUserSalaryByIds(Long[] ids);
}
