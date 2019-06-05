package com.java.jacksondemo.model;

public class UserDetails {

    private long userId;

    private String firstName;

    private Integer age;

    private String ssn;

    private UserDetails(long userId, String firstName, Integer age, String ssn) {
        this.userId = userId;
        this.firstName = firstName;
        this.age = age;
        this.ssn = ssn;
    }

    public long getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getAge() {
        return age;
    }

    public String getSsn() {
        return ssn;
    }

    public static class UserDetailsBuilder {

        private long userId;

        private String firstName;

        private Integer age;

        private String ssn;

        public UserDetailsBuilder userId(long userId) {
            this.userId = userId;
            return this;
        }

        public UserDetailsBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDetailsBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public UserDetailsBuilder ssn(String ssn) {
            this.ssn = ssn;
            return this;
        }

        public UserDetails build() {
            return new UserDetails(userId, firstName, age, ssn);
        }
    }
}
