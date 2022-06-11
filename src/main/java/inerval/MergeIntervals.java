package inerval;

import java.util.*;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if(intervals.length == 1)  return intervals;
        List<int[]> res = new LinkedList<>();

        //Sort ascending based on first element in array
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        int[] prev = intervals[0];
        int[] newInterval = new int[2];

        for(int i = 1; i < intervals.length; i++) {

            //No overlap with previous
            if(intervals[i][0] > prev[1]) {
                res.add(prev.clone());
                prev = intervals[i];
            }

            //overlap with previous
             else if(intervals[i][0] <= prev[1]) {
                newInterval[0] = Math.min(prev[0], intervals[i][0]);
                newInterval[1] = Math.max(prev[1], intervals[i][1]);
                prev = newInterval;
            }
        }
        res.add(prev.clone());
        return res.toArray(new int[res.size()][2]);
    }
}
