package com.edison;

import java.io.FileNotFoundException;

public class TryCatchDemo2 {
    public static void main(String[] args) {
        try {
            // 当产生异常时，必须有处理方式。要么捕获，要么声明。
            read("b.txt");
            System.out.println("异常包裹内的代码无法执行到");
        } catch (FileNotFoundException e) {// 括号中需要定义什么呢？
            //抓取到的是编译期异常 抛出去的是运行期
            throw new RuntimeException(e);
        }finally {
            System.out.println("不管程序怎样，这里都将会被执行。");
        }
        System.out.println("catch抛出了异常，异常包裹外的代码无法被执行到");
    }
    /*
     *
     * 我们 当前的这个方法中 有异常 有编译期异常
     */
    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("a.txt")) {//如果不是 a.txt这个文件
            // 我假设 如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常 throw
            throw new FileNotFoundException("文件不存在");
        }
        System.out.println("声明者抛出了异常，后续代码不会被执行到");
    }
}
