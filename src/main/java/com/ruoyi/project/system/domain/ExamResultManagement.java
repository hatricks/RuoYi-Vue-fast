package com.ruoyi.project.system.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 成绩对象 exam_result_management
 *
 * @author ruoyi
 * @date 2023-05-12
 */
@Data
public class ExamResultManagement extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 学生名称
     */
    @Excel(name = "学生名称")
    private String examStudentName;

    /**
     * 学生编码
     */
    @Excel(name = "学生编码")
    private String examStudentCode;

    /**
     * 学生分数
     */
    @Excel(name = "学生分数")
    private String examStudentScore;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date createDateTime;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date updateDateTime;

    /**
     * 考试id-关联具体考试信息
     */
    @Excel(name = "考试id-关联具体考试信息")
    private Long examId;


    private String examName;

    private String examType;

    private String userCode;

}
