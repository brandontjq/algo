package search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchForRangeTest {

    @Test
    void test() {
        int[] array = new int[]{0,1,21,33,45,45,45,45,45,45,61,71,73};
        int[] array2 = new int[]{0,1,21,33,45,45,45,45,45,47,61,71,73};
        int[] array3 = new int[]{5,7,7,8,8,10};
        int[] array4 = new int[]{5,7,7,8,8,10};
        var result = SearchForRange.searchForRange(array4, 9);
        System.out.println(result);
    }

}