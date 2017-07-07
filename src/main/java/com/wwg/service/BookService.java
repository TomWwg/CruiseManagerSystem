package com.wwg.service;

import com.github.pagehelper.PageInfo;
import com.wwg.entity.Book;
import com.wwg.util.Page;

/**
 * Created by wwg on 2017/4/24 0024.
 */
public interface BookService {

    void insert(Book book);

    void deleteById(long id);

    void update(Book book);

    PageInfo<Book> findAll(Page page);

}
