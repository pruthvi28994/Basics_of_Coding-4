package com.pruthvi.java.interviewQuestion;

import java.util.Scanner;

/*
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 * 
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 *  You may assume all four edges of the grid are all surrounded by water
 * Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
	]
	Output: 1
 * 
 * */
class noOfIslands{
	 static boolean[][] seen;
		static int count=0;
		public static int numIslands(char[][] grid) {
			int noIslands=0;
			seen=new boolean[grid.length][grid[0].length];
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[0].length; j++) {
						noIslands+=countIslands(grid,i,j);
				}
			}
     return noIslands;
	}
	public static int countIslands(char[][] grid, int i, int j) {
			if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || seen[i][j] || grid[i][j]=='0')
				return 0;
			seen[i][j]=true;
			return((1+countIslands(grid,i,j-1)+countIslands(grid,i,j+1)+countIslands(grid,i-1,j)+countIslands(grid,i+1,j))>=1?1:0);
				
		}
	
}
public class java_noOfIsland {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int m=sc.nextInt();
			int n=sc.nextInt();
			char[][] grid=new char[m][n];
			//System.out.println(grid.length+" "+grid[0].length);
			//make sure you enter value either 0 or 1
			while(sc.hasNext()) {
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						grid[i][j]=sc.next().charAt(i);
					}
				}
				int result=noOfIslands.numIslands(grid);
				System.out.println(result);
			}
		}

	}

}
