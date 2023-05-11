package com.ruoyi.project.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 员工薪资对象 user_salary
 * 
 * @author ruoyi
 * @date 2023-05-11
 */
public class UserSalary extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 员工编号 */
    @Excel(name = "员工编号")
    private String userCode;

    /** 员工名称 */
    @Excel(name = "员工名称")
    private String userName;

    /** 员工所属部门 */
    @Excel(name = "员工所属部门")
    private String userSourceDept;

    /** 基本薪资 */
    @Excel(name = "基本薪资")
    private String baseMoney;

    /** 保险费 */
    @Excel(name = "保险费")
    private String insuranceMoney;

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
    public void setUserCode(String userCode) 
    {
        this.userCode = userCode;
    }

    public String getUserCode() 
    {
        return userCode;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setUserSourceDept(String userSourceDept) 
    {
        this.userSourceDept = userSourceDept;
    }

    public String getUserSourceDept() 
    {
        return userSourceDept;
    }
    public void setBaseMoney(String baseMoney) 
    {
        this.baseMoney = baseMoney;
    }

    public String getBaseMoney() 
    {
        return baseMoney;
    }
    public void setInsuranceMoney(String insuranceMoney) 
    {
        this.insuranceMoney = insuranceMoney;
    }

    public String getInsuranceMoney() 
    {
        return insuranceMoney;
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
            .append("userCode", getUserCode())
            .append("userName", getUserName())
            .append("userSourceDept", getUserSourceDept())
            .append("baseMoney", getBaseMoney())
            .append("insuranceMoney", getInsuranceMoney())
            .append("createDate", getCreateDate())
            .append("updateDate", getUpdateDate())
            .toString();
    }
}
