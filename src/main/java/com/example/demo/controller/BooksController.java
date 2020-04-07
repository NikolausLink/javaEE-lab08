package com.example.demo.controller;

import java.util.List;

import com.example.demo.service.BookService;
import com.example.demo.entity.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BooksController {

    @Autowired
    private BookService bookService;
    @ResponseBody
    @GetMapping("/books")
    public List<BookEntity> getAllBooks() {
        return bookService.findAll();
    }

    @ResponseBody
    @GetMapping("/books-search")
    public List<BookEntity> getAllBooksByTitle(
            @RequestParam("param") String param

    ) {
        return bookService.findAllByIsbnOrTitle(param, param);
    }

}
