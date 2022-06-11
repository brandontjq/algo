package search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShiftedBinarySearchTest {

    @Test
    void test() {
        ShiftedBinarySearch s1 = new ShiftedBinarySearch();
        int[] array = {45,61,71,72,73,0,1,21,33,37};
        var result = s1.shiftedBinarySearch(array, 1);
        System.out.println( result);
    }

}