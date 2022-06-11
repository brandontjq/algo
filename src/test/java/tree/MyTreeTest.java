package tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTreeTest {

    @Test
    void getHeightTest() {
        MyTree.BinaryTree t1 = new MyTree.BinaryTree(1);
        MyTree.BinaryTree t2 = new MyTree.BinaryTree(2);
        MyTree.BinaryTree t3 = new MyTree.BinaryTree(3);
        MyTree.BinaryTree t4 = new MyTree.BinaryTree(4);
        MyTree.BinaryTree t5 = new MyTree.BinaryTree(5);
        MyTree.BinaryTree t6 = new MyTree.BinaryTree(6);
        MyTree.BinaryTree t7 = new MyTree.BinaryTree(7);
        MyTree.BinaryTree t8 = new MyTree.BinaryTree(8);

        t1.left = t2;
        t2.left = t3;
        t3.left = t4;
        t3.right = t5;

        t1.right = t6;
        t6.left = t7;
        t6.right = t8;

        MyTree myTree = new MyTree();

        var result = myTree.getHeight(t1);
        assertEquals(4, result);

    }

    @Test
    void testRunningBranchSum() {
        MyTree.BinaryTree t1 = new MyTree.BinaryTree(1);
        MyTree.BinaryTree t2 = new MyTree.BinaryTree(2);
        MyTree.BinaryTree t3 = new MyTree.BinaryTree(3);
        MyTree.BinaryTree t4 = new MyTree.BinaryTree(4);
        MyTree.BinaryTree t5 = new MyTree.BinaryTree(5);
        MyTree.BinaryTree t6 = new MyTree.BinaryTree(6);
        MyTree.BinaryTree t7 = new MyTree.BinaryTree(7);
        MyTree.BinaryTree t8 = new MyTree.BinaryTree(8);

        t1.left = t2;
        t2.left = t3;
        t3.left = t4;
        t3.right = t5;

        t1.right = t6;
        t6.left = t7;
        t6.right = t8;

        MyTree myTree = new MyTree();

        var result = myTree.getSumOfBranches(t1);
        System.out.println(result);

    }

    @Test
    void testBalancedTree() {
        MyTree.BinaryTree t1 = new MyTree.BinaryTree(1);
        MyTree.BinaryTree t2 = new MyTree.BinaryTree(2);
        MyTree.BinaryTree t3 = new MyTree.BinaryTree(3);
        MyTree.BinaryTree t4 = new MyTree.BinaryTree(4);
        MyTree.BinaryTree t5 = new MyTree.BinaryTree(5);
        MyTree.BinaryTree t6 = new MyTree.BinaryTree(6);
        MyTree.BinaryTree t7 = new MyTree.BinaryTree(7);
        MyTree.BinaryTree t8 = new MyTree.BinaryTree(8);
        MyTree.BinaryTree t9 = new MyTree.BinaryTree(9);
        MyTree.BinaryTree t10 = new MyTree.BinaryTree(10);
        MyTree.BinaryTree t11 = new MyTree.BinaryTree(11);
        MyTree.BinaryTree t12 = new MyTree.BinaryTree(12);

        t1.left = t2;
        t1.right = t3;

        t2.left = t4;
        t2.right = t5;

        t3.left = t6;
        t3.right = t7;

        t4.left = t8;

        t5.left = t12;

        t6.left = t9;
        t6.right = t10;

        t8.left = t11;

        MyTree myTree = new MyTree();

        var result = myTree.balancedTree(t1);
        System.out.println(result);

    }

}