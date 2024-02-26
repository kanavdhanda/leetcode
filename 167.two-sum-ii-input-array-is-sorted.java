/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int end= numbers.length-1;
        int start = 0;
        while(start<=end){
            if(numbers[start]+numbers[end]==target){
                result[0]= ++start;
                result[1] = ++end;
                return result;
            }
            else if(numbers[start]+numbers[end]<target){
                start++;
            }
            else end--;
        }

        return new int[0];
    }
}
// @lc code=end

// O(n)

// shttps://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/