package com.pruthvi.java.interviewQuestion;

import java.util.Scanner;
/*You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.)
 *  You may assume all four edges of the grid are surrounded by water.
 *  The area of an island is the number of cells with a value 1 in the island.

	Return the maximum area of an island in grid. If there is no island, return 0.
	
	Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
	Output: 6
	Explanation: The answer is not 11, because the island must be connected 4-directionally.
*/
class Solution{
	static boolean seen[][];
	public static int maxAreaOfIsland(int[][] grid) {
		int islandArea=0;
		seen=new boolean[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
					islandArea=Math.max(islandArea, searchIslandArea(grid, i, j));
			}
		}
		return islandArea;
	}
	/* j
	 * i	 
			 0 0 0 1 0
			 0 0 1 1 0
	 * 		 0 1 0 0 1
	 * 		 1 1 0 0 1
	 * 		 0 0 1 1 1
	 * maxArea=5
	 * */
	public static int searchIslandArea(int[][] grid,int i,int j) {
		if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0 || seen[i][j])
			return 0;
		seen[i][j]=true;
		return (1+searchIslandArea(grid,i,j-1)+searchIslandArea(grid,i,j+1)+searchIslandArea(grid,i-1,j)+searchIslandArea(grid,i+1,j));
	}
}
public class IslandProblem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int m=sc.nextInt();
			int n=sc.nextInt();
			int[][] grid=new int[m][n];
			//System.out.println(grid.length+" "+grid[0].length);
			//make sure you enter value either 0 or 1
			while(sc.hasNext()) {
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						grid[i][j]=sc.nextInt();
					}
				}
				int noOfIsland=Solution.maxAreaOfIsland(grid);
				System.err.println(noOfIsland);
				
			}
		}

	}

}
