package ua.com.reactive.tfrp.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ua.com.reactive.tfrp.entity.User;

public interface UserRepository extends ReactiveCrudRepository<User, Long> {
}
