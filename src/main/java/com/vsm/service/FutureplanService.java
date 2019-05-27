package com.vsm.service;


import com.vsm.dao.FuturePlanDao;
import com.vsm.entity.Futureplan;
import com.vsm.entity.Schedule;
import com.vsm.entity.request.FuturePlanDeleteRequestModel;
import com.vsm.entity.request.FutureplanInsertRequestModel;
import com.vsm.entity.request.FutureplanSelectRequestModel;
import com.vsm.entity.request.ScheduleSelectRequestModel;
import com.vsm.entity.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FutureplanService {


    @Autowired
    private FuturePlanDao futurePlanDao;

    /**
     * 插入
     *
     * @param requestModel
     * @return
     */
    public Result<String> insert(FutureplanInsertRequestModel requestModel) {
        futurePlanDao.insertFuturePlan(requestModel);
        return Result.success();
    }

    /**
     * 删除
     *
     * @param requestModel
     * @return
     */
    public Result<String> delete(FuturePlanDeleteRequestModel requestModel) {
        futurePlanDao.deleteById(requestModel);
        return Result.success();
    }

    /**
     * 查询
     *
     * @param futureplanSelectRequestModel
     * @return
     */
    public Result<String> select(FutureplanSelectRequestModel futureplanSelectRequestModel) {
        List<Futureplan> futureplans = futurePlanDao.selectById(futureplanSelectRequestModel);
        return Result.success(futureplans);
    }
}
