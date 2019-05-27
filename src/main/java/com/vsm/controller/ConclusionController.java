package com.vsm.controller;


import com.vsm.entity.request.*;
import com.vsm.entity.result.Result;
import com.vsm.service.ConclusionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ConclusionController {

    @Autowired
    private ConclusionService conclusionService;

    /**
     * 插入
     *
     * @param requestModel
     * @return
     */
    @PostMapping("/v1/vsm/conclusion/insert")
    public Result<String> insert(@RequestBody ConclusionInsertRequestModel requestModel) {
        return conclusionService.insert(requestModel);
    }


    /**
     * 删除
     *
     * @param requestModel
     * @return
     */
    @PostMapping("/v1/vsm/conclusion/delete")
    public Result<String> delete(@RequestBody ConclusionDeleteRequestModel requestModel) {
        return conclusionService.delete(requestModel);
    }

    /**
     * 查询
     *
     * @param requestModel
     * @return
     */
    @PostMapping("/v1/vsm/conclusion/select")
    public Result<String> select(@RequestBody ConclusionSelectRequestModel requestModel) {
        return conclusionService.select(requestModel);
    }

    /**
     * 资料提交
     *
     * @param requestModel
     * @return
     */
    @PostMapping("/v1/vsm/conclusion/submit")
    public Result<String> submit(@RequestBody ConclusionSubmitRequestModel requestModel) {
        return conclusionService.submit(requestModel);
    }
}
