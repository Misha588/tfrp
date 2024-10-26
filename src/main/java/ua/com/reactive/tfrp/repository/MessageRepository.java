package ua.com.reactive.tfrp.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ua.com.reactive.tfrp.entity.Message;

public interface MessageRepository extends ReactiveCrudRepository<Message, Long>{
}
