package com.nowcoder.iqiyi;

/**
 * Created by 哓哓 on 2016/9/18 0018.
 */
public class Demo {
    public static void main(String[] args) {
      String s1 = new String("hello");
      String s2 = new String("hello");
        System.out.println(s1==s2);
    }


    public static void op(StringBuffer strbufa, StringBuffer strbufb) {
        strbufa.append(strbufb);
        strbufb = strbufa;
    }
}
