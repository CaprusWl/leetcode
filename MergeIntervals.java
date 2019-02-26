/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */

class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1) {
            return intervals;
        }
        
        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
        
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        
        List<Interval> resList = new ArrayList<>();
        
        for (int i = 0; i < intervals.size(); i++) {
            if (intervals.get(i).start <= end) {
                end = Math.max(intervals.get(i).end, end);
            } else {
                resList.add(new Interval(start, end));
                start = intervals.get(i).start;
                end = intervals.get(i).end;
            }
        }
        
        resList.add(new Interval(start, end));
        
        return resList;
    }
}
