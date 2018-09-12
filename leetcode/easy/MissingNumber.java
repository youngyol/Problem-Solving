// https://leetcode.com/problems/missing-number/description/

class Solution {
    public int missingNumber(int[] nums) {
        int sum = (nums.length*(nums.length+1)) / 2;
        for(int num : nums )
            sum -= num;
        return sum;
    }
}
