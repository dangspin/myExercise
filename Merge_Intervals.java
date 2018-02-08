/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */


public class Solution {
    /*
     * @param intervals: interval list.
     * @return: A new interval list.
     */
    public List<Interval> merge(List<Interval> intervals) {
        // write your code here
        
        Collections.sort(intervals, new intervalCompare());
        
        ArrayList<Interval> sets = new ArrayList<Interval>(intervals);
        ArrayList<Interval> result = new ArrayList<Interval>();
        
        if (sets.size() <= 1) {return sets;}
        
        Interval current = sets.get(0);
        
        for (int i = 1; i < sets.size(); i++) {
            if (current.end >= sets.get(i).start) {
                current.end = Math.max(sets.get(i).end,current.end);
            } else {
                result.add(current);
                current = sets.get(i);
            }
        }
        
        result.add(current);
        return  result;
    }
    
    class intervalCompare implements Comparator<Interval> {
        public int compare(Interval n1, Interval n2) {
            int result = n1.start - n2.start;
            
            if (result == 0) {
                result = n1.end - n2.end;
            }
            
            return result;
        }
    }
}
