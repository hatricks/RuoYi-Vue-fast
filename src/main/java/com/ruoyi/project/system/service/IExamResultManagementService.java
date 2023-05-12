package com.ruoyi.project.system.service;

import java.util.List;
import com.ruoyi.project.system.domain.ExamResultManagement;

/**
 * 成绩Service接口
 * 
 * @author ruoyi
 * @date 2023-05-12
 */
public interface IExamResultManagementService 
{
    /**
     * 查询成绩
     * 
     * @param id 成绩主键
     * @return 成绩
     */
    public ExamResultManagement selectExamResultManagementById(Long id);

    /**
     * 查询成绩列表
     * 
     * @param examResultManagement 成绩
     * @return 成绩集合
     */
    public List<ExamResultManagement> selectExamResultManagementList(ExamResultManagement examResultManagement);

    /**
     * 新增成绩
     * 
     * @param examResultManagement 成绩
     * @return 结果
     */
    public int insertExamResultManagement(ExamResultManagement examResultManagement);

    /**
     * 修改成绩
     * 
     * @param examResultManagement 成绩
     * @return 结果
     */
    public int updateExamResultManagement(ExamResultManagement examResultManagement);

    /**
     * 批量删除成绩
     * 
     * @param ids 需要删除的成绩主键集合
     * @return 结果
     */
    public int deleteExamResultManagementByIds(Long[] ids);

    /**
     * 删除成绩信息
     * 
     * @param id 成绩主键
     * @return 结果
     */
    public int deleteExamResultManagementById(Long id);
}
