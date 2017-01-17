package _136SingleNumber;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Given an array of integers, 
 * every element appears twice except for one. Find that single one.
 * Note:
 *	Your algorithm should have a linear runtime complexity. 
 *	Could you implement it without using extra memory?
 * @author LYH
 *
 */
public class Solution {

	public int singleNumber(int[] nums) {
		
//		List list = new ArrayList();
//		int sumN=0,sumH=0;
//		for(int n:nums){
//			list.add(n);
//			sumN+=n;
//		}
//		Set set = new HashSet<>(list);
//		Iterator it = set.iterator();
//		while(it.hasNext()){
//			sumH+=(int)it.next();
//		}
//		
//		return sumH*2-sumN;
		
		/**
		 * we use bitwise XOR to solve this problem :
		   first , we have to know the bitwise XOR in java
		   0 ^ N = N
		   N ^ N = 0
		   So..... if N is the single number
		   N1 ^ N1 ^ N2 ^ N2 ^..............^ Nx ^ Nx ^ N
 		   = (N1^N1) ^ (N2^N2) ^..............^ (Nx^Nx) ^ N
		   = 0 ^ 0 ^ ..........^ 0 ^ N
		   = N
		 */
		int result=0;
		for(int n:nums)
			result^=n;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,4,7,2,5,8,7,2,5,4,1,44,8};
		System.out.println(new Solution().singleNumber(a));
	}

}
