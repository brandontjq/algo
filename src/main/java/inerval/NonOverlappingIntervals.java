package inerval;

import java.util.Arrays;

public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        int res = 0;
        if(intervals.length == 1) return res;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int[] prev = intervals[0];

        for(int i = 1; i < intervals.length; i++) {
            //if overlap
            if(intervals[i][0] < prev[1]) {
                res++;
            } else {
                prev = intervals[i];
            }

        }
        return res;
    }
}
