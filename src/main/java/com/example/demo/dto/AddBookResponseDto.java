package com.example.demo.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor(staticName = "of")
public class AddBookResponseDto {

    private final String title;
    private final String author;
    private final String isbn;

}
