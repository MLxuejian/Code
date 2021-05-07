package com.guowei.niuke;

public class NC69 {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        if (pHead == null) {
        	return null;
        }
        ListNode fastNode = pHead;
        ListNode slowNode = pHead;

        for (int i= 0; i < k; ++i) {
        	if (fastNode == null) {
        		return null;
        	}
        	fastNode = fastNode.next;
        }
        while (fastNode != null) {
        	fastNode = fastNode.next;
        	slowNode = slowNode.next;
        }
        return slowNode;
    }
}
