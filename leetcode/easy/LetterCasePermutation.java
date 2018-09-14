// https://leetcode.com/problems/letter-case-permutation/description/

class Solution {
     public List<String> letterCasePermutation(String S) {
            char [] arr = S.toCharArray();
            List<String> result = new ArrayList<>();
            backtrack(arr, 0 , result);
            return result;
        }
    private void backtrack(char[] arr, int idx, List<String> result) {
        if(idx == arr.length){
            result.add(new String(arr));
        }else{
            if(isAlpha(arr[idx])){
                arr[idx] = Character.toLowerCase(arr[idx]);
                backtrack(arr, idx+1 , result);
                arr[idx] = Character.toUpperCase(arr[idx]);
                backtrack(arr, idx+1 , result);

            } else{
                backtrack(arr, idx+1 , result);
            }
        }
    }
    private boolean isAlpha(char ch) {
        return (ch >= 'a' && ch <= 'z') ||  (ch >= 'A' && ch <= 'Z');
    }
}
