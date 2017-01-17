package _448FindAllNumbersDisappearedinanArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), 
 * some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * @author LYH
 *
 */
public class Solution {
	
	/**
	 * 一开始没理解到题意，蠢以为是找出数组里面没出现过的数字，
	 * 其实是找1 ≤ i ≤ n (n = size of array)中i没在array
	 * 里面出现过的数字
	 * @param nums
	 * @return
	 
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disNubers = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
        	if(i!=nums.length-1){
        		int differNum = nums[i+1]-nums[i];
        		if(differNum!=0&&differNum!=1){
        			for(int j=1;j<differNum;j++){
        				disNubers.add(nums[i]+j);
        			}
        		}
        	}
        }
        return disNubers;
    }
	*/
	
	/**
	 * 方法虽然看起来没问题但在LeetCode上报TLE了(Time Limit Exceeded),时间复杂度也不为O(n)
	 * @param nums
	 * @return
	 
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disNubers = new ArrayList<Integer>();
        int[] temps = {};
        for(int i=1;i<=nums.length;i++){
        	int j;
        	for(j=0;j<nums.length;j++){
        		if(nums[j]==i){
        			break;
        			
        		}else{
        			continue;
        		}
        	}
        	if (j==nums.length){
        		disNubers.add(i);
        	}
        }
        
        return disNubers;
    }
    */
    public List<Integer> findDisappearedNumbers(int[] nums){
    	List<Integer> disNubers = new ArrayList<Integer>();
    	for(int i=0;i<nums.length;i++){
    		int index = Math.abs(nums[i])-1;
    		if(nums[index]>0){
    			nums[index] = -nums[index]; 
    		}		
    	}
    	
    	for(int j=0;j<nums.length;j++){
    		if(nums[j]>0){
    			disNubers.add(j+1);
    		}
    	}
    	return disNubers;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(new Solution().findDisappearedNumbers(nums));
		
	}
}
