package com.guowei.niuke;

import java.util.PriorityQueue;

public class NC88 {
	private PriorityQueue<Integer> smallHeap = new PriorityQueue<>((a,b)->a-b);
	private PriorityQueue<Integer> bigHeap = new PriorityQueue<>((a,b)->b-a);

    public int findKth(int[] a, int n, int K) {
    	 PriorityQueue<Integer> heap = null;
    	if (K <= a.length/2) {
    		heap = smallHeap;
    		K = n - K;
    	} else {
    		heap = bigHeap;
    	}
    	for (int i = 0; i < n ; ++i) {
    		heap.add(a[i]);
    	}
    	while (--K > 0) {
    		heap.poll();
    	}
    	return heap.poll();
    }
    public static void main(String[] args) {
    	int[] arr = {1,3,5,2,2};
    	int findKth = new NC88().findKth(arr, 5, 3);
    	System.out.println(findKth);
	}
}
