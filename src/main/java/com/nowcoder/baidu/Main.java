package com.nowcoder.baidu;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by _NoThankYou on 2016/9/26.
 */
public class Main {
    public static void main(String[] args) {

    }

    public void write(String file1,String file2) throws IOException {
        BufferedReader bd1 = new BufferedReader(new FileReader(file1));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c:txt"), "UTF-8"));
        BufferedWriter bd2=new BufferedWriter(new FileWriter(file2));
        Map<String,Integer> map=new HashMap<String, Integer>();


        String buffered;

        while((buffered=bd1.readLine())!=null){
            String bufferedArray[] = buffered.split(" ");
            for(int i=0;i<bufferedArray.length;i++){
                if(!map.containsKey(bufferedArray[i]))
                    map.put(bufferedArray[i], 1);
                else
                    map.put(bufferedArray[i], map.get(bufferedArray[i])+1);
            }
        }
        bd1.close();
        for(String s:map.keySet()){
            bd2.write(s+" "+ map.get(s));
            bd2.write('\n');
        }
        bd2.close();
    }

}
