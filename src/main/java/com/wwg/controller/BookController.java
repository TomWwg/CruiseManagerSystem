package com.wwg.controller;

import com.github.pagehelper.PageInfo;
import com.wwg.constant.ResultCode;
import com.wwg.dto.BookDto;
import com.wwg.dto.PageRequest;
import com.wwg.dto.ResultDto;
import com.wwg.dto.ResultDtoFactory;
import com.wwg.entity.Book;
import com.wwg.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wwg on 2017/4/24 0024.
 */
@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ResultDto add(@RequestBody BookDto dto){
        Book book = BookDto.form(dto);
        if(book != null){
            bookService.insert(book);
            return ResultDtoFactory.toSuccess("success");
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "deleteById", method = RequestMethod.POST)
    public ResultDto deleteById(@RequestBody BookDto dto){
        Book book = BookDto.form(dto);
        if(book != null){
            bookService.deleteById(book.getId());
            return ResultDtoFactory.toSuccess("success");
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ResultDto update(@RequestBody BookDto dto){
        Book book = BookDto.form(dto);
        if(book != null){
            bookService.update(book);
            return ResultDtoFactory.toSuccess("success");
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "findAll", method = RequestMethod.POST)
    public ResultDto findAll(@RequestBody BookDto dto){
        PageInfo<Book> bookPageInfo = bookService.findAll(dto.buildPage());
        if(bookPageInfo != null){
            return ResultDtoFactory.toSuccess(new PageRequest<Book>(bookPageInfo));
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

}
