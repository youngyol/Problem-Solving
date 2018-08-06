class Solution {
    public int solution(int N) {
        int pos = -1, max = -1;
        String byteNum = Integer.toBinaryString(N);
        for (int i = byteNum.length() - 1; i >= 0; i--) {
            if ((1 & (N >> i)) == 1) {
                if (pos != -1) {
                    max = ((pos-i )> max )?pos-i:max;
                    pos = i;
                }
                else pos = i;
            }
        }
        return (max==-1)?0:max-1;
    }
}
