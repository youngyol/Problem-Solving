// https://leetcode.com/problems/combinations/description/

import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<List<Integer>> answer;
    private int K,N; 
    
    public List<List<Integer>> combine(int n, int k) {
        answer = new ArrayList<>();
        N=n; K=k;
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        calulate(arr, 0, 1, new ArrayList<>());
        return answer;
    }

    private void calulate(int[] arr, int cnt, int idx, List<Integer> tmp) {
        if (cnt == K) {
            answer.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = idx; i <= N; i++) {
            tmp.add(arr[i]);
            calulate(arr, cnt + 1, i + 1, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }
}
