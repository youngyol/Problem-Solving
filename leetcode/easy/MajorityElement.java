// https://leetcode.com/problems/majority-element/description/


class Solution {
    public int majorityElement(int[] nums) {
        int x = 0, cnt = 0;
        for(int num : nums ){
            if(cnt==0) {
                x = num;
                cnt++;
           }else if(x== num) {
                cnt++;
            }else {
                cnt--;
            }
        }
        return x;
    }
}
