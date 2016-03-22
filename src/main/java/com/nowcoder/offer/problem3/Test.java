package com.nowcoder.offer.problem3;

public class Test {
	public static void main(String[] args) {
		Find findObj = new Find();
		int[][] a = new int[4][4];
		a[0][0]=1;
        a[0][1]=2;
        a[0][2]=8;
        a[0][3]=9;
        a[1][0]=2;
        a[1][1]=4;
        a[1][2]=9;
        a[1][3]=12;
        a[2][0]=4;
        a[2][1]=7;
        a[2][2]=10;
        a[2][3]=13;
        a[3][0]=6;
        a[3][1]=8;
        a[3][2]=11;
        a[3][3]=15;
        System.out.println(findObj.find(a, 7));
	}
}
