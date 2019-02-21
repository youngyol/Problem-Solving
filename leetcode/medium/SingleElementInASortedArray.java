// https://leetcode.com/problems/single-element-in-a-sorted-array/

class Solution {
   public  int singleNonDuplicate(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int twiceSum = Arrays.stream(nums).distinct().sum() * 2;
        int unique = twiceSum - sum;
        return unique;
    }
}
