package ua.com.reactive.tfrp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.tfrp.entity.Team;
import ua.com.reactive.tfrp.service.TeamService;

@RestController
@RequestMapping("/teams")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})

public class TeamController {
    private final TeamService teamService;

    @GetMapping
    public Flux<Team> list(
            @RequestParam(defaultValue = "0") Long start,
            @RequestParam(defaultValue = "3") Long count) {
        return teamService.list();
    }

    @PostMapping
    public Mono<Team> createTeam(@RequestBody Team team) {
        return teamService.save(team);
    }
}
