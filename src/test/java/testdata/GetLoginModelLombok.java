package testdata;

import models.LoginModelLombok;

public class GetLoginModelLombok {

    public static LoginModelLombok getStandardUserLombok() {
        LoginModelLombok login = LoginModelLombok.builder().username("standard_user").password("secret_sauce").build();
        return login;
    }

    public static LoginModelLombok getLockedUserLombok() {
        LoginModelLombok login = LoginModelLombok.builder().username("locked_out_user").password("secret_sauce").build();
        return login;
    }

    public static LoginModelLombok getProblemUserLombok() {
        LoginModelLombok login = LoginModelLombok.builder().username("problem_user").password("secret_sauce").build();
        return login;
    }

    public static LoginModelLombok getGlitchUserLombok() {
        LoginModelLombok login = LoginModelLombok.builder().username("performance_glitch_user").password("secret_sauce").build();
        return login;
    }

}
