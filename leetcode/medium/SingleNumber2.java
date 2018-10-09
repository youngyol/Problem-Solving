// https://leetcode.com/problems/single-number-ii/description/

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length, i = 0;
        for( ;i<len; i+=3){
            if(i+2>=len) break;
            if(nums[i] != nums[i+2]) return nums[i];
        }
        return nums[i];
    }
}
