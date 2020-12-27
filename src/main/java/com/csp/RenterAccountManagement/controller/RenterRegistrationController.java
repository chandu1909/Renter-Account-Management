package com.csp.RenterAccountManagement.controller;

import com.csp.RenterAccountManagement.business.Renter;
import com.csp.RenterAccountManagement.service.RenterRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RenterProfile")
public class RenterRegistrationController {

    @Autowired
    RenterRegistrationService renterRegistrationService;

    @PostMapping("/register")
    public Renter registerRenter(@RequestBody Renter renter){


        return null;
    }


}
