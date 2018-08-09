
class Solution {
    public int solution(int[] A) {
        int sum = 0;
        for(int num : A)
            sum+=num;
        int min = 99999999, firstPart=0;
        for(int i=0; i<A.length-1; i++){
            firstPart+=A[i];
            int secondPart = sum-firstPart;
            int diff = Math.abs(firstPart-secondPart);
            min = ( diff < min) ? diff : min;
        }
        return  min;
    }
}
