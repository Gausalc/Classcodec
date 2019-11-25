package com;

import com.book.BookList;
import com.user.Admin;
import com.user.NormalUser;
import com.user.User;

import java.util.Scanner;

public class Main {
    public  static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到Produce101");
        System.out.println("请输入您的姓名：");
        String name = scanner.nextLine();
        System.out.println("请选择您的身份： | 1-》SVIP人员 | 0-》普通参赛人员|");
        int who = scanner.nextInt();
        if (who == 1){
            return new Admin(name);
        }else{
            return  new NormalUser(name);
        }
    }    public static void main(String[] args) {
        //准备书籍
        BookList bookList = new BookList();
        //开始登陆 返回对象 Admin NormalUser
        User user = login();
        while (true){
            int choice =  user.menu();
            //如何去对应操作   Admin NormalUser
            user.doOperations(choice,bookList);
        }

    }
}
