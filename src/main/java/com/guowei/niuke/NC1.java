package com.guowei.niuke;

public class NC1 {
    public String solve (String s, String t) {
    	StringBuilder sb = new StringBuilder();
    	int i = s.length() - 1;
    	int j = t.length() - 1;
    	int temp = 0;
    	while (i >= 0 || j >= 0 || temp == 1) {
    		int a = 0;
    		int b = 0;
    		if (i >= 0) {
    			 a = s.charAt(i--) - '0';
    		}
    		if (j >= 0) {
        		 b = t.charAt(j--) - '0';
    		}
    		int sum = a + b + temp;
    		if (sum >= 10) {
    			temp = 1;
    			sum = sum - 10;
    		} else {
    			temp = 0;
    		}
    		sb.append(sum);
    	}
    	return sb.reverse().toString();
    }
    public static void main(String[] args) {
    	String solve = new NC1().solve("1", "99");
    	System.out.println(solve);
	}
}
