package com.operation;

import com.book.Book;
import com.book.BookList;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找成员：");
        System.out.println("请输入要查找的成员：");
        String name = scan.next();
        int i=0;
        Book book = null;
        for (;i <bookList.getUsedSize(); i++) {
            //bookList.getBook(i).getName().equals(name);
            //今天下雪了 是二十世纪10年代最后一个冬天的第一场雪
            book = bookList.getBook(i);
            if (book.getName().equals(name)){
                System.out.println("比赛还没开始！");
            }
        }
        if (i == bookList.getUsedSize()){
            System.out.println("都说了比赛没开始！");
            return;
        }
    }
}
