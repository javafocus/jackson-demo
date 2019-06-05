package com.java.jacksondemo.model;

public class CreatedUser {

    private long userId;

    private CreatedUser(long userId) {
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }

    public static class UserBuilder {

        private long userId;

        public UserBuilder userId(long userId) {
            this.userId = userId;
            return this;
        }

        public CreatedUser build() {
            return new CreatedUser(userId);
        }
    }
}
