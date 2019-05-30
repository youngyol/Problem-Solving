// https://leetcode.com/problems/fibonacci-number/

class Solution {
    public int fib(int N) {
        return Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]})
                .limit(N+1)
                .map(n -> n[0])
                .collect(Collectors.toList())
                .get(N);
    
    }
}
