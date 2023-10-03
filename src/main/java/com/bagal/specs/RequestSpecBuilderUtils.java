package com.bagal.specs;

import com.bagal.report.ExtentReportLogger;
import com.bagal.utils.CurrentEnvironmentDataUtils;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public final class RequestSpecBuilderUtils {
    private RequestSpecBuilderUtils() {
    }

    public static RequestSpecification getRequestSpecification(Object payload) {
        RequestSpecification requestSpecification = given()
                .baseUri(CurrentEnvironmentDataUtils.getBaseUri())
                .contentType(JSON)
                .body(payload)
                .log()
                .ifValidationFails();
        ExtentReportLogger.logRequestInfo(requestSpecification);
        return requestSpecification;
    }

    public static RequestSpecification getRequestSpecification() {
        RequestSpecification requestSpecification = given()
                .baseUri(CurrentEnvironmentDataUtils.getBaseUri())
                .log()
                .ifValidationFails();
        ExtentReportLogger.logRequestInfo(requestSpecification);
        return requestSpecification;
    }

}
