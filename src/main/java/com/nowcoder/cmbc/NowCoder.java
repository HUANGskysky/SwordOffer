package com.nowcoder.cmbc;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Created by 哓哓 on 2016/9/12 0012.
 */
public class NowCoder {
    public static void main(String[] args) {
        Set<MyClass> set = new HashSet<>();
        set.add(new MyClass(5));
        set.add(new MyClass(2));
        set.add(new MyClass(6));
        System.out.println(set.size());
    }
}

class MyClass {
    Integer i;
    public MyClass(Integer y) {
        i = y;
    }

    public boolean equals(MyClass c) {
        return false;
    }

    public boolean equals(Object o) {
        return true;
    }

    public int hashcode() {
        return 32;
    }
}