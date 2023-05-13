package com.ruoyi.project.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import cn.hutool.core.collection.CollUtil;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.framework.security.LoginUser;
import com.ruoyi.project.system.domain.SysRole;
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
import com.ruoyi.project.system.domain.ExamResultManagement;
import com.ruoyi.project.system.service.IExamResultManagementService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 成绩Controller
 *
 * @author ruoyi
 * @date 2023-05-12
 */
@RestController
@RequestMapping("/system/result")
public class ExamResultManagementController extends BaseController {
    @Autowired
    private IExamResultManagementService examResultManagementService;

    /**
     * 查询成绩列表
     */
    @PreAuthorize("@ss.hasPermi('system:result:list')")
    @GetMapping("/list")
    public TableDataInfo list(ExamResultManagement examResultManagement) {
        LoginUser loginUser = SecurityUtils.getLoginUser();
        List<SysRole> roles = loginUser.getUser().getRoles();
        if (CollUtil.isNotEmpty(roles)) {
            roles.stream().filter(x -> x.getRoleId().equals(100L)).findAny().ifPresent(x -> {
                examResultManagement.setUserCode(loginUser.getUsername());
            });
        }
        startPage();
        List<ExamResultManagement> list = examResultManagementService.selectExamResultManagementList(examResultManagement);
        return getDataTable(list);
    }

    /**
     * 导出成绩列表
     */
    @PreAuthorize("@ss.hasPermi('system:result:export')")
    @Log(title = "成绩", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ExamResultManagement examResultManagement) {
        List<ExamResultManagement> list = examResultManagementService.selectExamResultManagementList(examResultManagement);
        ExcelUtil<ExamResultManagement> util = new ExcelUtil<ExamResultManagement>(ExamResultManagement.class);
        util.exportExcel(response, list, "成绩数据");
    }

    /**
     * 获取成绩详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:result:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(examResultManagementService.selectExamResultManagementById(id));
    }

    /**
     * 新增成绩
     */
    @PreAuthorize("@ss.hasPermi('system:result:add')")
    @Log(title = "成绩", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ExamResultManagement examResultManagement) {
        return toAjax(examResultManagementService.insertExamResultManagement(examResultManagement));
    }

    /**
     * 修改成绩
     */
    @PreAuthorize("@ss.hasPermi('system:result:edit')")
    @Log(title = "成绩", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ExamResultManagement examResultManagement) {
        return toAjax(examResultManagementService.updateExamResultManagement(examResultManagement));
    }

    /**
     * 删除成绩
     */
    @PreAuthorize("@ss.hasPermi('system:result:remove')")
    @Log(title = "成绩", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(examResultManagementService.deleteExamResultManagementByIds(ids));
    }
}
