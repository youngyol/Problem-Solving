// https://leetcode.com/problems/merge-intervals/

class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals==null || intervals.size()<1) return intervals;
        List<Interval> result = new ArrayList<>();
        int curIdx = 0; 
        
        Collections.sort(intervals, (x,y)->x.start-y.start);
        Interval cur=intervals.get(curIdx), next;  
        
        for(int nextIdx=1; nextIdx<intervals.size(); nextIdx++ ){
            next = intervals.get(nextIdx);
            if(cur.end  >= next.start){
                cur.end = Math.max(cur.end, next.end);
                cur.start = Math.min(cur.start, next.start);
            } else {
                result.add(cur);
                cur = next;
            }
        }
        result.add(cur);
        return result;
    }
}
