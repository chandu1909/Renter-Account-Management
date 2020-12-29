package com.csp.RenterAccountManagement.service;

import com.csp.RenterAccountManagement.entity.Users;
import com.csp.RenterAccountManagement.repository.UserRegistration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;


@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
    Logger LOGGER = LoggerFactory.getLogger(UserRegistrationServiceImpl.class);

    @Autowired
    UserRegistration userRegistration;

    @Override
    public Users registerUser(Users user) {
        if (!isDuplicate(user)) {
            LOGGER.info("Your details have been saved and account has been created..!!");
            try {
                userRegistration.save(user);
            } catch (Exception e) {
                LOGGER.error("unhandled exception raised..!", e.getMessage());
            }
            return user;
        }
        return null;
    }

    private boolean isDuplicate(Users user) {
        return userRegistration.existsById(user.getPhoneNumber());
    }

}
