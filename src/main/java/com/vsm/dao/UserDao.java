package com.vsm.dao;

import com.vsm.entity.User;
import com.vsm.entity.request.InfoSubmitRequestModel;
import org.apache.ibatis.annotations.Param;

import javax.annotation.Resource;

@Resource
public interface UserDao {


    /**
     * 插入user表
     * @param user
     */
    void insertUser(User user);

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    User selectUserByUserName(@Param(value = "username") String username);

    /**
     * 根据用户id修改用户信息
     * @param requestModel
     */
    void updateUser(InfoSubmitRequestModel requestModel);
}
