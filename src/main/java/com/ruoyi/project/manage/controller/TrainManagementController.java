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
import com.ruoyi.project.manage.domain.TrainManagement;
import com.ruoyi.project.manage.service.ITrainManagementService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 培训管理Controller
 * 
 * @author ruoyi
 * @date 2023-05-11
 */
@RestController
@RequestMapping("/manage/management")
public class TrainManagementController extends BaseController
{
    @Autowired
    private ITrainManagementService trainManagementService;

    /**
     * 查询培训管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:management:list')")
    @GetMapping("/list")
    public TableDataInfo list(TrainManagement trainManagement)
    {
        startPage();
        List<TrainManagement> list = trainManagementService.selectTrainManagementList(trainManagement);
        return getDataTable(list);
    }

    /**
     * 导出培训管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:management:export')")
    @Log(title = "培训管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TrainManagement trainManagement)
    {
        List<TrainManagement> list = trainManagementService.selectTrainManagementList(trainManagement);
        ExcelUtil<TrainManagement> util = new ExcelUtil<TrainManagement>(TrainManagement.class);
        util.exportExcel(response, list, "培训管理数据");
    }

    /**
     * 获取培训管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('manage:management:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(trainManagementService.selectTrainManagementById(id));
    }

    /**
     * 新增培训管理
     */
    @PreAuthorize("@ss.hasPermi('manage:management:add')")
    @Log(title = "培训管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TrainManagement trainManagement)
    {
        return toAjax(trainManagementService.insertTrainManagement(trainManagement));
    }

    /**
     * 修改培训管理
     */
    @PreAuthorize("@ss.hasPermi('manage:management:edit')")
    @Log(title = "培训管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TrainManagement trainManagement)
    {
        return toAjax(trainManagementService.updateTrainManagement(trainManagement));
    }

    /**
     * 删除培训管理
     */
    @PreAuthorize("@ss.hasPermi('manage:management:remove')")
    @Log(title = "培训管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(trainManagementService.deleteTrainManagementByIds(ids));
    }
}
