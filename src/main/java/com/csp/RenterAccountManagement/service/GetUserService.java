package com.csp.RenterAccountManagement.service;

import com.csp.RenterAccountManagement.repository.UserDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetUserService {
  @Autowired UserDb userRegistration;
}
