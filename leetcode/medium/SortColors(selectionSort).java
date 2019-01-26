// https://leetcode.com/problems/sort-colors/

class Solution {
    public void sortColors(int[] nums) {
        for(int i=0; i<nums.length; i++){
           int minIdx = getMinIdx(nums, i); 
           swap(i, minIdx, nums);
        }
    } 
    
    private int getMinIdx(int[] nums, int start){
        int minIdx=start;
        for(int j=start; j<nums.length; j++){
           minIdx=(nums[minIdx]>nums[j])?j:minIdx;
        }
        return minIdx;
    }
    
    private void swap(int src, int dest, int[] nums){
        int tmp = nums[src];
        nums[src] = nums[dest];
        nums[dest] = tmp;
        
    }
    
}
