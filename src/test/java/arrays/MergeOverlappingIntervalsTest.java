package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeOverlappingIntervalsTest {

    @Test
    void test() {
        int[][] intervals = new int[][] {{1,2}, {3,5}, {4,7}, {6,8}, {9,10}};
        MergeOverlappingIntervals m = new MergeOverlappingIntervals();
        var result = m.mergeOverlappingIntervals(intervals);
        System.out.println(result);
    }

}