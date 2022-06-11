package inerval;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalTest {

    @Test
    void test() {
        InsertInterval test = new InsertInterval();
        int[][] intervals = {{1,3}, {6,9}};
        int[] newInterval = {2,5};
        int[][] res = test.insert(intervals, newInterval);
        System.out.println(res);
    }

}