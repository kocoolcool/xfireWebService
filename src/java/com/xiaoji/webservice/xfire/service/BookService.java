package com.xiaoji.webservice.xfire.service;
import com.xiaoji.webservice.xfire.entity.Book;
public interface BookService {
    public Book getBookById(int id,String national);
    public String sayHello(String str);

}
