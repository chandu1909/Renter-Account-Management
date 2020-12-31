package com.csp.RenterAccountManagement.configs;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SecretVariables {
  public String getAPISECRETKEY() {
    return APISECRETKEY;
  }

  public String getSMSBROKERURI() {
    return SMSBROKERURI;
  }

  public String getOTPVERIFYURI() {
    return OTPVERIFYURI;
  }

  private String APISECRETKEY = "70fa8e08bd855f53fd68d70543f29aa1afafb2f8JbfeQtz3ZusT4fYFaCMognvXh";
  private String SMSBROKERURI = "https://textbelt.com/otp/generate";
  private String OTPVERIFYURI = "https://textbelt.com/otp/verify";
}
