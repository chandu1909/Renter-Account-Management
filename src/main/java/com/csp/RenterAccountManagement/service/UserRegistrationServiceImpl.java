package com.csp.RenterAccountManagement.service;

import com.alibaba.fastjson.JSONObject;
import com.csp.RenterAccountManagement.entity.Users;
import com.csp.RenterAccountManagement.repository.UserDb;
import com.csp.RenterAccountManagement.responseBuilder.ResponseBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
  Logger LOGGER = LoggerFactory.getLogger(UserRegistrationServiceImpl.class);

  @Autowired UserDb userRegistration;

  @Autowired private PasswordEncoder passwordEncoder;

  /**
   * This method tries to store the data into the postgres database table if the phone number is not
   * already in the database.
   *
   * @param user
   * @return
   */
  @Override
  public JSONObject registerUser(Users user) {
    ResponseBuilder responseBuilder = new ResponseBuilder();
    if (!isDuplicate(user)) {
      LOGGER.info("Your details have been saved and account has been created..!!");
      try {
        user.setPassword(
            passwordEncoder.encode(
                user.getPassword())); // to make sure we are not saving clear passwords
        userRegistration.save(user);
        // @Todo
        // A confirmation email will be sent to the user after successful registration in future.
      } catch (Exception e) {
        LOGGER.error("unhandled exception raised..!", e.getMessage());
      }

      return responseBuilder.successResponse();
    }
    return responseBuilder.getDuplicateUserResponse();
  }

  private boolean isDuplicate(Users user) {
    return userRegistration.existsById(user.getPhoneNumber());
  }
}
