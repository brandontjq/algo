package inerval;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {

    @Test
    void test() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] intervals = {{2,3}, {2,2}, {3,3}, {1,3}, {5,7}, {2,2}, {4,6}};
        int[][] res = mergeIntervals.merge(intervals);
        System.out.println(res);
    }

}