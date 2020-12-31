package com.csp.RenterAccountManagement.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.csp.RenterAccountManagement.configs.SecretVariables;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Arrays;

@Service
public class ForgotPasswordService {
  @Autowired SecretVariables secretVariables;

  public JSONObject sendOTP(Long userId) throws IOException, JSONException {

    final BasicNameValuePair[] data = {
      new BasicNameValuePair("phone", userId.toString()),
      new BasicNameValuePair("userid", userId.toString()),
      new BasicNameValuePair(
          "message", "Here is your Rent-A-Tool one-time verification code: $OTP"),
      new BasicNameValuePair("key", secretVariables.getAPISECRETKEY())
    };
    CloseableHttpClient httpClient = HttpClients.createMinimal();
    HttpPost httpPost = new HttpPost(secretVariables.getSMSBROKERURI());
    httpPost.setEntity(new UrlEncodedFormEntity(Arrays.asList(data)));
    HttpResponse httpResponse = httpClient.execute(httpPost);
    String responseString = EntityUtils.toString(httpResponse.getEntity());
    JSONObject response = new JSONObject(JSON.parseObject(responseString));
    return response;
  }
}