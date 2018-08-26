// https://leetcode.com/problems/number-of-lines-to-write-string/description/

class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int [] result = new int[2];  
        result[0] = 1;
        for(char oneLetter : S.toCharArray() ){
            int tmp = widths[oneLetter-'a'];
            result[1] +=tmp;
            if(result[1] > 100 ){
                result[0] ++;
                result[1]= tmp;
            }
        }
        
        return result;
    }
}
