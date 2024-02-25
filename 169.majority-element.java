/*
 * @lc app=leetcode id=169 lang=java
 *
 */
// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {

        int ans=nums[0];
        int count=0;

        for(int i : nums){
            if(count == 0){
                ans = i;
            }
             count += i==ans?1:-1;
        }

        return ans;
    }
}
// @lc code=end


// O(1)

// most efficient

// Made using moore's voting algorithm

// https://www.geeksforgeeks.org/boyer-moore-majority-voting-algorithm/




/*
 * [169] Majority Element
 *
 * https://leetcode.com/problems/majority-element/description/
 *
*/
