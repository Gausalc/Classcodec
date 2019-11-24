package com.user;

import com.operation.*;

import java.util.Scanner;

public class Admin extends User {
    public Admin(String name){
        this.name = name;
        this.operations = new IOperation[]{
                //存放数据
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),
        };
    }
    @Override
    public int menu() {
        System.out.println("======================");
        System.out.println("您好，管理员 "+this.name+"！ 欢迎使用图书管理系统！");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示所有图书");
        System.out.println("0.退出系统");
        System.out.println("======================");
        System.out.println("请您输入操作对应的数字：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
