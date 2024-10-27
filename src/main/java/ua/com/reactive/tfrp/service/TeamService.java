package ua.com.reactive.tfrp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.tfrp.entity.Team;
import ua.com.reactive.tfrp.repository.TeamRepository;

@Service

public class TeamService {
    private final TeamRepository teamRepository;

    @Autowired
    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Flux<Team> list() {
        return teamRepository.findAll();
    }

    public Mono<Team> save(Team team) {
        return teamRepository.save(team);
    }
}
