package _485MaxConsecutiveOnes;
/**
 * Given a binary array, 
 * find the maximum number of consecutive 1s in this array.
 * @author LYH
 *
 */
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) throws Exception {
        if(nums.length>10000){
        	throw new Exception("数组长度超过10000");
        }
        int tempMax=0;
        StringBuilder sbNums = new StringBuilder();
        for(int i=0;i<nums.length;i++){
        	sbNums.append(nums[i]);
        }
        String strNums = sbNums.toString();
        String[] spiltByZ = strNums.split("0");
        for(int i=0;i<spiltByZ.length;i++){
        	if(spiltByZ[i].length()>tempMax){
        		tempMax = spiltByZ[i].length();
        	}
        
        }
        return tempMax;
    }
    
    public static void main(String[] args) {
    	try{
    		int[] a= {1,1,1,0,1,0,1,1,1,1,0,1};
    		System.out.println(new Solution().findMaxConsecutiveOnes(a));
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    	
	}
}
