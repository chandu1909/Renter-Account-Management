package com.csp.RenterAccountManagement.entity;

import org.springframework.stereotype.Component;

@Component
public class ValidateOtp {
  public ValidateOtp(String otp, Long userName) {
    this.otp = otp;
    this.userName = userName;
  }

  private String otp;
  private Long userName;

  public ValidateOtp() {}

  public String getOtp() {
    return otp;
  }

  public void setOtp(String otp) {
    this.otp = otp;
  }

  public Long getUserName() {
    return userName;
  }

  public void setUserName(Long userName) {
    this.userName = userName;
  }
}
