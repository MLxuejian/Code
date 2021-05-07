package com.guowei.niuke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class NC14 {
    private LinkedList<TreeNode> list = new LinkedList<>();
    private ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        if (root == null) {
            return result;
        }
        list.add(root);
        doZigzagLevelOrder(false);
        return result;
    }
    public void doZigzagLevelOrder(boolean flag){
        int size = list.size();
        if (size == 0) {
            return;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        while (size-- > 0) {
        	TreeNode poll = list.poll();
        	temp.add(poll.val);
        	if (poll.left != null) {
        		list.offer(poll.left);
        	}
        	if (poll.right != null) {
        		list.offer(poll.right);
        	}
        }
        if (flag) {
          Collections.reverse(temp);
        }
        result.add(temp);
         doZigzagLevelOrder(!flag);
  } 
    public static void main(String[] args) {
    	TreeNode root = new TreeNode(3);
    	TreeNode left = new TreeNode(9);
    	TreeNode right = new TreeNode(20);
    	TreeNode rightLeft = new TreeNode(15);
    	TreeNode rightRight = new TreeNode(7);
    	root.left = left;
    	root.right = right;
    	root.left.left = rightLeft;
    	root.right.right = rightRight;
    	ArrayList<ArrayList<Integer>> levelOrder = new NC14().zigzagLevelOrder(root);
    	System.out.println(levelOrder);
	}
}
