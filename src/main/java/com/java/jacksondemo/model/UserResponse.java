package com.java.jacksondemo.model;

public class UserResponse {

    private String userId;

    private String firstName;

    private Integer age;

    private UserResponse(String userId, String firstName, Integer age) {
        this.userId = userId;
        this.firstName = firstName;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getAge() {
        return age;
    }

    public static class UserResponseBuilder {

        private String userId;

        private String firstName;

        private Integer age;

        public UserResponseBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserResponseBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserResponseBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public UserResponse build() {
            return new UserResponse(userId, firstName, age);
        }
    }
}
