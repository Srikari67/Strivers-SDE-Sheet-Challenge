import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
         List<Interval> result = new ArrayList<>();

        if (intervals == null || intervals.length == 0)
            return result;

        Arrays.sort(intervals, (a, b) -> a.start - b.start);

        Interval current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            Interval next = intervals[i];

            if (current.finish >= next.start) {
                current.finish = Math.max(current.finish, next.finish);
            } else {
                result.add(current);
                current = next;
            }
        }

        result.add(current);

        return result;
        

    }
}
