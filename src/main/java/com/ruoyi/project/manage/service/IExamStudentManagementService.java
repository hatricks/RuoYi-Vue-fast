package com.ruoyi.project.manage.service;

import java.util.List;
import com.ruoyi.project.manage.domain.ExamStudentManagement;

/**
 * 考试学生管理Service接口
 * 
 * @author ruoyi
 * @date 2023-05-12
 */
public interface IExamStudentManagementService 
{
    /**
     * 查询考试学生管理
     * 
     * @param id 考试学生管理主键
     * @return 考试学生管理
     */
    public ExamStudentManagement selectExamStudentManagementById(Long id);

    /**
     * 查询考试学生管理列表
     * 
     * @param examStudentManagement 考试学生管理
     * @return 考试学生管理集合
     */
    public List<ExamStudentManagement> selectExamStudentManagementList(ExamStudentManagement examStudentManagement);

    /**
     * 新增考试学生管理
     * 
     * @param examStudentManagement 考试学生管理
     * @return 结果
     */
    public int insertExamStudentManagement(ExamStudentManagement examStudentManagement);

    /**
     * 修改考试学生管理
     * 
     * @param examStudentManagement 考试学生管理
     * @return 结果
     */
    public int updateExamStudentManagement(ExamStudentManagement examStudentManagement);

    /**
     * 批量删除考试学生管理
     * 
     * @param ids 需要删除的考试学生管理主键集合
     * @return 结果
     */
    public int deleteExamStudentManagementByIds(Long[] ids);

    /**
     * 删除考试学生管理信息
     * 
     * @param id 考试学生管理主键
     * @return 结果
     */
    public int deleteExamStudentManagementById(Long id);

    int updateUserStatus(ExamStudentManagement examStudentManagement);
}
