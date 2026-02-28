package com.bing.www.base;

public class Demo05 {
    public static void main(String[] args){
        int i=128;
        byte b=(byte)i;//内存溢出

        //强制转换: (类型)变量名    高--低
        //自动转换:               低--高
        System.out.println(i);
        System.out.println(b);
        /*
        * 注意点:
        * 1.不能对布尔值进行转换
        * 2.不能把对象类型转换成不相干的类型
        * 3.高容量转换成低容量时,强制转换
        * 4.转换时可能存在溢出或者精度问题
        *
        *
        * 低------------------------------------------高
        * byte,short,,char->int->float->double
        *
        *
        * */
        System.out.println("============================");
        System.out.println((int)23.7);//精度问题
        System.out.println((int)-45.89F);

        System.out.println("=============================");
        char c="a";
        int d=c+1;
        System.out.println(d);
        System.out.println((char)d);





























    }



















}
