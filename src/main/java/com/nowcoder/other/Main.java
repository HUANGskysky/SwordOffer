package com.nowcoder.other;

import java.io.UnsupportedEncodingException;

/**
 * Created by 哓哓 on 2016/10/15 0015.
 */
public class Main {

    public static final String parseISO2GB(String text) throws UnsupportedEncodingException {
        String input = new String(text.getBytes(), "ISO-8859-1");
        byte[] b = input.getBytes("GB2312");
        String output = new String(b, "GB2312");

        return output;
    }

}
