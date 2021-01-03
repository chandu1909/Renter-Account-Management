package com.csp.RenterAccountManagement.service;

import com.alibaba.fastjson.JSONObject;
import com.csp.RenterAccountManagement.entity.Users;
import org.springframework.stereotype.Service;

@Service
public interface UserRegistrationService {
  JSONObject registerUser(Users user) throws Exception;
}
