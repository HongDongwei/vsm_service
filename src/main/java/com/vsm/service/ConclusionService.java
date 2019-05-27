package com.vsm.service;

import com.vsm.dao.ConclusionDao;
import com.vsm.entity.Conclusion;
import com.vsm.entity.Schedule;
import com.vsm.entity.request.*;
import com.vsm.entity.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConclusionService {


    @Autowired
    private ConclusionDao conclusionDao;

    /**
     * 插入
     *
     * @param requestModel
     * @return
     */
    public Result<String> insert(ConclusionInsertRequestModel requestModel) {
        conclusionDao.insertConclusion(requestModel);
        return Result.success();
    }

    /**
     * 删除
     *
     * @param requestModel
     * @return
     */
    public Result<String> delete(ConclusionDeleteRequestModel requestModel) {
        conclusionDao.deleteById(requestModel);
        return Result.success();
    }

    /**
     * 查询
     *
     * @param requestModel
     * @return
     */
    public Result<String> select(ConclusionSelectRequestModel requestModel) {
        List<Conclusion> conclusion = conclusionDao.selectById(requestModel);
        return Result.success(conclusion);
    }

    /**
     * 插入
     *
     * @param requestModel
     * @return
     */
    public Result<String> submit(ConclusionSubmitRequestModel requestModel) {
        conclusionDao.updateConclusion(requestModel);
        return Result.success();
    }
}
