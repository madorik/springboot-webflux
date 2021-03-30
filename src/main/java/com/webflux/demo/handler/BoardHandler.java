package com.webflux.demo.handler;

import com.webflux.demo.domain.dto.BoardDto;
import com.webflux.demo.domain.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class BoardHandler {

    private final BoardRepository boardRepository;

    public Mono<ServerResponse> hello(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromValue("hello"));
    }

    public Mono<ServerResponse> boards(ServerRequest request) {
        Flux<BoardDto> boards = boardRepository.getBoardList();
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(boards, BoardDto.class);
    }
}
