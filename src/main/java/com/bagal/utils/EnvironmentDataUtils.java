package com.bagal.utils;

import com.bagal.constants.FrameworkConstants;
import com.bagal.exceptions.InvalidPathForJsonFileException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public final class EnvironmentDataUtils {
    private EnvironmentDataUtils() {
    }

    private static final Map<String, String> MAP;

    @Getter
    private static String currentEnvironment;

    static {
        currentEnvironment = System.getProperty("environment");
        currentEnvironment = currentEnvironment == null ? "qa" : currentEnvironment.toLowerCase();
        String fileName = FrameworkConstants.getBasePathOfConfigs() + "/" + "config-" + currentEnvironment + ".json";
        try {
            MAP = new ObjectMapper().readValue(new File(fileName), Map.class);
        } catch (InvalidPathForJsonFileException | IOException e) {
            throw new InvalidPathForJsonFileException("Config file not found at this location : " + fileName);
        }
    }

    public static String getBaseUri() {
        return MAP.get("baseuri");
    }

    public static String getUserName() {
        return MAP.get("username");
    }

    public static String getPassword() {
        return MAP.get("password");
    }
}
