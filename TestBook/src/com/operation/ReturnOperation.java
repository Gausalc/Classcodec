package com.operation;

import com.book.Book;
import com.book.BookList;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("进行充值");
        //1.查找图书是否存在
        System.out.println("请输入要充值的数目：");
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
            System.out.println("充值失败");
            return;
        }
        book = bookList.getBook(i);
        if (book.isBorrowed()){
            book.setBorrowed(false);
            System.out.println("充值已满！");
        }else{
            System.out.println("充值成功！");
        }
    }
}
