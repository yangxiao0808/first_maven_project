package com.yangxiao.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args ){
        int a=-10;
        int b=-20;
        int c=b-a;
        int d=add(a,b);
        System.out.println(d);
    }

    public static int add(int a,int b){
        return abs(a)+abs(b);
    }

    public static int abs(int a){
        return Math.abs(a);
    }
}
