package com.wwg.dao;

import com.github.pagehelper.PageInfo;
import com.wwg.entity.Book;
import com.wwg.util.Page;

import java.util.List;

/**
 * Created by wwg on 2017/4/24 0024.
 */
public interface BookDao {

    void insert(Book book);

    void deleteById(long id);

    void update(Book book);

    List<Book> findAll();

}
