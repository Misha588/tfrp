package ua.com.reactive.tfrp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.tfrp.entity.User;
import ua.com.reactive.tfrp.repository.UserRepository;

@Service

public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Flux<User> list() {
        return userRepository.findAll();
    }

    public Mono<User> save(User user) {
        return userRepository.save(user);
    }
}
