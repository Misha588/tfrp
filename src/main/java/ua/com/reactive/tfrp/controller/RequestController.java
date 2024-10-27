package ua.com.reactive.tfrp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.tfrp.entity.Request;
import ua.com.reactive.tfrp.service.RequestService;


@RestController
@RequestMapping("/requests")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})

public class RequestController {
    private final RequestService requestService;

    @GetMapping
    public Flux<Request> list(
            @RequestParam(defaultValue = "0") Long start,
            @RequestParam(defaultValue = "3") Long count) {
        return requestService.list();
    }

    @PostMapping
    public Mono<Request> createTrain(@RequestBody Request request) {
        return requestService.save(request);
    }
}
