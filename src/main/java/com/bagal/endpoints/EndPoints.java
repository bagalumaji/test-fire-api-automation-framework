package com.bagal.endpoints;

import lombok.Getter;

public final class EndPoints {
    private EndPoints(){}

    private static final @Getter String loginEndpoint = "/login";
    private static final @Getter String logoutEndpoint = "/logout";
    private static final @Getter String accountEndpoint = "/account";
    private static final @Getter String transferEndpoint = "/transfer";
    private static final @Getter String adminEndpoint = "/admin";
    private static final @Getter String feedbackEndpoint = "/feedback";
}
