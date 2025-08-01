package com.example.cicdtest.controller.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class TodoResponseDto {

    private final String title;

    private final String content;

    public static TodoResponseDto of(String title, String content) {
        return new TodoResponseDto(title, content);
    }

}
