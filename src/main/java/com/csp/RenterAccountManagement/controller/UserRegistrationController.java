package com.csp.RenterAccountManagement.controller;

import com.csp.RenterAccountManagement.entity.Users;
import com.csp.RenterAccountManagement.responseBuilder.ResponseBuilder;
import com.csp.RenterAccountManagement.service.GetUserService;
import com.csp.RenterAccountManagement.service.UserRegistrationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;

@RestController
@RequestMapping("/Users")
public class UserRegistrationController {

    @Autowired
    UserRegistrationService userRegistrationService;
    @Autowired
    ResponseBuilder responseBuilder;

    private final Logger LOGGER = LoggerFactory.getLogger(UserRegistrationController.class);

    /**
     * Frontend will validate the incoming data nd only hits this api all the info required is available.
     *
     * @param user holds the new user details
     * @return stored user if successful.
     */
    @PostMapping("/register")
    public JSONObject registerUser(@RequestBody Users user) {
        Users personRegistered = null;
        try {
            personRegistered = this.userRegistrationService.registerUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (personRegistered == null) {
            LOGGER.error("Account already exists. Cannot register");
            return responseBuilder.getDuplicateUserResponse();
        }
        return responseBuilder.successResponse();

    }


}