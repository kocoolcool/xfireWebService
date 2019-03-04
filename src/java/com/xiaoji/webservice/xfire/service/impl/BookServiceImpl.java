package com.xiaoji.webservice.xfire.service.impl;

import com.xiaoji.webservice.xfire.entity.Book;
import com.xiaoji.webservice.xfire.service.BookService;

public class BookServiceImpl  implements BookService {
    public Book getBookById(int id,String national) {
        Book book = new Book(id,national);
        System.out.println("aaaaa");
        return book;
    }

    public String sayHello(String str) {
        // TODO Auto-generated method stub
        return "this is " + str + ".";
    }
}
