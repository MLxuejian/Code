package com.guowei.niuke;

public class NC50 {

	public ListNode reverseKGroup(ListNode head, int k) {
		if (head == null) {
			return null;
		}
		if (head.next == null ) {
			return head;
		}
		ListNode tail = head;
		for (int i = 0; i < k; ++i) {
			if (tail == null) {
				return head;
			}
			tail = tail.next;
		}
		ListNode reverse = reverse(head, tail);
		ListNode reverseKGroup = reverseKGroup(tail, k);
		head.next = reverseKGroup;
		return reverse;

	}
	
	private ListNode reverse(ListNode head, ListNode tail) {
		if (head == null || head.next == null) {
			return head;
		}
		if (head.next == tail) {
			return head;
		}
		ListNode reverse = reverse(head.next, tail);
		head.next.next = head;
		head.next =null;
		return reverse;
	}
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		System.out.println(node1);
		ListNode reverse = new NC50().reverseKGroup(node1,3);
		System.out.println(reverse);
	}
}
