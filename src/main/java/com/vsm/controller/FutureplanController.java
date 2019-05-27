package com.vsm.controller;


import com.vsm.entity.request.FuturePlanDeleteRequestModel;
import com.vsm.entity.request.FutureplanInsertRequestModel;
import com.vsm.entity.request.FutureplanSelectRequestModel;
import com.vsm.entity.request.ScheduleSelectRequestModel;
import com.vsm.entity.result.Result;
import com.vsm.service.FutureplanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class FutureplanController {

    @Autowired
    private FutureplanService futureplanService;

    /**
     * 插入
     *
     * @param requestModel
     * @return
     */
    @PostMapping("/v1/vsm/futureplan/insert")
    public Result<String> insert(@RequestBody FutureplanInsertRequestModel requestModel) {
        return futureplanService.insert(requestModel);
    }


    /**
     * 删除
     *
     * @param requestModel
     * @return
     */
    @PostMapping("/v1/vsm/futureplan/delete")
    public Result<String> delete(@RequestBody FuturePlanDeleteRequestModel requestModel) {
        return futureplanService.delete(requestModel);
    }

    /**
     * 查询
     *
     * @param futureplanSelectRequestModel
     * @return
     */
    @PostMapping("/v1/vsm/futureplan/select")
    public Result<String> select(@RequestBody FutureplanSelectRequestModel futureplanSelectRequestModel) {
        return futureplanService.select(futureplanSelectRequestModel);
    }


}
