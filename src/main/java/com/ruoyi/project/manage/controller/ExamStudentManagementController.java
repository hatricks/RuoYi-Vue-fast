package com.ruoyi.project.manage.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.manage.domain.ExamStudentManagement;
import com.ruoyi.project.manage.service.IExamStudentManagementService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 考试学生管理Controller
 *
 * @author ruoyi
 * @date 2023-05-12
 */
@RestController
@RequestMapping("/manage/student")
public class ExamStudentManagementController extends BaseController {
    @Autowired
    private IExamStudentManagementService examStudentManagementService;

    /**
     * 查询考试学生管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:student:list')")
    @GetMapping("/list")
    public TableDataInfo list(ExamStudentManagement examStudentManagement) {
        startPage();
        List<ExamStudentManagement> list = examStudentManagementService.selectExamStudentManagementList(examStudentManagement);
        return getDataTable(list);
    }

    /**
     * 导出考试学生管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:student:export')")
    @Log(title = "考试学生管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ExamStudentManagement examStudentManagement) {
        List<ExamStudentManagement> list = examStudentManagementService.selectExamStudentManagementList(examStudentManagement);
        ExcelUtil<ExamStudentManagement> util = new ExcelUtil<ExamStudentManagement>(ExamStudentManagement.class);
        util.exportExcel(response, list, "考试学生管理数据");
    }

    /**
     * 获取考试学生管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('manage:student:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(examStudentManagementService.selectExamStudentManagementById(id));
    }

    /**
     * 新增考试学生管理
     */
    @PreAuthorize("@ss.hasPermi('manage:student:add')")
    @Log(title = "考试学生管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ExamStudentManagement examStudentManagement) {
        return toAjax(examStudentManagementService.insertExamStudentManagement(examStudentManagement));
    }

    /**
     * 修改考试学生管理
     */
    @PreAuthorize("@ss.hasPermi('manage:student:edit')")
    @Log(title = "考试学生管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ExamStudentManagement examStudentManagement) {
        return toAjax(examStudentManagementService.updateExamStudentManagement(examStudentManagement));
    }


    /**
     * 修改考试学生管理
     */
    @PreAuthorize("@ss.hasPermi('manage:student:edit')")
    @Log(title = "考试学生管理", businessType = BusinessType.UPDATE)
    @PostMapping("/updateStatus")
    public AjaxResult updateUserStatus(@RequestBody ExamStudentManagement examStudentManagement) {
        return toAjax(examStudentManagementService.updateUserStatus(examStudentManagement));
    }

    /**
     * 删除考试学生管理
     */
    @PreAuthorize("@ss.hasPermi('manage:student:remove')")
    @Log(title = "考试学生管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(examStudentManagementService.deleteExamStudentManagementByIds(ids));
    }
}
