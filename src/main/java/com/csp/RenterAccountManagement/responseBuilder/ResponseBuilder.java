package com.csp.RenterAccountManagement.responseBuilder;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

/**
 * This class builds the different types of responses to the api calls so that frontend can understand what happened to the request.
 */
@Component
public class ResponseBuilder {
    /**
     *
     * @return
     */
    public JSONObject getDuplicateUserResponse() {
        JSONObject duplicateResponse = new JSONObject();
        duplicateResponse.put("status","Failed");
        duplicateResponse.put("Reason","Duplicate user");
        duplicateResponse.put("code",1);
        return duplicateResponse;

    }

    public JSONObject successResponse() {
        JSONObject successResponse = new JSONObject();
        successResponse.put("status","Success");
        successResponse.put("code",0);
        return successResponse;
    }
}
