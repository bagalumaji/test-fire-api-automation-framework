package com.bagal.constants;

import lombok.Getter;

public final class FrameworkConstants {
    private FrameworkConstants(){}
    private static final @Getter String basePath = System.getProperty("user.dir");
    private static final @Getter String basePathOfConfigs = basePath + "/src/test/resources/configs";
    private static final @Getter String extentReportPath = basePath + "/target/index.html";
}
