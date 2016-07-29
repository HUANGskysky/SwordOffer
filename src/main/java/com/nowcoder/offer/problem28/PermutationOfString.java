package com.nowcoder.offer.problem28;

import java.util.ArrayList;
import java.util.List;

/**
 * Problemn28
 * 字符串的全排列
 *
 * @author hztaoran
 */
public class PermutationOfString {
	public void perm(String s) {
		List<String> list = new ArrayList<>();
		if (null == s || s.length() <= 0) {
			return;
		}
		list = permRecursive(list, s.toCharArray(), 0, s.length() - 1);
		for (String a : list) {
			System.out.println(a);
		}
	}
	
	private List<String> permRecursive(List<String> list, char[] a, int begin, int end) {
		if (begin == end) {
				list.add(String.valueOf(a));
		} else {
			for (int i = begin; i <= end; i++) {
					swap(a, begin, i);
					permRecursive(list, a, begin+1, end);
					swap(a, begin, i);
			}
		}
		return list;
	}
	
	private void swap(char[] a, int i, int j) {
		 char temp = a[i];
	     a[i] = a[j];
	     a[j] = temp;
	}
}
