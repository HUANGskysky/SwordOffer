package com.nowcoder.offer.problem35;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 字符串中第一个只出现一次的字符位置
 * @author 哓哓
 *
 */
public class FirstNotRepeating {
	/**
	 * LinkedHashMap实现
	 * @param s
	 * @return
	 */
	public Character getFirstNotRepeatingWay1(String s) {
		if (null == s) {
			return null;
		}
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		
		for (Character key : map.keySet()) {
			if (map.get(key) == 1) {
				return key;
			}
		}
		
		return null;
	}
	
	/**
	 * 两个数组实现
	 * @param s
	 * @return
	 */
	public Character getFirstNotRepeatingWay2(String s) {
		if (null == s) {
			return null;
		}
		int[] num = new int[255];
		int[] index = new int[255]; 
		
		for (int i = 0; i < s.length(); i++) {
			num[s.charAt(i)-'a']++;
			if (num[s.charAt(i)-'a'] == 1) {
				index[s.charAt(i)-'a'] = i;
			} else {
				index[s.charAt(i)-'a'] = 0;
			}
		}
		
		for (int val : index) {
			if (val != 0) {
				return s.charAt(val);
			}
		}
		
		return null;
	}
}
