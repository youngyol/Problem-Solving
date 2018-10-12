// https://leetcode.com/problems/permutations/description/

class Solution {
    List<List<Integer>> ans;
    List<Integer> tmp = new ArrayList<>();
    boolean[] visited;
    int len;
    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        len = nums.length;
        visited = new boolean[len];
        doPermute(nums,0);
        return ans;
    }

    private void doPermute(int[] nums, int idx) {
        if(idx==len) {
             ans.add(new ArrayList<>(tmp)); 
        } else{
            for (int i = 0; i < len; i++){
                if(!visited[i]) {
                    tmp.add(nums[i]);
                    visited[i] =true;
                    doPermute(nums, idx+1);
                    visited[i] =false;
                    tmp.remove(tmp.size()-1);
                } 
            }
        }

    } 
}
