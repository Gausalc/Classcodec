package com.user;

import com.operation.*;

import java.util.Scanner;

public class NormalUser extends User {
    public NormalUser(String name){
        this.name = name;
        this.operations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
        };
    }
    @Override
    public int menu() {
        System.out.println("======================");
        System.out.println("您好,普通参与者 "+this.name+"! 欢迎使用Produce101系统！");
        System.out.println("1.查询排名");
        System.out.println("2.提升等级");
        System.out.println("3.进行充值");
        System.out.println("0.退出系统");
        System.out.println("======================");
        System.out.println("请您输入操作对应的数字：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
