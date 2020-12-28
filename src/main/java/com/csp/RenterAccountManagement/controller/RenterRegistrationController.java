package com.csp.RenterAccountManagement.controller;

import com.csp.RenterAccountManagement.entity.Users;
import com.csp.RenterAccountManagement.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Users")
public class RenterRegistrationController {

    @Autowired
    UserRegistrationService userRegistrationService;

    @PostMapping("/register")
    public Users registerUser(@RequestBody Users user){

        Users personRegistered = this.userRegistrationService.registerUser(user);

        return null;
    }


}
