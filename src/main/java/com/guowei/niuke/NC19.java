package com.guowei.niuke;

public class NC19 {
    public int maxsumofSubarray (int[] arr) {
    	if (arr == null || arr.length == 0) {
    		return 0;
    	}
    	return doMaxsumofSubarray(arr, 0, arr.length - 1);
        // write code here
    }
    private int doMaxsumofSubarray (int[] arr, int start, int end) {
    	if (start == end) {
    		return arr[start];
    	}
    	int left = doMaxsumofSubarray(arr, start, (start + end) / 2);
    	int right = doMaxsumofSubarray(arr, (start + end) / 2 + 1, end);
    	int leftMax = 0;
    	int leftSum = 0;
    	int currLeft = (start + end) / 2;
    	while (currLeft >= start) {
    		leftSum = leftSum + arr[currLeft--];
    		leftMax = leftMax > leftSum ? leftMax : leftSum;
    	}
    	int rightSum = 0;
    	int currRight = (start + end) / 2 + 1;
    	int rightMax = 0;
    	while (currRight <= end) {
    		rightSum = rightSum + arr[currRight++];
    		rightMax = rightMax > rightSum ? rightMax : rightSum;
    	}
    	int sum = leftMax + rightMax;
    	int temp = (left >= right ? left : right);
    	return temp >= sum ? temp : sum;
    }
    
    public static void main(String[] args) {
		int[] arr = {8, 1, -5, -9, -8, -8, -6, -7};
		int maxsumofSubarray = new NC19().maxsumofSubarray(arr);
		System.out.println(maxsumofSubarray);
	}
}
