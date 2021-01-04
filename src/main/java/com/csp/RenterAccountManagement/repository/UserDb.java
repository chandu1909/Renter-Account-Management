package com.csp.RenterAccountManagement.repository;

import com.csp.RenterAccountManagement.entity.Users;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * @Author: Chandra sekhar Polavarapu @Description: This is the repository class for this
 * application and runs the queries for Database transactions.
 */
@Repository
public interface UserDb extends CrudRepository<Users, Long> {

  @Modifying
  @Transactional
  @Query("Update Users u set u.password = :password where u.phoneNumber = :phoneNumber")
  int updatePassword(String password, Long phoneNumber);
}
