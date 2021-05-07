package com.guowei.niuke;

import java.util.Arrays;

public class NC22 {
    public void merge(int arrA[], int m, int arrB[], int n) {
        int i = m -1;
        int j = n -1;
        int end = m + n - 1;
        while (i >=0 && j >= 0) {
            arrA[end--] = arrA[i] > arrB[j] ? arrA[i--] :arrB[j--];
        }
        while (j >= 0) {
            arrA[end -- ] = arrB[j--];
        }
    }
    public static void main(String[] args) {
    	int[] arrA = {};
    	int[] arrB = {1};
		new NC22().merge(arrA, 0, arrB, 1);
		System.out.println(Arrays.toString(arrA));
	}
}
