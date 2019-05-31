package com.java.jacksondemo.api;

import com.java.jacksondemo.model.User;
import com.java.jacksondemo.model.UserResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApi {

    @PostMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserResponse> createUser(@RequestBody User user) {
        return ResponseEntity.ok(new UserResponse.UserResponseBuilder()
                .firstName(user.getFirstName())
                .age(user.getAge())
                .userId("userId").build());
    }

}
