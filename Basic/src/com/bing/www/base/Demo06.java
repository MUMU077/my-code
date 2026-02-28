package com.bing.www.base;

public class Demo06 {
    public  static  void  main(String[] args){


        //操作比较大的数时注意溢出问题
        //数字之间可以用下划线划分
        int money=10_0000_0000;
        int years=20;
        int total=money*years;//-147483 计算时溢出了
        long total2=money*years;//默认是int,转换之前已经存在问题了


































    }
}
