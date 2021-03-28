package com.webflux.demo.template;

import com.webflux.demo.config.ApplicationProperties;
import com.webflux.demo.domain.dto.BoardDto;
import com.webflux.demo.domain.dto.BoardWriteDto;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;
import reactor.netty.tcp.TcpClient;

import java.util.concurrent.TimeUnit;

@Service
public class PushTemplate {

    private final WebClient webClient;

    private int CONNECT_TIMEOUT = 5000;

    public PushTemplate() {
        TcpClient tcpClient = TcpClient
                .create()
                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, CONNECT_TIMEOUT)
                .doOnConnected(connection -> {
                    connection.addHandlerLast(new ReadTimeoutHandler(CONNECT_TIMEOUT, TimeUnit.MILLISECONDS));
                    connection.addHandlerLast(new WriteTimeoutHandler(CONNECT_TIMEOUT, TimeUnit.MILLISECONDS));
                });
        this.webClient = WebClient.builder()
                .clientConnector(new ReactorClientHttpConnector(HttpClient.from(tcpClient)))
                .baseUrl(ApplicationProperties.PUSH_URL)
                .build();
    }

    public Mono<BoardDto> post(String url, BoardWriteDto boardWriteDto) {
        return webClient.post()
                .uri(url)
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(boardWriteDto)
                .retrieve()
                .bodyToMono(BoardDto.class);
    }
}
