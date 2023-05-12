package com.ruoyi.project.manage.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 考试学生管理对象 exam_student_management
 * 
 * @author ruoyi
 * @date 2023-05-12
 */
public class ExamStudentManagement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;


    /** 用户ID */
    private Long userId;

    /** 学生名称 */
    @Excel(name = "学生名称")
    private String studentName;

    /** 由于时间关系，将学生密码存储在这里 */
    @Excel(name = "由于时间关系，将学生密码存储在这里")
    private String studentPassword;

    /** 已提交 0  已通过 1  当前申请状态 */
    @Excel(name = "已提交 0  已通过 1  当前申请状态")
    private String status;

    /** 邮件 */
    @Excel(name = "邮件")
    private String email;

    /** 考试名称 */
    @Excel(name = "考试名称")
    private String examName;

    /** 考试类型 */
    @Excel(name = "考试类型")
    private String examType;

    /** 考试时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "考试时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date examDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date createDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date updateDate;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public String getStudentName() 
    {
        return studentName;
    }
    public void setStudentPassword(String studentPassword) 
    {
        this.studentPassword = studentPassword;
    }

    public String getStudentPassword() 
    {
        return studentPassword;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setExamName(String examName) 
    {
        this.examName = examName;
    }

    public String getExamName() 
    {
        return examName;
    }
    public void setExamType(String examType) 
    {
        this.examType = examType;
    }

    public String getExamType() 
    {
        return examType;
    }
    public void setExamDate(Date examDate) 
    {
        this.examDate = examDate;
    }

    public Date getExamDate() 
    {
        return examDate;
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
            .append("studentName", getStudentName())
            .append("studentPassword", getStudentPassword())
            .append("status", getStatus())
            .append("email", getEmail())
            .append("examName", getExamName())
            .append("examType", getExamType())
            .append("examDate", getExamDate())
            .append("createDate", getCreateDate())
            .append("updateDate", getUpdateDate())
            .toString();
    }
}
