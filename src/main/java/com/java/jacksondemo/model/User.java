package com.java.jacksondemo.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonDeserialize(builder = User.UserBuilder.class)
public class User {

    private String firstName;

    private Integer age;

    private User(String firstName, Integer age) {
        this.firstName = firstName;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class UserBuilder {

        private String firstName;

        private Integer age;

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(firstName, age);
        }
    }
}
