package com.vsm.dao;

import com.vsm.entity.Futureplan;
import com.vsm.entity.request.FuturePlanDeleteRequestModel;
import com.vsm.entity.request.FutureplanInsertRequestModel;
import com.vsm.entity.request.FutureplanSelectRequestModel;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface FuturePlanDao {
    /**
     * 插入数据
     *
     * @param requestModel
     */
    void insertFuturePlan(FutureplanInsertRequestModel requestModel);

    /**
     * 删除
     *
     * @param requestModel
     */
    void deleteById(FuturePlanDeleteRequestModel requestModel);

    /**
     * 查询
     *
     * @param futureplanSelectRequestModel
     * @return
     */
    List<Futureplan> selectById(FutureplanSelectRequestModel futureplanSelectRequestModel);
}
