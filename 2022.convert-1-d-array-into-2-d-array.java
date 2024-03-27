/*
 * @lc app=leetcode id=2022 lang=java
 *
 * [2022] Convert 1D Array Into 2D Array
 */

// @lc code=start
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int curr=0;
        int[][] ans = new int[m][n] ;

        if(m*n != original.length) return new int[][] {};


        else{
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]= original[curr];
                curr++;
            }
        }
        }
        return ans;
    }
}
// @lc code=end

