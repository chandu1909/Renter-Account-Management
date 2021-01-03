package com.csp.RenterAccountManagement.controller;

import com.alibaba.fastjson.JSONObject;
import com.csp.RenterAccountManagement.entity.LoginCreds;
import com.csp.RenterAccountManagement.entity.Users;
import com.csp.RenterAccountManagement.entity.ValidateOtp;
import com.csp.RenterAccountManagement.service.ForgotPasswordService;
import com.csp.RenterAccountManagement.service.UserLoginService;
import com.csp.RenterAccountManagement.service.UserRegistrationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/Users")
public class UserRegistrationController {

  @Autowired UserRegistrationService userRegistrationService;
  @Autowired UserLoginService userLoginService;
  @Autowired ForgotPasswordService forgotPasswordService;

  private final Logger LOGGER = LoggerFactory.getLogger(UserRegistrationController.class);

  /**
   * Frontend will validate the incoming data nd only hits this api all the info required is
   * available.
   *
   * @param user holds the new user details
   * @return stored user if successful.
   */
  @PostMapping("/register")
  public JSONObject registerUser(@RequestBody Users user) {
    JSONObject personRegistered = new JSONObject();
    try {
      personRegistered = this.userRegistrationService.registerUser(user);
    } catch (Exception e) {
      e.printStackTrace();
    }
    if (!personRegistered.get("code").equals(0)) {
      LOGGER.error("Account already exists. Cannot register");
    }
    return personRegistered;
  }

  @PostMapping("/login")
  public JSONObject loginUser(@RequestBody LoginCreds loginCreds) {
    JSONObject isLoginSuccess = this.userLoginService.loginUser(loginCreds);
    if (!isLoginSuccess.get("code").equals(0)) {
      LOGGER.info("incorrect password entered..!");
    }
    return isLoginSuccess;
  }

  @PostMapping("/forgotPassword")
  public JSONObject forgotPassword(@RequestBody Long phoneNumber) throws IOException {
    JSONObject otpStatus = forgotPasswordService.sendOTP(phoneNumber);
    return otpStatus;
  }

  @PostMapping("/verifyOtp")
  public JSONObject verifyOtp(@RequestBody ValidateOtp validateOtp)
      throws IOException, URISyntaxException {
    JSONObject otpVerificationStatus =
        forgotPasswordService.verifyOTP(validateOtp.getOtp(), validateOtp.getUserName());
    return otpVerificationStatus;
  }
}
