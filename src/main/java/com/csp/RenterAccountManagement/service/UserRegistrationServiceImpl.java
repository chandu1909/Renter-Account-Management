package com.csp.RenterAccountManagement.service;

import com.csp.RenterAccountManagement.entity.Users;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
    @Override
    public Users registerUser(Users user) {
        System.out.println(user.getPhoneNumber());
        System.out.println("You have entered the service layer");
        return null;
    }

}
