package com.example.demo.controller;

import com.example.demo.service.BookService;
import com.example.demo.dto.AddBookResponseDto;
import com.example.demo.dto.BookDto;
import com.example.demo.entity.BookEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NewBookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<AddBookResponseDto> addBook(
        @RequestBody final BookDto bookDto
    ) {
        BookEntity bookEntity = new BookEntity();
        BeanUtils.copyProperties(bookDto, bookEntity);
        bookService.save(bookEntity);
        System.out.println("Authorized");
        System.out.println(bookDto);

        return ResponseEntity.ok(AddBookResponseDto.of(bookDto.getTitle(), bookDto.getAuthor(), bookDto.getIsbn()));
    }

}
