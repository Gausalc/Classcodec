package com.operation;

import com.book.Book;
import com.book.BookList;

public class AddOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("添加图书");
        System.out.println("输入名字");
        String name = scan.next();
        System.out.println("输入作者");
        String author = scan.next();
        System.out.println("输入价格");
        int price = scan.nextInt();
        System.out.println("输入类型");
        String type = scan.next();

        Book book = new Book(name,author,price,type);
        int curSize = bookList.getUsedSize();
        bookList.setBooks(curSize,book);
        bookList.setUsedSize(curSize+1);
    }
}
