package _292NimGame;

public class Solution {
	
	/**
	 * 这是我自己的写法
	 * @param n
	 * @return
	 
	public boolean canWinNim(int n) {
		if(n<4)
			return true;
		else{
			return !(canWinNim(n-1)&&canWinNim(n-2)&&canWinNim(n-3));
		}
		
	}
	*/
	/**
	 * 这是得票最高的答案,还没有理解透彻
	 * @param n
	 * @return
	 */
	public boolean canWinNim(int n) {
       return n%4!=0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution().canWinNim(42));
	}

}
