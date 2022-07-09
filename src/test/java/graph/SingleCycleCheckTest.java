package graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleCycleCheckTest {

    @Test
    void test() {
        int[] arr = {2,3,1,-4,-4,2};
        System.out.println(-4%6);
        var result = SingleCycleCheck.hasSingleCycle(arr);
        System.out.println(result);
    }

}