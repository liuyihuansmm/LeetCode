package _476NumberComplement;

/**
 * 
 * @author LYH
 *Given a positive integer, output its complement number. 
 *The complement strategy is to flip the bits of its binary representation.
 */
public class Solution {
	
    public int findComplement(int num) {
    	
    	int bitLength = Integer.toBinaryString(num).length();	
    	return num^((1<<bitLength)-1);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		System.out.println(new Solution().findComplement(a));
	}

}
