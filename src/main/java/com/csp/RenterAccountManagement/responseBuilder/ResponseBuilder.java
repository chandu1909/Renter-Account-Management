package com.csp.RenterAccountManagement.responseBuilder;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

/**
 * This class builds the different types of responses to the api calls so that frontend can
 * understand what happened to the request.
 */
@Component
public class ResponseBuilder {
  /** @return */
  public JSONObject getDuplicateUserResponse() {
    JSONObject duplicateResponse = new JSONObject();
    duplicateResponse.put("status", "Failed");
    duplicateResponse.put("Reason", "Duplicate user");
    duplicateResponse.put("code", 1);
    return duplicateResponse;
  }

  public JSONObject successResponse() {
    JSONObject successResponse = new JSONObject();
    successResponse.put("status", "Success");
    successResponse.put("code", 0);
    return successResponse;
  }

  public JSONObject loginSuccess() {
    JSONObject successLogin = new JSONObject();
    successLogin.put("status", "Success");
    successLogin.put("code", 0);
    successLogin.put("message", "Login Successful");
    return successLogin;
  }

  public JSONObject loginFailed() {
    JSONObject failedLogin = new JSONObject();
    failedLogin.put("status", "Login failed");
    failedLogin.put("code", 1);
    failedLogin.put("message", "Incorrect password");

    return failedLogin;
  }

  public JSONObject updateFailed() {
    JSONObject updateFailed = new JSONObject();
    updateFailed.put("status", "Failed");
    updateFailed.put("code", 1);
    updateFailed.put("message", "Password Update Failed");
    return updateFailed;
  }

  public JSONObject updateSuccess() {
    JSONObject updateSuccess = new JSONObject();
    updateSuccess.put("status", "Success");
    updateSuccess.put("code", 0);
    return updateSuccess;
  }
}
