package com.guowei.niuke;

public class NC59 {
    public int minPathSum (int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix[0].length];
        return minPathSum(matrix, temp, matrix.length - 1, matrix[0].length -1);
    }
    public int minPathSum (int[][] matrix,int[][] temp, int y, int x) {
    	if (x ==0 && y == 0) {
    		return matrix[0][0];
    	} 
    	if (x == 0) {
    		temp[0][y] = minPathSum(matrix,temp, 0, y -1) + matrix[0][y];
    		return temp[0][y];
    	}
    	if (y == 0) {
    		temp[x][0] = minPathSum(matrix,temp, x - 1, 0) + matrix[x][0];
    		return temp[x][0];
    	}
    	if (temp[x][y] != 0) {
    		return temp[x][y];
    	}
    	temp[x][y] = Math.min(minPathSum(matrix,temp, x -1, y) + matrix[x][y], minPathSum(matrix,temp, x, y -1) + matrix[x][y]);
    	return temp[x][y];
    }
    public static void main(String[] args) {
		int[][] arr = {{1,3,5,9},{8,1,3,4},{5,0,6,1},{8,8,4,0}};
		int minPathSum = new NC59().minPathSum(arr);
		System.out.println(minPathSum);
	}
}
