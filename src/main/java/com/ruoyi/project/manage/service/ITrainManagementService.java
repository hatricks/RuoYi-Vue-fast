package com.ruoyi.project.manage.service;

import java.util.List;
import com.ruoyi.project.manage.domain.TrainManagement;

/**
 * 培训管理Service接口
 * 
 * @author ruoyi
 * @date 2023-05-11
 */
public interface ITrainManagementService 
{
    /**
     * 查询培训管理
     * 
     * @param id 培训管理主键
     * @return 培训管理
     */
    public TrainManagement selectTrainManagementById(Long id);

    /**
     * 查询培训管理列表
     * 
     * @param trainManagement 培训管理
     * @return 培训管理集合
     */
    public List<TrainManagement> selectTrainManagementList(TrainManagement trainManagement);

    /**
     * 新增培训管理
     * 
     * @param trainManagement 培训管理
     * @return 结果
     */
    public int insertTrainManagement(TrainManagement trainManagement);

    /**
     * 修改培训管理
     * 
     * @param trainManagement 培训管理
     * @return 结果
     */
    public int updateTrainManagement(TrainManagement trainManagement);

    /**
     * 批量删除培训管理
     * 
     * @param ids 需要删除的培训管理主键集合
     * @return 结果
     */
    public int deleteTrainManagementByIds(Long[] ids);

    /**
     * 删除培训管理信息
     * 
     * @param id 培训管理主键
     * @return 结果
     */
    public int deleteTrainManagementById(Long id);
}
