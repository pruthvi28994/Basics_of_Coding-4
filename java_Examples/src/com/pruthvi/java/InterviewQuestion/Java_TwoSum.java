package com.pruthvi.java.InterviewQuestion;
import java.util.Scanner;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * 
 * Input: nums = [2,7,11,15], target = 9
   Output: [0,1]
   Output: Because nums[0] + nums[1] == 9, we return [0, 1].
   
   Input: nums = [3,2,4], target = 6
   Output: [1,2]
 * 
 * */
class TwoSum{
	public static int[] twoSum(int[] nums, int target) {
        int[] output=new int[2];
        boolean flag=false;
        
        //assume array has only one solution
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    output[0]=i;  //if you put i+1 then it will give index positions in [1-nums.length]
                    output[1]=j;
                    flag=true;
                    break;
                }
            }
            if(flag)
                break;
        }
        return output;
    }
}
public class Java_TwoSum {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] result=new int[2];
			while (sc.hasNext()) {
				int size = sc.nextInt();
				int[] input = new int[size];
				for (int i = 0; i < input.length; i++) {
					input[i]=sc.nextInt();
				}
				int target=sc.nextInt();
				result=TwoSum.twoSum(input,target);
				for (int i : result) {
					System.out.println(i);
				}
			}
			
		}

	}

}
