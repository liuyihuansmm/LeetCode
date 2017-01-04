package _461HammingDistance;

import java.util.Scanner;

/**
 * HammingDistance求俩数转成相同长度时候，有多少位不同，就是他俩的HammingDistance
 * @author LYH
 *
 */
public class Solution {
    public int hammingDistance(int x, int y) {
    	//异或
    	int result = x^y;
    	String binary = Integer.toBinaryString(result);
    	char[] str =binary.toCharArray();
    	int count = 0;
    	for(int i=0; i<str.length; i++){
    		if(str[i] =='1')
    			count++;
    	}
    	return count;
    }
    
    public static void main(String[] args) {
    	int a,b;
    	Scanner scan = new Scanner(System.in);
    	System.out.println("please entry two numbers:");
    	a = scan.nextInt();
    	b = scan.nextInt();
    	System.out.println("HammingDistance is:"+new Solution().hammingDistance(a,b));
	}
}
