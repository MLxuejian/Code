package com.guowei.niuke;

import java.util.ArrayList;
import java.util.LinkedList;

public class NC15 {
	private LinkedList<TreeNode> queue= new LinkedList<>();
	private ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
    	ArrayList<Integer> tempList = new ArrayList<>();
    	tempList.add(root.val);
    	queue.add(root);
    	handleQueue();
    	return result;
    }
    private void handleQueue() {
    	int size = queue.size();
    	if (size == 0) {
    		return;
    	}
    	ArrayList<Integer> tempList = new ArrayList<>();
    	result.add(tempList);
    	for (int i = 0; i < size ; ++i) {
        	TreeNode poll = queue.poll();
        	tempList.add(poll.val);
        	if (poll.left != null) {
        		queue.offer(poll.left);
        	}
        	if (poll.right != null) {
        		queue.offer(poll.right);
        	}
    	}
    	handleQueue();
    }
    public static void main(String[] args) {
    	TreeNode root = new TreeNode(1);
    	TreeNode left = new TreeNode(2);
    	TreeNode right = new TreeNode(3);
    	TreeNode rightLeft = new TreeNode(4);
    	TreeNode rightRight = new TreeNode(5);
    	root.left = left;
    	root.right = right;
    	root.left.left = rightLeft;
    	root.right.right = rightRight;
    	ArrayList<ArrayList<Integer>> levelOrder = new NC15().levelOrder(root);
    	System.out.println(levelOrder);
	}
}
