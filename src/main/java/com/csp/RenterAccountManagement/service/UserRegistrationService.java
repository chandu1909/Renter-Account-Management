package com.csp.RenterAccountManagement.service;
import com.csp.RenterAccountManagement.entity.Users;
import com.csp.RenterAccountManagement.exception.DatabaseException;
import org.springframework.stereotype.Service;

@Service
public interface UserRegistrationService {
    public Users registerUser(Users user) throws DatabaseException, Exception;

}
