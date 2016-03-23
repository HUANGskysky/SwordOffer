package com.nowcoder.offer.problem28;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {
	public void perm(String s) {
		List<String> list = new ArrayList<>();
		if (null == s || s.length() <= 0) {
			return;
		}
		list = permRecursive(list, s.toCharArray(), 0, s.length());
		for (String a : list) {
			System.out.println(a);
		}
	}
	
	private List<String> permRecursive(List<String> list, char[] a, int begin, int length) {
		if (begin == length - 1) {
			if (!list.contains(String.valueOf(a))) {
				list.add(String.valueOf(a));
			}
		} else {
			for (int i = begin; i < length; i++) {
				if (i == begin || a[i]!=a[begin]) {
					swap(a, begin, i);
					permRecursive(list, a, begin+1, length);
					swap(a, begin, i);
				}
			}
		}
		return list;
	}
	
	private void swap(char[] a, int begin, int i) {
		 char temp = a[begin];
	        a[begin] = a[i];
	        a[i] = temp;
	}
}
