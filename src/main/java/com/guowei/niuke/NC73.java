package com.guowei.niuke;

import java.util.HashMap;
import java.util.Map;

public class NC73 {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array == null || array.length <= 0) {
        	return 0;
        }
        if (array.length == 1) {
        	return array[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
        	Integer count = map.get(i);
        	if (count == null) {
        		map.put(i, 1);
        		continue;
        	}else {
        		map.put(i, ++count);
        	}
        	if (count >array.length/2) {
        		return i;
        	}
        }
        return 0;
    }
    public static void main(String[] args) {
    	int[] arr = {1,2,3,2,2,2,5,4,2};
		int moreThanHalfNum_Solution = new NC73().MoreThanHalfNum_Solution(arr);
		System.out.println(moreThanHalfNum_Solution);
	}
}
