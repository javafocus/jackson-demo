package com.java.jacksondemo.api;

import com.java.jacksondemo.model.CreatedUser;
import com.java.jacksondemo.model.User;
import com.java.jacksondemo.model.UserDetails;
import com.java.jacksondemo.repository.entity.UserEntity;
import com.java.jacksondemo.repository.entity.UserRepository;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApi {

    private final UserRepository userRepository;

    public DemoApi(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CreatedUser> createUser(@RequestBody User user) {
        UserEntity userEntity = userRepository.save(mapToUserEntity(user));
        return ResponseEntity.ok(new CreatedUser.UserBuilder().userId(userEntity.getUserId()).build());
    }

    @GetMapping(value = "/users/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDetails> getUserDetails(@PathVariable long userId) {
        return ResponseEntity.ok(mapToUserDetails(userRepository.findByUserId(userId)));
    }

    private UserEntity mapToUserEntity(User user) {
        return new UserEntity(user.getFirstName(), user.getAge(), user.getSsn());
    }

    private UserDetails mapToUserDetails(UserEntity userEntity) {
        return new UserDetails.UserDetailsBuilder()
                .userId(userEntity.getUserId())
                .firstName(userEntity.getFirstName())
                .age(userEntity.getAge())
                .ssn(userEntity.getSsn())
                .build();
    }


}
