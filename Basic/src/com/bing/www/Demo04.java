package com.bing.www;

public class Demo04 {
    public static void main(String[] args) {
        //++ --    自增   自减 一元运算符
        int a=3;
        //执行完这段代码后,先给b赋值,再自增
        int b=a++;
        //执行完这段代码前,先自增,再给b赋值
        int c=++a;
        System.out.println(b);
        System.out.println(c);
        System.out.println(b);
        System.out.println(c);



        //幂运算 2^3
        double pow=Math.pow(3,2);
        System.out.println(pow);























    }
}
