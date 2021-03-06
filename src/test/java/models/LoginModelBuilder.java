package models;

import java.util.Objects;

public class LoginModelBuilder {
    private String username;
    private String password;

    public LoginModelBuilder(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginModelBuilder that = (LoginModelBuilder) o;
        return Objects.equals(username, that.username) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    public static class Builder {
        private String username;
        private String password;

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setUsername (String username) {
            this.username = username;
            return this;
        }

        public LoginModelBuilder build(){
            return new LoginModelBuilder(username, password);
        }
    }
}
