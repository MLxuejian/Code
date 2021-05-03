package com.guowei.niuke;

public class NC3 {
    public ListNode detectCycle(ListNode head) {
    	if(head == null || head.next == null || head.next.next == null) {
    		return null;
    	}
    	ListNode slowNode = head.next;
    	ListNode fastNode = head.next.next;
    	while (fastNode.next != null && fastNode.next.next != null) {
    		if (slowNode == fastNode) {
    			fastNode = head;
    			while (fastNode!= slowNode) {
    				fastNode = fastNode.next;
    				slowNode =slowNode.next;
    			}
    			return slowNode;
    		}
    		slowNode = slowNode.next;
    		fastNode = fastNode.next.next;
    	}
    	return null;
    }
}
