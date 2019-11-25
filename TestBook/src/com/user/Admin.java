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
        System.out.println("您好，SVIP "+this.name+"！ 欢迎进入Produce101专属通道！");
        System.out.println("1.查询排名");
        System.out.println("2.新增成员");
        System.out.println("3.淘汰成员");
        System.out.println("4.显示所有成员");
        System.out.println("0.退出该系统");
        System.out.println("======================");
        System.out.println("请您输入操作对应的数字：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
