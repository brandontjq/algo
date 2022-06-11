package inerval;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonOverlappingIntervalsTest {

    @Test
    void test() {
        NonOverlappingIntervals nonOverlappingIntervals = new NonOverlappingIntervals();
        int[][] intervals = {{1,100}, {11,22}, {1,11}, {2,12}};
        int res = nonOverlappingIntervals.eraseOverlapIntervals(intervals);
    }

}