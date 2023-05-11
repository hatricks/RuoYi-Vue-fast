package com.ruoyi.project.manage.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 培训管理对象 train_management
 * 
 * @author ruoyi
 * @date 2023-05-11
 */
public class TrainManagement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 培训计划名称 */
    @Excel(name = "培训计划名称")
    private String trainTitle;

    /** 培训人 */
    @Excel(name = "培训人")
    private String trainPersonName;

    /** 培训宗旨 */
    @Excel(name = "培训宗旨")
    private String trainMessage;

    /** 培训时间 */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Excel(name = "培训时间", width = 30, dateFormat = "yyyy-MM-dd hh:mm:ss")
    private Date trainDatetime;

    /** 培训地址 */
    @Excel(name = "培训地址")
    private String trainAddress;

    /** 培训计划详情 */
    @Excel(name = "培训计划详情")
    private String trainDesc;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd hh:mm:ss")
    private Date createDate;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd hh:mm:ss")
    private Date updateDate;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTrainTitle(String trainTitle) 
    {
        this.trainTitle = trainTitle;
    }

    public String getTrainTitle() 
    {
        return trainTitle;
    }
    public void setTrainPersonName(String trainPersonName) 
    {
        this.trainPersonName = trainPersonName;
    }

    public String getTrainPersonName() 
    {
        return trainPersonName;
    }
    public void setTrainMessage(String trainMessage) 
    {
        this.trainMessage = trainMessage;
    }

    public String getTrainMessage() 
    {
        return trainMessage;
    }
    public void setTrainDatetime(Date trainDatetime) 
    {
        this.trainDatetime = trainDatetime;
    }

    public Date getTrainDatetime() 
    {
        return trainDatetime;
    }
    public void setTrainAddress(String trainAddress) 
    {
        this.trainAddress = trainAddress;
    }

    public String getTrainAddress() 
    {
        return trainAddress;
    }
    public void setTrainDesc(String trainDesc) 
    {
        this.trainDesc = trainDesc;
    }

    public String getTrainDesc() 
    {
        return trainDesc;
    }
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }

    public Date getCreateDate() 
    {
        return createDate;
    }
    public void setUpdateDate(Date updateDate) 
    {
        this.updateDate = updateDate;
    }

    public Date getUpdateDate() 
    {
        return updateDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("trainTitle", getTrainTitle())
            .append("trainPersonName", getTrainPersonName())
            .append("trainMessage", getTrainMessage())
            .append("trainDatetime", getTrainDatetime())
            .append("trainAddress", getTrainAddress())
            .append("trainDesc", getTrainDesc())
            .append("createDate", getCreateDate())
            .append("updateDate", getUpdateDate())
            .toString();
    }
}
