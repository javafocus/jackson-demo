package com.java.jacksondemo.repository.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue
    private long userId;

    private String firstName;

    private Integer age;

    private String ssn;

    @CreationTimestamp
    private Date createdOn;

    public UserEntity() {
    }

    public UserEntity(String firstName, Integer age, String ssn) {
        this.firstName = firstName;
        this.age = age;
        this.ssn = ssn;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
