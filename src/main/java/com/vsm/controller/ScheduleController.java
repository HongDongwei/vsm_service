package com.vsm.controller;


import com.vsm.entity.request.*;
import com.vsm.entity.result.Result;
import com.vsm.service.ConclusionService;
import com.vsm.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    /**
     * 插入
     *
     * @param requestModel
     * @return
     */
    @PostMapping("/v1/vsm/schedule/insert")
    public Result<String> insert(@RequestBody ScheduleInsertRequestModel requestModel) {
        return scheduleService.insert(requestModel);
    }


    /**
     * 查询
     *
     * @param requestModel
     * @return
     */
    @PostMapping("/v1/vsm/schedule/select")
    public Result<String> select(@RequestBody ScheduleSelectRequestModel requestModel) {
        return scheduleService.select(requestModel);
    }


    /**
     * 删除
     *
     * @param requestModel
     * @return
     */
    @PostMapping("/v1/vsm/schedule/delete")
    public Result<String> delete(@RequestBody ScheduleDeleteRequestModel requestModel) {
        return scheduleService.delete(requestModel);
    }

    /**
     * 资料提交
     *
     * @param requestModel
     * @return
     */
    @PostMapping("/v1/vsm/schedule/submit")
    public Result<String> submit(@RequestBody ScheduleSubmitRequestModel requestModel) {
        return scheduleService.submit(requestModel);
    }


}
