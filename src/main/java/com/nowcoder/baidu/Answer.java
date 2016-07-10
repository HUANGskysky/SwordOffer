package com.nowcoder.baidu;

import java.io.*;

/**
 * Created by taoxiaoran on 16/4/1.
 */
public class Answer {

    public void getAveragePrice(File file) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
    }
}
