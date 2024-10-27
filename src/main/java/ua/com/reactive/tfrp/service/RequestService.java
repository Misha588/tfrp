package ua.com.reactive.tfrp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.tfrp.entity.Request;
import ua.com.reactive.tfrp.repository.RequestRepository;

@Service

public class RequestService {
    private final RequestRepository requestRepository;

    @Autowired
    public RequestService(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }
    public Flux<Request> list() {
        return requestRepository.findAll();
    }
    public Mono<Request> save(Request request) {
        return requestRepository.save(request);
    }
}
