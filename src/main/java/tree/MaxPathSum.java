package tree;

public class MaxPathSum {
    public static int max = Integer.MIN_VALUE;

    public static int maxPathSum(BinaryTree tree) {
        // Write your code here.
        solve(tree);
        return max;
    }

    private static int solve(BinaryTree tree) {
        if(tree == null) {
            return 0;
        }

        int left = solve(tree.left);
        int right = solve(tree.right);

        int leftBranchOrRightBranchIsLarger = Math.max(left, right);
        int currentOrLeftRightCurrentIsLarger = Math.max(tree.value, left + right + tree.value);
        //int larger = Math.max(leftBranchOrRightBranchIsLarger, currentOrLeftRightCurrentIsLarger);

        int leftBranchAndCurrentOrRightBranchAndCurrentIsLarger = Math.max(left + tree.value, right + tree.value);
        int larger2 = Math.max(currentOrLeftRightCurrentIsLarger, leftBranchAndCurrentOrRightBranchAndCurrentIsLarger);

        max = Math.max(max, larger2);

        return Math.max(leftBranchOrRightBranchIsLarger + tree.value, tree.value);
    }



    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }


}
