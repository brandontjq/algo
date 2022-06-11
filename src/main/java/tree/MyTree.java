package tree;

import java.util.ArrayList;
import java.util.List;

public class MyTree {

    private boolean balanced;

    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        //public BinaryTree parent = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
    //1
    public int getHeight(BinaryTree tree) {
        if(tree == null) {
            return 0;
        }

        int leftHeight = getHeight(tree.left);
        int rightHeight = getHeight(tree.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    //2
    public List<Integer> getSumOfBranches(BinaryTree tree) {
        List<Integer> list = new ArrayList<>();
        getSumOfBranches(tree, list, 0);
        return list;
    }

    private void getSumOfBranches(BinaryTree tree, List<Integer> list, int runningSum) {
        if(tree == null) {
            return;
        }
        runningSum += tree.value;
        if(tree.left == null && tree.right == null) {
            list.add(runningSum);
            return;
        }

        getSumOfBranches(tree.left, list, runningSum);
        getSumOfBranches(tree.right, list, runningSum);
    }

    //3
    public boolean balancedTree(BinaryTree tree) {
        balanced = true;
        int height = getHeightOfTree(tree);
        return balanced;
    }

    private int getHeightOfTree(BinaryTree tree) {
        if(tree == null) {
            return 0;
        }
        int leftHeight = getHeightOfTree(tree.left);
        int rightHeight = getHeightOfTree(tree.right);

        if(Math.abs(leftHeight - rightHeight) > 1) {
            balanced = false;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
