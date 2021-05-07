package com.guowei.niuke;

import java.util.ArrayList;
import java.util.Arrays;

public class NC54 {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        int length = num.length;
        if (num == null || length < 3) {
        	return result;
        }
        for (int i = 0; i < length - 2; ++i) {
        	if (i >= 1 && num[i - 1] == num[i]) {
        		continue;
        	}
        	if (num[i] + num[i + 1] > 0) {
        		return result;
        	}
        	int target = -num[i];
        	twoSum(target, num, i + 1, length - 1);
        }
        return result;
    }
    private void twoSum(int target, int[] num, int start, int end){
    	while (start < end) {
        	ArrayList<Integer> temp = new ArrayList<>();
    		if (num[start] + num[end] < target) {
    			++start;
    			continue;
    		}
    		if (num[start] + num[end] > target) {
    			--end;
    			continue;
    		}
    		if (num[start] + num[end] == target) {
    			temp.add(-target);
    			temp.add(num[start]);
    			temp.add(num[end]);
    			result.add(temp);
    			while (start < end && num[start] == num[start + 1]) {
    				start++;
    			}
    			while (start < end && num[end] == num[end -1]) {
    				end--;
    			}
    			start++;
    			end--;
    		}
    	}
    }
    public static void main(String[] args) {
    	int arr[] = {1,2,-2,-1};
    	ArrayList<ArrayList<Integer>> threeSum = new NC54().threeSum(arr);
    	System.out.println(threeSum);
	}
}
