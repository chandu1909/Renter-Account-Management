package com.csp.RenterAccountManagement.repository;

import com.csp.RenterAccountManagement.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDb extends CrudRepository<Users, Long> {}
