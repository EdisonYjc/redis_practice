package com.edison;

import java.io.FileNotFoundException;

public class ThrowsDemo {
    public static void main(String[] args) throws FileNotFoundException {
        read("b.txt");
        System.out.println("调用者抛出了异常，后续代码不会被执行到");
    }
    // 如果定义功能时有问题发生需要报告给调用者。可以通过在方法上使用throws关键字进行声明
    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("a.txt")) {//如果不是 a.txt这个文件
            // 我假设 如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常 throw
            throw new FileNotFoundException("文件不存在");
        }
        System.out.println("声明者抛出了异常，后续代码不会被执行到");
    }
}
