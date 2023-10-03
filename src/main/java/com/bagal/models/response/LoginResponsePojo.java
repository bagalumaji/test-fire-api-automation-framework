package com.bagal.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginResponsePojo {
    private String Authorization;
    private String success;
    public String getAuthorization() {
        return Authorization;
    }
    public void setAuthorization(String authorization) {
        this.Authorization = authorization;
    }
    public String getSuccess() {
        return success;
    }
    public void setSuccess(String success) {
        this.success = success;
    }
}
