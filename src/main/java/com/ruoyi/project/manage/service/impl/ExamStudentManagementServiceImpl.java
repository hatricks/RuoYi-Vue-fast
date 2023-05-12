package com.ruoyi.project.manage.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.manage.mapper.ExamStudentManagementMapper;
import com.ruoyi.project.manage.domain.ExamStudentManagement;
import com.ruoyi.project.manage.service.IExamStudentManagementService;

/**
 * 考试学生管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-12
 */
@Service
public class ExamStudentManagementServiceImpl implements IExamStudentManagementService 
{
    @Autowired
    private ExamStudentManagementMapper examStudentManagementMapper;

    /**
     * 查询考试学生管理
     * 
     * @param id 考试学生管理主键
     * @return 考试学生管理
     */
    @Override
    public ExamStudentManagement selectExamStudentManagementById(Long id)
    {
        return examStudentManagementMapper.selectExamStudentManagementById(id);
    }

    /**
     * 查询考试学生管理列表
     * 
     * @param examStudentManagement 考试学生管理
     * @return 考试学生管理
     */
    @Override
    public List<ExamStudentManagement> selectExamStudentManagementList(ExamStudentManagement examStudentManagement)
    {
        return examStudentManagementMapper.selectExamStudentManagementList(examStudentManagement);
    }

    /**
     * 新增考试学生管理
     * 
     * @param examStudentManagement 考试学生管理
     * @return 结果
     */
    @Override
    public int insertExamStudentManagement(ExamStudentManagement examStudentManagement)
    {
        return examStudentManagementMapper.insertExamStudentManagement(examStudentManagement);
    }

    /**
     * 修改考试学生管理
     * 
     * @param examStudentManagement 考试学生管理
     * @return 结果
     */
    @Override
    public int updateExamStudentManagement(ExamStudentManagement examStudentManagement)
    {
        return examStudentManagementMapper.updateExamStudentManagement(examStudentManagement);
    }

    /**
     * 批量删除考试学生管理
     * 
     * @param ids 需要删除的考试学生管理主键
     * @return 结果
     */
    @Override
    public int deleteExamStudentManagementByIds(Long[] ids)
    {
        return examStudentManagementMapper.deleteExamStudentManagementByIds(ids);
    }

    /**
     * 删除考试学生管理信息
     * 
     * @param id 考试学生管理主键
     * @return 结果
     */
    @Override
    public int deleteExamStudentManagementById(Long id)
    {
        return examStudentManagementMapper.deleteExamStudentManagementById(id);
    }
}
