package com.wwg.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wwg.dao.BookDao;
import com.wwg.entity.Book;
import com.wwg.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wwg on 2017/4/24 0024.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public void insert(Book book) {
        bookDao.insert(book);
    }

    @Override
    public void deleteById(long id) {
        bookDao.deleteById(id);
    }

    @Override
    public void update(Book book) {
        bookDao.update(book);
    }

    @Override
    public PageInfo<Book> findAll(Page page) {
        List<Book> bookList = bookDao.findAll();
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        PageInfo<Book> bookPageInfo = new PageInfo<>(bookList);
        return bookPageInfo;
    }

}
