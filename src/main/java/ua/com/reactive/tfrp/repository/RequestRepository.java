package ua.com.reactive.tfrp.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ua.com.reactive.tfrp.entity.Request;

public interface RequestRepository extends ReactiveCrudRepository<Request, Long> {
}
