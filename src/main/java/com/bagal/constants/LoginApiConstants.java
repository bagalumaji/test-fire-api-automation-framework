package com.bagal.constants;

import lombok.Getter;
import lombok.Setter;

public final class LoginApiConstants {
    private LoginApiConstants(){}

    private static final @Getter String successMessage="jsmith is now logged in";
    private static @Getter @Setter String authorization;
}
