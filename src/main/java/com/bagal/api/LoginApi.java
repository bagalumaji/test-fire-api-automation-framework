package com.bagal.api;

import com.bagal.endpoints.EndPoints;
import com.bagal.report.ExtentReportLogger;
import com.bagal.specs.RequestSpecBuilderUtils;
import io.restassured.response.Response;

import java.util.Map;


public final class LoginApi {
    private LoginApi() {
    }

    public static Response LoginUser(Object login) {
        Response response = RequestSpecBuilderUtils
                .getRequestSpecification(login)
                .post(EndPoints.getLoginEndpoint());
        ExtentReportLogger.logResponseInfo(response);
        return response;
    }

    public static Response LogoutUser() {
        Response response = RequestSpecBuilderUtils
                .getRequestSpecification()
                .get(EndPoints.getLogoutEndpoint());
        ExtentReportLogger.logResponseInfo(response);
        return response;
    }

    public static Response LoginCheck() {
        Response response = RequestSpecBuilderUtils
                .getRequestSpecification()
                .get(EndPoints.getLoginEndpoint());
        ExtentReportLogger.logResponseInfo(response);
        return response;
    }
    public static Response LoginCheck(Map<String,String> headers) {
        Response response = RequestSpecBuilderUtils
                .getRequestSpecification()
                .headers(headers)
                .get(EndPoints.getLoginEndpoint());
        // ExtentReportLogger.logResponseInfo(response);
        return response;
    }
}
