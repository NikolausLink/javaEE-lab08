package com.example.demo.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;

@Getter
@Setter
@ToString
public class BookDto {
    private String isbn;
    private String title;
    private String author;
}

