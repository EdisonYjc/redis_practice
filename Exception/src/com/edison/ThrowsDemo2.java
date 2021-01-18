package com.edison;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo2 {
    public static void main(String[] args) throws IOException {
        read("a.txt");
        System.out.println("调用者抛出了异常，后续代码不会被执行到");
    }
    public static void read(String path)throws FileNotFoundException, IOException {
        if (!path.equals("a.txt")) {//如果不是 a.txt这个文件
            // 我假设 如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常 throw
            throw new FileNotFoundException("文件不存在");
        }
        if (!path.equals("b.txt")) {
            throw new IOException();
        }
        System.out.println("声明者抛出了异常，后续代码不会被执行到");
    }
}
