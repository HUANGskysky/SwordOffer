package com.day;

/**
 * Created by 哓哓 on 2016/12/20.
 */
public class Main {
    public static void main(String[] args) {
        String str = "<p>hello world</p>";
        String res = str.replaceAll("</?p>","");
        System.out.println(res);
    }
}
