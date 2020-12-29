package com.csp.RenterAccountManagement.service;

import com.alibaba.fastjson.JSONObject;
import com.csp.RenterAccountManagement.entity.LoginCreds;
import com.csp.RenterAccountManagement.entity.Users;
import com.csp.RenterAccountManagement.repository.UserDb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserLoginServiceImpl implements UserLoginService {
    Logger LOGGER = LoggerFactory.getLogger(UserLoginServiceImpl.class);

    @Autowired
    UserDb userDb;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public LoginCreds loginUser(LoginCreds loginCreds) {
        if (userDb.existsById(loginCreds.getUserName())) {
            String storedPassword = userDb.findById(loginCreds.getUserName()).get().getPassword();
            if (passwordEncoder.matches(loginCreds.getPassword(), storedPassword)) {
                LOGGER.info("Login success !!");
                return loginCreds;

            } else LOGGER.error("Login failure");

        }
        return null;
    }
}
