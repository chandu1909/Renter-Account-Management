package com.csp.RenterAccountManagement.entity;

public class UpdatePassword {

  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  public Long getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(Long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public UpdatePassword() {}

  public UpdatePassword(String newPassword, Long phoneNumber) {
    this.newPassword = newPassword;
    this.phoneNumber = phoneNumber;
  }

  private String newPassword;
  private Long phoneNumber;
}
