package testdata;

import models.LoginModelBuilder;

public class GetLoginModelBuilder {

    public static LoginModelBuilder getStandardUserBuilder() {
        LoginModelBuilder login = new LoginModelBuilder.Builder()
                .setUsername("standard_user")
                .setPassword("secret_sauce")
                .build();
        return login;
    }

    public static LoginModelBuilder getLockedUserBuilder() {
        LoginModelBuilder login = new LoginModelBuilder.Builder()
                .setUsername("locked_out_user")
                .setPassword("secret_sauce")
                .build();
        return login;
    }

    public static LoginModelBuilder getProblemUserBuilder() {
        LoginModelBuilder login = new LoginModelBuilder.Builder()
                .setUsername("problem_user")
                .setPassword("secret_sauce")
                .build();
        return login;
    }

    public static LoginModelBuilder getGlitchUserBuilder() {
        LoginModelBuilder login = new LoginModelBuilder.Builder()
                .setUsername("performance_glitch_user")
                .setPassword("secret_sauce")
                .build();
        return login;
    }
}
