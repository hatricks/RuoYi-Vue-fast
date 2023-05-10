package com.ruoyi.project.manage.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.manage.mapper.TrainManagementMapper;
import com.ruoyi.project.manage.domain.TrainManagement;
import com.ruoyi.project.manage.service.ITrainManagementService;

/**
 * 培训管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-11
 */
@Service
public class TrainManagementServiceImpl implements ITrainManagementService 
{
    @Autowired
    private TrainManagementMapper trainManagementMapper;

    /**
     * 查询培训管理
     * 
     * @param id 培训管理主键
     * @return 培训管理
     */
    @Override
    public TrainManagement selectTrainManagementById(Long id)
    {
        return trainManagementMapper.selectTrainManagementById(id);
    }

    /**
     * 查询培训管理列表
     * 
     * @param trainManagement 培训管理
     * @return 培训管理
     */
    @Override
    public List<TrainManagement> selectTrainManagementList(TrainManagement trainManagement)
    {
        return trainManagementMapper.selectTrainManagementList(trainManagement);
    }

    /**
     * 新增培训管理
     * 
     * @param trainManagement 培训管理
     * @return 结果
     */
    @Override
    public int insertTrainManagement(TrainManagement trainManagement)
    {
        return trainManagementMapper.insertTrainManagement(trainManagement);
    }

    /**
     * 修改培训管理
     * 
     * @param trainManagement 培训管理
     * @return 结果
     */
    @Override
    public int updateTrainManagement(TrainManagement trainManagement)
    {
        return trainManagementMapper.updateTrainManagement(trainManagement);
    }

    /**
     * 批量删除培训管理
     * 
     * @param ids 需要删除的培训管理主键
     * @return 结果
     */
    @Override
    public int deleteTrainManagementByIds(Long[] ids)
    {
        return trainManagementMapper.deleteTrainManagementByIds(ids);
    }

    /**
     * 删除培训管理信息
     * 
     * @param id 培训管理主键
     * @return 结果
     */
    @Override
    public int deleteTrainManagementById(Long id)
    {
        return trainManagementMapper.deleteTrainManagementById(id);
    }
}
