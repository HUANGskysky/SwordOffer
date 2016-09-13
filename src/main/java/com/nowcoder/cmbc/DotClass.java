package com.nowcoder.cmbc;

import java.util.HashMap;

/**
 * Created by 哓哓 on 2016/9/12 0012.
 */
public class DotClass extends Thread {
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println(".");
        }
        HashMap map = new HashMap();
        map.put(null, null);
    }
}
