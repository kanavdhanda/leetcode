/*
 * @lc app=leetcode id=1929 lang=java
 *
 * [1929] Concatenation of Array
 */

// @lc code=start
class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int[] ans = new int[l*2];
        for(int i=0; i < l ;i++){
            ans[i] = nums[i];
            ans[i+l] = nums[i];
        }
        return ans;
    }
}
// @lc code=end

// O(n)

// https://leetcode.com/problems/concatenation-of-array/description/
