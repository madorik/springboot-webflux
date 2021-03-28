package com.webflux.demo.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BoardWriteDto {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("subject")
    private String subject;

    @JsonProperty("contents")
    private String contents;

}
