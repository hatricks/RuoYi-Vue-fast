package com.ruoyi.project.system.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 考试管理对象 exam_manage
 *
 * @author ruoyi
 * @date 2023-05-12
 */
@Data
public class ExamManage extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 考试名称
     */
    @Excel(name = "考试名称")
    private String examName;

    /**
     * 开考时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开考时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date examDateTime;

    /**
     * 考试类型
     */
    @Excel(name = "考试类型")
    private String examType;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updateDate;

    private String userCode;
}
