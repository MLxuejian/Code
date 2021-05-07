package com.guowei.niuke;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class NC93 {
	int max = 0;
	LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();

	public int[] LRU(int[][] operators, int k) {
		max = k;
		int[] result = new int[operators.length];
		int currIndex = 0;
		if (operators == null || operators.length < 2) {
			return new int[0];
		}
		for (int[] arr : operators) {
			if (arr.length == 3 && arr[0] == 1) {
				set(arr[1], arr[2]);
			} else if (arr.length == 2 && arr[0] == 2) {
				result[currIndex++] = get(arr[1]);
			}
		}
		int[] res = new int[currIndex];
		System.arraycopy(result, 0, res, 0, currIndex );
		return res;
	}

	private void set(int key, int val) {
		if (!cache.containsKey(key) && cache.size() == max) {
			cache.remove(cache.keySet().iterator().next());
		}
		cache.put(key, val);
	}

	private int get(int key) {
		Integer remove = cache.remove(key);
		if (null != remove) {
			cache.put(key, remove);
		}
		return remove == null ? -1 : remove;
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 1, 1 }, { 1, 2, 2 }, { 1, 3, 2 }, { 2, 1 }, { 1, 4, 4 }, { 2, 2 } };
		int[] lru = new NC93().LRU(arr, 3);
		System.out.println(Arrays.toString(lru));
	}
}