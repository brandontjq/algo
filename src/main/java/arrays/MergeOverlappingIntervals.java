package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {
    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        // Write your code here.
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();

        int prevFirst = intervals[0][0];
        int prevSecond = intervals[0][1];

        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] > prevSecond) {
                res.add(new int[]{prevFirst, prevSecond});
                prevFirst = intervals[i][0];
                prevSecond = intervals[i][1];
            } else if (intervals[i][0] <= prevSecond) {
                prevSecond = Math.max(intervals[i][1], prevSecond);
            }
        }
        res.add(new int[]{prevFirst,prevSecond});
        return res.toArray(new int[res.size()][2]);
    }
}
