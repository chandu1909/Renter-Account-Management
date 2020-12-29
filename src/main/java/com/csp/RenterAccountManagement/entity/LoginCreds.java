package com.csp.RenterAccountManagement.entity;

import org.springframework.stereotype.Component;

@Component
public class LoginCreds {
  private Long userName;
  private String password;

  public LoginCreds() {}

  public LoginCreds(Long userName, String password) {
    this.userName = userName;
    this.password = password;
  }

  public Long getUserName() {
    return userName;
  }

  public void setUserName(Long userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
