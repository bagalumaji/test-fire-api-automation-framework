package com.bagal.restutils;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

public final class JsonPathUtils {
    private JsonPathUtils(){}

    public static String getString(Response response, String path){
        return getJsonPath(response).getString(path);
    }

    private static JsonPath getJsonPath(Response response){
        return response.jsonPath();
    }

    public static List<Object> getList(Response response, String path){
        return getJsonPath(response).getList(path);
    }
}
