package graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RiverSizesTest {

    @Test
    void test() {
        int[][] matrix = new int[][]{
                {1,0,0,1,0},
                {1,0,1,0,0},
                {0,0,1,0,1},
                {1,0,1,0,0},
                {1,0,1,1,0},
        };

        var result = RiverSizes.riverSizes(matrix);
        System.out.println(result);
    }

}