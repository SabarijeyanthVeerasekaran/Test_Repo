package com.twosum;

import java.util.HashMap;
//Code to solve twosum problem Simulate merge conflict Eclipse - 1
public class TwoSum {

	public static void main(String[] args) {
		
		int[] nums= {2,7,11,15};
		int[] result=twoSumSol(nums,9);
		System.out.println("The index are ");
		for(int r:result)
			System.out.println(r);
		

	}

	
	public static int[] twoSumSol(int[] nums,int target)
	{
		HashMap<Integer,Integer> deltaPair=new HashMap<Integer,Integer>(); 
		for(int i=0;i<nums.length;i++)
		{
			int delta=target-nums[i];
			if(deltaPair.containsKey(delta))
				return new int [] {deltaPair.get(delta),i};
			deltaPair.put(nums[i], i);
		}
		return new int[] {-1,-1};
	}
}
