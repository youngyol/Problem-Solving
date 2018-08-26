// https://leetcode.com/problems/valid-anagram/

class Solution {
    public boolean isAnagram(String s, String t) {
        int [] alphabets = new int[26];
        for(char one : s.toCharArray()) {
            alphabets[one-'a']++;
        }

        for(char one : t.toCharArray()) {
            alphabets[one-'a']--;
        }

        for(int cnt : alphabets){
            if(cnt != 0 ) return false;
        }
        return  true;
    }
}
