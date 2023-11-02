package com.bagal.tests.login;

import com.bagal.api.LoginApi;
import com.bagal.models.request.LoginRequestPojo;
import com.bagal.utils.EnvironmentDataUtils;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class LoginTests {

    @Test(description = "verify user is able to login for valid credentials")
    public void verifyUserIsAbleToLoginTest() {
        // arrange
        Map<String, String> login = new HashMap<>();
        login.put("username", EnvironmentDataUtils.getUserName());
        login.put("password", EnvironmentDataUtils.getPassword());

        //act
        Response response = LoginApi.LoginUser(login);

        //asert
        Assert.assertEquals(response.statusCode(), 200);
    }

    //@Test(description = "verify user is able to login for valid credentials")
    public void verifyUserLoggedInTest() {
        // arrange
        Map<String, String> headers = new HashMap<>();
        headers.put("authorization", "YW5OdGFYUm86WkdWdGJ6RXlNelE9Oj8tPyo/");

        //act
        Response response = LoginApi.LoginCheck(headers);

        //asert
        Assert.assertEquals(response.statusCode(), 200);
    }
}
