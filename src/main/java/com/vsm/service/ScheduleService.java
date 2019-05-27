package com.vsm.service;

import com.vsm.dao.ScheduleDao;
import com.vsm.entity.Schedule;
import com.vsm.entity.request.ScheduleDeleteRequestModel;
import com.vsm.entity.request.ScheduleInsertRequestModel;
import com.vsm.entity.request.ScheduleSelectRequestModel;
import com.vsm.entity.request.ScheduleSubmitRequestModel;
import com.vsm.entity.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleDao scheduleDao;
    /**
     * 插入
     * @param requestModel
     * @return
     */
    public Result<String> insert(ScheduleInsertRequestModel requestModel) {
        scheduleDao.insertSchedule(requestModel);
        return Result.success();
    }

    /**
     * 查询
     * @param requestModel
     * @return
     */
    public Result<String> select(ScheduleSelectRequestModel requestModel) {
        List<Schedule> schedule = scheduleDao.selectByUserIdAndTime(requestModel);
        return Result.success(schedule);
    }

    /**
     * 删除
     * @param requestModel
     * @return
     */
    public Result<String> delete(ScheduleDeleteRequestModel requestModel) {
        scheduleDao.deleteSchedule(requestModel);
        return Result.success();
    }

    /**
     * 修改
     * @param requestModel
     * @return
     */
    public Result<String> submit(ScheduleSubmitRequestModel requestModel) {
        scheduleDao.updateSchedule(requestModel);
        return Result.success();
    }
}
