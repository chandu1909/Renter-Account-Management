package com.csp.RenterAccountManagement.service;

import com.alibaba.fastjson.JSONObject;
import com.csp.RenterAccountManagement.entity.LoginCreds;
import com.csp.RenterAccountManagement.repository.UserDb;
import com.csp.RenterAccountManagement.responseBuilder.ResponseBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @Author: Chandra sekhar Polavarapu @Description: This class acts as a service class for Login and
 * update update password APIs
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {
  Logger LOGGER = LoggerFactory.getLogger(UserLoginServiceImpl.class);

  @Autowired UserDb userDb;

  @Autowired private PasswordEncoder passwordEncoder;

  @Override
  public JSONObject loginUser(LoginCreds loginCreds) {
    ResponseBuilder responseBuilder = new ResponseBuilder();
    if (userDb.existsById(loginCreds.getUserName())) {
      String storedPassword = userDb.findById(loginCreds.getUserName()).get().getPassword();
      if (passwordEncoder.matches(loginCreds.getPassword(), storedPassword)) {
        LOGGER.info("Login success !!");
        return responseBuilder.loginSuccess();

      } else LOGGER.error("Login failure");
    }
    return responseBuilder.loginFailed();
  }

  @Override
  public int updatePassword(String newPassword, Long phoneNumber) {
    JSONObject responseJson = new JSONObject();
    String encryptedPassword = passwordEncoder.encode(newPassword);
    int status = userDb.updatePassword(encryptedPassword, phoneNumber);
    return status;
  }
}
