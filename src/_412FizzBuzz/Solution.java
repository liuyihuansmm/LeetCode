package _412FizzBuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program that outputs the string representation of numbers from 1 to n.
 * But for multiples of three it should output “Fizz” instead of the number and for the 
 * multiples of five output “Buzz”. For numbers which are multiples of both three and five 
 * output “FizzBuzz”.
 * @author LYH
 *
 */
public class Solution {
	
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for(int i=1;i<=n;i++){
        	if(i%3==0&&i%5!=0)
        		result.add("Fizz");
        	else if(i%3!=0&&i%5==0)
        		result.add("Buzz");
        	else if(i%3==0&&i%5==0)
        		result.add("FizzBuzz");
        	else
        		result.add(String.valueOf(i));
        }
    	return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution().fizzBuzz(15).toString());
	}

}
