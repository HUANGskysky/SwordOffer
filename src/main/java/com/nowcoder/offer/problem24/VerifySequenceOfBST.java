package com.nowcoder.offer.problem24;

import java.util.Arrays;

public class VerifySequenceOfBST {
	public boolean verifySquence(int[] squence) {
		if (null == squence || squence.length <=0) {
			return false;
		}
		int root = squence[squence.length - 1];
		
		// BST中左子树结点小于根结点
		int i = 0;
		for (; i < squence.length - 1; i++) {
			if (squence[i] > root) {
				break;
			}
		}
		
		// BST中右子树结点大于根结点
		int j = i;
		for (; j < squence.length - 1; j++) {
			if (squence[j] < root) {
				return false;
			}
		}
		
		boolean left = true;
		if (i > 0) {
			left = verifySquence(Arrays.copyOfRange(squence, 0, i));
		}
		
		
		boolean right = true;
		if (i < squence.length - 1) {
			right = verifySquence(Arrays.copyOfRange(squence, i, squence.length - 1));
		}
		
		return (left && right);
	}
}
