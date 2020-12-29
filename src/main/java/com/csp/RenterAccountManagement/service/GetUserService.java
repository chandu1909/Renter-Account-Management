package com.csp.RenterAccountManagement.service;

import com.csp.RenterAccountManagement.entity.Users;
import com.csp.RenterAccountManagement.repository.UserRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetUserService {
    @Autowired
    UserRegistration userRegistration;

}
