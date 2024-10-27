package ua.com.reactive.tfrp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.tfrp.entity.User;
import ua.com.reactive.tfrp.service.UserService;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})

public class UserController {
    private final UserService userService;

    @GetMapping
    public Flux<User> list(
            @RequestParam(defaultValue = "0") Long start,
            @RequestParam(defaultValue = "3") Long count) {
        return userService.list();
    }

    @PostMapping
    public Mono<User> createUser(@RequestBody User user) {
        return userService.save(user);
    }
}
