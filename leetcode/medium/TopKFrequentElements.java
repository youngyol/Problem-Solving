// https://leetcode.com/problems/top-k-frequent-elements/description/

import java.util.*;

class Solution {
    public  List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> tmp = new HashMap<>();
        for (int num : nums) {
            tmp.put(num, tmp.getOrDefault(num,0) + 1);
        }
         
        List<Integer> answer = new ArrayList<>();
         
        Map<Integer,Integer> sortedMap =
        tmp.entrySet().stream()
           .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
           .limit(k)
           .collect(Collectors.toMap(
              Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        
        for (int key : sortedMap.keySet()) {
            answer.add(key);
        }
        return answer;
    }

}
