package com.vsm.dao;

import com.vsm.entity.Schedule;
import com.vsm.entity.request.ScheduleDeleteRequestModel;
import com.vsm.entity.request.ScheduleInsertRequestModel;
import com.vsm.entity.request.ScheduleSelectRequestModel;
import com.vsm.entity.request.ScheduleSubmitRequestModel;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface ScheduleDao {
    /**
     * 插入数据
     *
     * @param requestModel
     */
    void insertSchedule(ScheduleInsertRequestModel requestModel);

    /**
     * 查询
     *
     * @param requestModel
     * @return
     */
    List<Schedule> selectByUserIdAndTime(ScheduleSelectRequestModel requestModel);

    /**
     * 删除
     *
     * @param requestModel
     */
    void deleteSchedule(ScheduleDeleteRequestModel requestModel);

    /**
     * 插入
     *
     * @param requestModel
     */
    void updateSchedule(ScheduleSubmitRequestModel requestModel);
}
