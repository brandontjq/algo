package tree;

import java.util.ArrayList;
import java.util.List;

public class FindSuccessor {

    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        public BinaryTree parent = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    //optimal approach
    public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
        // Write your code here.
       if(node.right != null) {
           return getLeftMostChild(node.right);
       }
       return getRightMostParent(node);
    }

    private BinaryTree getLeftMostChild(BinaryTree node) {
        BinaryTree currentNode = node;
        while(currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode;
    }

    private BinaryTree getRightMostParent(BinaryTree node) {
        BinaryTree currentNode = node;
        while(currentNode.parent != null && currentNode.parent.right == currentNode) {
            currentNode = currentNode.parent;
        }
        return currentNode.parent;
    }

    //non optimal appraoch
//    public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
//        // Write your code here.
//        List<BinaryTree> binaryTrees = new ArrayList<>();
//        solve(binaryTrees, tree);
//        for(int i = 0; i < binaryTrees.size(); i++) {
//            if(i == binaryTrees.size() -1) {
//                return null;
//            }
//            if(binaryTrees.get(i).value == node.value) {
//                return binaryTrees.get(i+1);
//            }
//        }
//        return null;
//    }

    private void solve(List<BinaryTree> binaryTrees, BinaryTree tree) {
        if(tree == null) {
            return;
        }
        solve(binaryTrees, tree.left);
        binaryTrees.add(tree);
        solve(binaryTrees, tree.right);
    }
}
