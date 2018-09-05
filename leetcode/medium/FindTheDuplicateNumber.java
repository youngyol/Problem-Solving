// https://leetcode.com/problems/find-the-duplicate-number/description/

import java.util.Arrays;
class Solution {
    public int findDuplicate(int[] nums) {
           Arrays.sort(nums);
		   int prev = nums[0];
		   int len = nums.length;
		   for(int i=1; i<len; i++) {
			   if(prev == nums[i]) return prev;
			   prev = nums[i];
		   }
		   return prev;
    }
}
