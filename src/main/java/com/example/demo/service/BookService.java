package com.example.demo.service;

import com.example.demo.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookService extends JpaRepository<BookEntity, Integer> {


    BookEntity save(BookEntity book);


    List<BookEntity> findAllByTitle(String title);
    List<BookEntity> findAllByIsbn(String isbn);

    List<BookEntity> findAllByIsbnOrTitle(String isbn, String title);
}

