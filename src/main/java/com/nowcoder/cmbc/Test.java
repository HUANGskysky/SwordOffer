package com.nowcoder.cmbc;

/**
 * Created by 哓哓 on 2016/9/12 0012.
 */
public class Test {
    static {
        x=1;
    }

    static int x,y;

    public static void main(String[] args) {
        x--;
        method();
        System.out.println(x + y + ++x);
    }

    static void method() {
        y = x++ + ++x;
    }
}
