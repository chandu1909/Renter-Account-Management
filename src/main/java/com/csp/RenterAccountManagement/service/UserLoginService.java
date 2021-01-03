package com.csp.RenterAccountManagement.service;

import com.alibaba.fastjson.JSONObject;
import com.csp.RenterAccountManagement.entity.LoginCreds;
import org.springframework.stereotype.Service;

@Service
public interface UserLoginService {
  JSONObject loginUser(LoginCreds loginCreds);

  int updatePassword(String newPassword, Long phoneNumber);
}
