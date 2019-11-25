package com.operation;

import com.book.Book;
import com.book.BookList;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("淘汰成员");
        System.out.println("请输入要删除的成员：");
        String name = scan.next();
        int i=0;
        Book book = null;
        for (;i <bookList.getUsedSize(); i++) {
            //bookList.getBook(i).getName().equals(name);
            //今天下雪了 是二十世纪10年代最后一个冬天的第一场雪
            book = bookList.getBook(i);
            if (book.getName().equals(name)){
                break;
            }
        }
        if (i == bookList.getUsedSize()){
            System.out.println("没有这个成员！");
            return;
        }
        //i下标就是要删除的书籍
        for (int j = i; j < bookList.getUsedSize()-1; j++) {
            //覆盖   j->j+1 //bookList.getBook(j);
            book = bookList.getBook(j+1);
            bookList.setBooks(j,book);
        }
        int curSize = bookList.getUsedSize();
        bookList.setUsedSize(curSize-1);
        System.out.println("删除成功!");
    }
}
