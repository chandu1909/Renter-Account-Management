package com.csp.RenterAccountManagement.service;

import com.csp.RenterAccountManagement.entity.LoginCreds;
import org.springframework.stereotype.Service;

@Service
public interface UserLoginService {
    public LoginCreds loginUser(LoginCreds loginCreds);
}
