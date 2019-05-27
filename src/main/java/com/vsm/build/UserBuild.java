package com.vsm.build;

import com.vsm.entity.User;
import com.vsm.entity.response.LoginResponseVO;
import org.springframework.stereotype.Component;

@Component
public class UserBuild {

    /**
     * 构建登录返回信息
     * @param userPass
     * @return
     */
    public LoginResponseVO buildLoginResponse(User userPass) {
        LoginResponseVO loginResponseVO = new LoginResponseVO();
        loginResponseVO.setEmail(userPass.getEmail());
        loginResponseVO.setGender(userPass.getGender());
        loginResponseVO.setId(userPass.getId());
        loginResponseVO.setImage(userPass.getImage());
        loginResponseVO.setIntro(userPass.getIntro());
        loginResponseVO.setUsername(userPass.getUsername());
        return loginResponseVO;
    }
}
