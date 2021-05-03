package com.guowei.niuke;

public class NC17 {
    public int getLongestPalindrome(String s, int n) {
    	if (s  == null || s.length() == 0) {
    		return 0;
    	}
    	if (s.length() == 1) {
    		return 1;
    	}
    	int maxLength = 0;
    	for (int i = 0; i < n; ++i) {
    		int a = i, b = i + 1,c = i,d = i;
    		while (a >=0 && b <= n - 1) {
    			if (s.charAt(a) == s.charAt(b)) {
    				maxLength = (b -a + 1 > maxLength) ? b -a + 1 : maxLength;
    				a--;
    				b++;
    			}else {
    				break;
    			}
    		}
    		while (c >=1 && d <= n -2) {
    			if (s.charAt(c - 1) == s.charAt(d +1)) {
    				maxLength = (d -c + 3 > maxLength) ? d -c + 3 : maxLength;
    				c--;
    				d++;
    			} else {
    				break;
    			}
    		}
    	}
        return maxLength;
    }
    public static void main(String[] args) {
    	String s = "cbc";
    	int n = 3;
		int longestPalindrome = new NC17().getLongestPalindrome(s, n);
		System.out.println(longestPalindrome);
	}
}
