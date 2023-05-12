package com.ruoyi.project.system.mapper;

import java.util.List;
import com.ruoyi.project.system.domain.ExamManage;

/**
 * 考试管理Mapper接口
 * 
 * @author ruoyi
 * @date 2023-05-12
 */
public interface ExamManageMapper 
{
    /**
     * 查询考试管理
     * 
     * @param id 考试管理主键
     * @return 考试管理
     */
    public ExamManage selectExamManageById(Long id);

    /**
     * 查询考试管理列表
     * 
     * @param examManage 考试管理
     * @return 考试管理集合
     */
    public List<ExamManage> selectExamManageList(ExamManage examManage);

    /**
     * 新增考试管理
     * 
     * @param examManage 考试管理
     * @return 结果
     */
    public int insertExamManage(ExamManage examManage);

    /**
     * 修改考试管理
     * 
     * @param examManage 考试管理
     * @return 结果
     */
    public int updateExamManage(ExamManage examManage);

    /**
     * 删除考试管理
     * 
     * @param id 考试管理主键
     * @return 结果
     */
    public int deleteExamManageById(Long id);

    /**
     * 批量删除考试管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteExamManageByIds(Long[] ids);
}
