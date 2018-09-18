//  https://leetcode.com/problems/permutations/description/


class Solution {
    List<List<Integer>> ans;
    int len;
    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        len = nums.length-1;
        doPermute(nums,0);
        return ans;
    }

    private void doPermute(int[] nums, int idx) {
        if(idx==len) {
            List<Integer> tmp = new ArrayList<>();
            for(int num : nums)
                tmp.add(num);
             ans.add(tmp);
        } else{
            for (int i = idx; i <= len; i++){
                swap(nums,idx,i);
                doPermute(nums, idx+1);
                swap(nums,idx,i);
            }
        }

    }

    public void swap(int[] a, int i, int j) {
        int temp;
        temp = a[i] ;
        a[i] = a[j];
        a[j] = temp;
     }
}
