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
import com.ruoyi.project.system.domain.UserSalary;
import com.ruoyi.project.system.service.IUserSalaryService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 员工薪资Controller
 * 
 * @author ruoyi
 * @date 2023-05-11
 */
@RestController
@RequestMapping("/system/salary")
public class UserSalaryController extends BaseController
{
    @Autowired
    private IUserSalaryService userSalaryService;

    /**
     * 查询员工薪资列表
     */
    @PreAuthorize("@ss.hasPermi('system:salary:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserSalary userSalary)
    {
        startPage();
        List<UserSalary> list = userSalaryService.selectUserSalaryList(userSalary);
        return getDataTable(list);
    }

    /**
     * 导出员工薪资列表
     */
    @PreAuthorize("@ss.hasPermi('system:salary:export')")
    @Log(title = "员工薪资", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserSalary userSalary)
    {
        List<UserSalary> list = userSalaryService.selectUserSalaryList(userSalary);
        ExcelUtil<UserSalary> util = new ExcelUtil<UserSalary>(UserSalary.class);
        util.exportExcel(response, list, "员工薪资数据");
    }

    /**
     * 获取员工薪资详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:salary:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(userSalaryService.selectUserSalaryById(id));
    }

    /**
     * 新增员工薪资
     */
    @PreAuthorize("@ss.hasPermi('system:salary:add')")
    @Log(title = "员工薪资", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserSalary userSalary)
    {
        return toAjax(userSalaryService.insertUserSalary(userSalary));
    }

    /**
     * 修改员工薪资
     */
    @PreAuthorize("@ss.hasPermi('system:salary:edit')")
    @Log(title = "员工薪资", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserSalary userSalary)
    {
        return toAjax(userSalaryService.updateUserSalary(userSalary));
    }

    /**
     * 删除员工薪资
     */
    @PreAuthorize("@ss.hasPermi('system:salary:remove')")
    @Log(title = "员工薪资", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(userSalaryService.deleteUserSalaryByIds(ids));
    }
}
