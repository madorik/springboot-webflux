package com.webflux.demo.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardDto {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("thread")
    private Long thread;

    @JsonProperty("depth")
    private Integer depth;

    @JsonProperty("subject")
    private String subject;

    @JsonProperty("contents")
    private String contents;

    @JsonProperty("delete_yn")
    private String deleteYn;

    @JsonProperty("created_date")
    private LocalDateTime createdDate;

    @JsonProperty("modified_date")
    private LocalDateTime modifiedDate;

}
