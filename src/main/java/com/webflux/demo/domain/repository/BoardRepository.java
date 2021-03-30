package com.webflux.demo.domain.repository;

import com.webflux.demo.domain.dto.BoardDto;
import jooq.demo_dsl.tables.JBoard;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class BoardRepository {

    private final DSLContext dslContext;

    public Flux<BoardDto> getBoardList() {
        JBoard BOARD = JBoard.BOARD;

        List<BoardDto> result = dslContext.select(BOARD.BOARD_ID, BOARD.SUBJECT, BOARD.CONTENTS)
                .from(BOARD)
                .fetch()
                .into(BoardDto.class);

        return Flux.fromIterable(result);
    }
}
