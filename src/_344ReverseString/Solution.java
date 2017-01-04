package _344ReverseString;

/**
 * Write a function that takes a string as input and returns the string reversed.
 * @author LYH
 *
 */
public class Solution {
	
	public String reverseString(String s) {
        char[] strCharArray = s.toCharArray();
        for(int i=0;i<strCharArray.length/2;i++){
        	char temp = strCharArray[i];
        	strCharArray[i] = strCharArray[strCharArray.length-1-i];
        	strCharArray[strCharArray.length-1-i]=temp;
        }
        return String.valueOf(strCharArray);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution().reverseString("liuyihuans"));
		//最简单的方法！！！
		System.out.println(new StringBuffer("liuyihuans").reverse());
	}

}
