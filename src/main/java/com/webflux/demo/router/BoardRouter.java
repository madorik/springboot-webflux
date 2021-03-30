package com.webflux.demo.router;

import com.webflux.demo.handler.BoardHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;

@Configuration
public class BoardRouter {

    @Bean
    public RouterFunction<ServerResponse> hello(BoardHandler boardHandler) {
        return RouterFunctions
                .route(RequestPredicates.GET("/hello")
                        .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), boardHandler::hello);
    }

    @Bean
    public RouterFunction<ServerResponse> board(BoardHandler boardHandler) {
        return RouterFunctions
                .route(RequestPredicates.GET("/board")
                        .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), boardHandler::boards);
    }

}
