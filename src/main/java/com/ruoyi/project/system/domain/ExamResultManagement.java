package com.ruoyi.project.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
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
public class ExamResultManagement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 学生名称 */
    @Excel(name = "学生名称")
    private String examStudentName;

    /** 学生编码 */
    @Excel(name = "学生编码")
    private String examStudentCode;

    /** 学生分数 */
    @Excel(name = "学生分数")
    private String examStudentScore;

    /** 考试id-关联具体考试信息 */
    @Excel(name = "考试id-关联具体考试信息")
    private Long examId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date createDateTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date updateDateTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setExamStudentName(String examStudentName) 
    {
        this.examStudentName = examStudentName;
    }

    public String getExamStudentName() 
    {
        return examStudentName;
    }
    public void setExamStudentCode(String examStudentCode) 
    {
        this.examStudentCode = examStudentCode;
    }

    public String getExamStudentCode() 
    {
        return examStudentCode;
    }
    public void setExamStudentScore(String examStudentScore) 
    {
        this.examStudentScore = examStudentScore;
    }

    public String getExamStudentScore() 
    {
        return examStudentScore;
    }
    public void setExamId(Long examId) 
    {
        this.examId = examId;
    }

    public Long getExamId() 
    {
        return examId;
    }
    public void setCreateDateTime(Date createDateTime) 
    {
        this.createDateTime = createDateTime;
    }

    public Date getCreateDateTime() 
    {
        return createDateTime;
    }
    public void setUpdateDateTime(Date updateDateTime) 
    {
        this.updateDateTime = updateDateTime;
    }

    public Date getUpdateDateTime() 
    {
        return updateDateTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("examStudentName", getExamStudentName())
            .append("examStudentCode", getExamStudentCode())
            .append("examStudentScore", getExamStudentScore())
            .append("examId", getExamId())
            .append("createDateTime", getCreateDateTime())
            .append("updateDateTime", getUpdateDateTime())
            .toString();
    }
}
