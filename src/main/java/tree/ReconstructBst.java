package tree;

import java.util.ArrayList;
import java.util.List;

public class ReconstructBst {
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public BST reconstructBst(List<Integer> preOrderTraversalValues) {
        // Write your code here.
        return reconstructBst(preOrderTraversalValues, 0, preOrderTraversalValues.size() -1, preOrderTraversalValues.get(0));
    }

    private BST reconstructBst(List<Integer> list, int start, int end, int current) {
        //base conditions here
        if(start > end) {
            return null;
        }

        int rightIdx = 0;
        int leftIdx = start + 1;

        for(int i = start; i < end; i++) {
            int value = list.get(i);
            if(value > current) {
                rightIdx = i;
                break;
            }
        }

        BST node = new BST(current);
        node.left = reconstructBst(list, leftIdx, rightIdx, leftIdx);
        node.right = reconstructBst(list, rightIdx, end, rightIdx);

        return node;

    }
}
