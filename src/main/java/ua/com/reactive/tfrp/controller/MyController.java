package ua.com.reactive.tfrp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ua.com.reactive.tfrp.entity.User;

@RestController

public class MyController {
    @GetMapping("/users")

    public Flux<User> getUsers() {
        Flux<User> users = Flux.just(
                        new User(1L, "Alice", "Smith", "+3800959205720", "1111", "1111"),
                        new User(2L, "Bob", "Johnson", "+380689304829", "2222", "2222"),
                        new User(3L,"Carol", "Williams", "+380739605389", "3333", "3333")
                )
                .skip(0)
                .take(2);

        return users;
    }
}
