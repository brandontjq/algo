package tree;

import org.junit.jupiter.api.Test;


class DiameterTreeTest {

    @Test
    void test() {
        DiameterTree.BinaryTree t1 = new DiameterTree.BinaryTree(1);
        DiameterTree.BinaryTree t3 = new DiameterTree.BinaryTree(3);
        DiameterTree.BinaryTree t7 = new DiameterTree.BinaryTree(7);
        DiameterTree.BinaryTree t8 = new DiameterTree.BinaryTree(8);
        DiameterTree.BinaryTree t9 = new DiameterTree.BinaryTree(9);
        DiameterTree.BinaryTree t4 = new DiameterTree.BinaryTree(4);
        DiameterTree.BinaryTree t5 = new DiameterTree.BinaryTree(5);
        DiameterTree.BinaryTree t6 = new DiameterTree.BinaryTree(6);
        DiameterTree.BinaryTree t2 = new DiameterTree.BinaryTree(2);

        t1.left = t3;
        t3.left = t7;
        t7.left = t8;
        t8.left = t9;

        t3.right = t4;
        t4.right = t5;
        t5.right = t6;
        t1.right = t2;

        DiameterTree d1 = new DiameterTree();
        System.out.println(d1.binaryTreeDiameter(t1));
    }

}