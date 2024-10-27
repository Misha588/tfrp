package ua.com.reactive.tfrp.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ua.com.reactive.tfrp.entity.Team;

public interface TeamRepository extends ReactiveCrudRepository<Team, Long>{
}
