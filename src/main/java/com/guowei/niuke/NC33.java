package com.guowei.niuke;

public class NC33 {
	   public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
		   ListNode curr = new ListNode(0);
		   if (l1 == null) {
			   return l2;
		   }
		   if (l2 == null) {
			   return l1;
		   }
		   if(l1.val <= l2.val) {
			   curr.next = l1;
			   curr.next.next = mergeTwoLists(l1.next, l2);
		   }
		   if (l1.val > l2.val) {
			   curr.next = l2;
			   curr.next.next = mergeTwoLists(l1, l2.next);
		   }
		   return curr.next;
	    }
		public static void main(String[] args) {
			ListNode node1 = new ListNode(1);
			ListNode node2 = new ListNode(3);
			ListNode node3 = new ListNode(5);
			ListNode node4 = new ListNode(6);
			ListNode node5 = new ListNode(9);
			
			ListNode node6 = new ListNode(2);
			ListNode node7 = new ListNode(4);
			ListNode node8 = new ListNode(6);
			ListNode node9 = new ListNode(8);
			ListNode node10 = new ListNode(10);

			node1.next = node2;
			node2.next = node3;
			node3.next = node4;
			node4.next = node5;
			
			node6.next = node7;
			node7.next = node8;
			node8.next = node9;
			node9.next = node10;

			System.out.println(node1);
			System.out.println(node6);
			
			System.out.println(new NC33().mergeTwoLists(node1, node6));

		}
}
