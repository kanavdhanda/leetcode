/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int end = nums.length-1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)return new int[] {i,j};
                    // System.gc();
                    
                
                else if ( nums[end-i]+nums[end-j] == target) return new int[] {end-i,end-j};
            }
        }
        // System.gc();
        return new int[] {};
    }
}
// @lc code=end

// O(n²) Not Efficient



/* Hash Map Approach: Efficient Approach 
    Subtract the current element from  the target and query the result in hash map.
*/