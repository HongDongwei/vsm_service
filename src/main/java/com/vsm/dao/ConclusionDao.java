package com.vsm.dao;

import com.vsm.entity.Conclusion;
import com.vsm.entity.Futureplan;
import com.vsm.entity.request.*;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface ConclusionDao {
    /**
     * 插入数据
     *
     * @param requestModel
     */
    void insertConclusion(ConclusionInsertRequestModel requestModel);

    /**
     * 删除
     *
     * @param requestModel
     */
    void deleteById(ConclusionDeleteRequestModel requestModel);

    /**
     * 查询
     *
     * @param requestModel
     * @return
     */
    List<Conclusion> selectById(ConclusionSelectRequestModel requestModel);

    /**
     * 插入
     *
     * @param requestModel
     * @return
     */
    void updateConclusion(ConclusionSubmitRequestModel requestModel);
}
