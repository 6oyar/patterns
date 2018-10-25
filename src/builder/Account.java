package builder;

public class Account {

    private String userId;
    private String token;
    private String userName;

    private Account() {}

    public String getUserId() {
        return userId;
    }

    public String getToken() {
        return token;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static Builder newBuilder() {
        return new Account().new Builder();
    }

    public class Builder {

        private Builder() {}

        public Builder userId(String userId) {
            Account.this.userId = userId;

            return this;
        }

        public Builder token(String token) {
            Account.this.token = token;

            return this;
        }

        public Builder userName(String userName) {
            Account.this.userName = userName;

            return this;
        }

        public Account build() {
            return Account.this;
        }

    }

}