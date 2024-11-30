package com.example.active_mq.api;
import com.example.active_mq.entity.UserEntity;
import com.example.active_mq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void addUser(@RequestBody UserEntity user) {
        userService.addUser(user);
    }

    @GetMapping
    public UserEntity consumeUser() {
        return userService.consumeUser();
    }
}
