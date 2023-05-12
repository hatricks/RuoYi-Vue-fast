package com.ruoyi.project.system.controller;

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
import com.ruoyi.project.system.domain.ExamManage;
import com.ruoyi.project.system.service.IExamManageService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 考试管理Controller
 * 
 * @author ruoyi
 * @date 2023-05-12
 */
@RestController
@RequestMapping("/system/exam")
public class ExamManageController extends BaseController
{
    @Autowired
    private IExamManageService examManageService;

    /**
     * 查询考试管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:exam:list')")
    @GetMapping("/list")
    public TableDataInfo list(ExamManage examManage)
    {
        startPage();
        List<ExamManage> list = examManageService.selectExamManageList(examManage);
        return getDataTable(list);
    }

    /**
     * 导出考试管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:exam:export')")
    @Log(title = "考试管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ExamManage examManage)
    {
        List<ExamManage> list = examManageService.selectExamManageList(examManage);
        ExcelUtil<ExamManage> util = new ExcelUtil<ExamManage>(ExamManage.class);
        util.exportExcel(response, list, "考试管理数据");
    }

    /**
     * 获取考试管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:exam:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(examManageService.selectExamManageById(id));
    }

    /**
     * 新增考试管理
     */
    @PreAuthorize("@ss.hasPermi('system:exam:add')")
    @Log(title = "考试管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ExamManage examManage)
    {
        return toAjax(examManageService.insertExamManage(examManage));
    }

    /**
     * 修改考试管理
     */
    @PreAuthorize("@ss.hasPermi('system:exam:edit')")
    @Log(title = "考试管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ExamManage examManage)
    {
        return toAjax(examManageService.updateExamManage(examManage));
    }

    /**
     * 删除考试管理
     */
    @PreAuthorize("@ss.hasPermi('system:exam:remove')")
    @Log(title = "考试管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(examManageService.deleteExamManageByIds(ids));
    }
}
