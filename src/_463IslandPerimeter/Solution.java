package _463IslandPerimeter;

public class Solution {
	
    public int islandPerimeter(int[][] grid) {
    	/**
    	 * 分两部走： 1-找出有多少个1
    	 * 		  2-统计有多少个两两相邻的1
    	 */
    	int sum=0;
    	int countNeber = 0;
    	int x,y;
    	
    	for(int i=0; i<grid.length; i++){
    		for(int j=0;j<grid[i].length;j++){
    			if(grid[i][j]==1){
    				sum++;
    				if(j!=grid[i].length-1&&grid[i][j+1]==1){
    					countNeber++;
    				}
    				if(i!=grid.length-1&&grid[i+1][j]==1){
    					countNeber++;
    				}
    			}
    		}
    	}
    	System.out.println(sum+","+countNeber);
    	return sum*4-countNeber*2;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		System.out.println(new Solution().islandPerimeter(grid));
	}

}
