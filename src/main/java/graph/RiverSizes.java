package graph;

import java.util.ArrayList;
import java.util.List;

public class RiverSizes {
    private static int riverSize = 0;

    public static List<Integer> riverSizes(int[][] matrix) {
        // Write your code here.

        List<Integer> riverSizes = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 1) {
                    riverSize = 0;
                    visit(i, j, matrix);
                    riverSizes.add(riverSize);
                }
            }
        }
        return riverSizes;
    }

    private static void visit(int row, int col, int[][] matrix) {
        if(row == matrix.length || row < 0 ||
        col == matrix[row].length || col < 0 ||
        matrix[row][col] == 2 || matrix[row][col] == 0) {
            return;
        }

        if(matrix[row][col] == 1) {
            riverSize++;
            matrix[row][col] = 2;
            visit(row - 1, col, matrix);
            visit(row + 1, col, matrix);
            visit(row, col - 1, matrix);
            visit(row, col + 1, matrix);
        }

    }

}
