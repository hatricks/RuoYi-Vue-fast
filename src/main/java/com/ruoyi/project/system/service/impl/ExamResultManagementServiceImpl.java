package com.ruoyi.project.system.service.impl;

import java.util.List;

import cn.hutool.core.util.NumberUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.mapper.ExamResultManagementMapper;
import com.ruoyi.project.system.domain.ExamResultManagement;
import com.ruoyi.project.system.service.IExamResultManagementService;

/**
 * 成绩Service业务层处理
 *
 * @author ruoyi
 * @date 2023-05-12
 */
@Service
public class ExamResultManagementServiceImpl implements IExamResultManagementService {
    @Autowired
    private ExamResultManagementMapper examResultManagementMapper;

    /**
     * 查询成绩
     *
     * @param id 成绩主键
     * @return 成绩
     */
    @Override
    public ExamResultManagement selectExamResultManagementById(Long id) {
        return examResultManagementMapper.selectExamResultManagementById(id);
    }

    /**
     * 查询成绩列表
     *
     * @param examResultManagement 成绩
     * @return 成绩
     */
    @Override
    public List<ExamResultManagement> selectExamResultManagementList(ExamResultManagement examResultManagement) {
        List<ExamResultManagement> examResultManagements = examResultManagementMapper.selectExamResultManagementList(examResultManagement);
        for (ExamResultManagement resultManagement : examResultManagements) {
            // 考试分数
            String examStudentScore = resultManagement.getExamStudentScore();
            // 基准分数
            String examScore = resultManagement.getExamScore();
            //状态
            double ess = NumberUtil.parseDouble(examStudentScore);
            double es = NumberUtil.parseDouble(examScore);
            String baseScore = NumberUtil.compare(ess, es) >= 0 ? "已通过" : "未通过";
            resultManagement.setExamStatus(baseScore);
        }
        return examResultManagements;
    }

    /**
     * 新增成绩
     *
     * @param examResultManagement 成绩
     * @return 结果
     */
    @Override
    public int insertExamResultManagement(ExamResultManagement examResultManagement) {
        return examResultManagementMapper.insertExamResultManagement(examResultManagement);
    }

    /**
     * 修改成绩
     *
     * @param examResultManagement 成绩
     * @return 结果
     */
    @Override
    public int updateExamResultManagement(ExamResultManagement examResultManagement) {
        return examResultManagementMapper.updateExamResultManagement(examResultManagement);
    }

    /**
     * 批量删除成绩
     *
     * @param ids 需要删除的成绩主键
     * @return 结果
     */
    @Override
    public int deleteExamResultManagementByIds(Long[] ids) {
        return examResultManagementMapper.deleteExamResultManagementByIds(ids);
    }

    /**
     * 删除成绩信息
     *
     * @param id 成绩主键
     * @return 结果
     */
    @Override
    public int deleteExamResultManagementById(Long id) {
        return examResultManagementMapper.deleteExamResultManagementById(id);
    }
}
