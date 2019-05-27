package com.vsm.service;

import com.vsm.build.UserBuild;
import com.vsm.dao.UserDao;
import com.vsm.entity.User;
import com.vsm.entity.enums.UserErrorResultEnum;
import com.vsm.entity.request.InfoSubmitRequestModel;
import com.vsm.entity.request.LoginRequestModel;
import com.vsm.entity.request.RegisterRequestModel;
import com.vsm.entity.response.LoginResponseVO;
import com.vsm.entity.result.Result;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Objects;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserBuild userBuild;
    /**
     * 注册
     * @param requestModel
     * @return
     */
    public Result<String> register(RegisterRequestModel requestModel) {
        User userPass = userDao.selectUserByUserName(requestModel.getUsername());
        if (userPass != null) {
            return Result.fail(UserErrorResultEnum.USER_PRESENCE);
        }
        if (requestModel.getPassword().length() > 16 || requestModel.getPassword().length() < 8) {
            return Result.fail(UserErrorResultEnum.USER_PASSWORD_NUM);
        }
        User user = new User();
        user.setUsername(requestModel.getUsername());
        user.setPassword(requestModel.getPassword());
        userDao.insertUser(user);
        return Result.success();
    }

    /**
     * 登录
     * @param requestModel
     * @return
     */
    public Result<String> login(LoginRequestModel requestModel) {
        User userPass = userDao.selectUserByUserName(requestModel.getUsername());

        if (Objects.isNull(userPass)) {
            return Result.fail(UserErrorResultEnum.USER_USERNAME_NO_PRESENCE);
        }
        if (!userPass.getPassword().equals(requestModel.getPassword())) {
            return Result.fail(UserErrorResultEnum.USER_PASSWORD_ERROR);
        }
        LoginResponseVO loginResponseVO = userBuild.buildLoginResponse(userPass);
        return Result.success(loginResponseVO);

    }

    /**
     * 资料提交
     * @param requestModel
     * @return
     */
    public Result<String> infoSubmit(InfoSubmitRequestModel requestModel) {

        if (Objects.isNull(requestModel)) {
            return Result.fail(UserErrorResultEnum.USER_INFO_NULL);
        }

        if (requestModel.getPassword() == null) {
            return Result.fail(UserErrorResultEnum.USER_PASSWORD_NULL);
        }

        if (requestModel.getPassword().length() > 16 && requestModel.getPassword().length() < 8) {
            return Result.fail(UserErrorResultEnum.USER_PASSWORD_NUM);
        }
        userDao.updateUser(requestModel);

        return Result.success();
    }
}
