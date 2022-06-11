package tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxPathSumTest {

    @Test
    void test() {

        MaxPathSum.BinaryTree t1 = new MaxPathSum.BinaryTree(1);
        MaxPathSum.BinaryTree t2 = new MaxPathSum.BinaryTree(2);
        MaxPathSum.BinaryTree t3 = new MaxPathSum.BinaryTree(3);
        MaxPathSum.BinaryTree t4 = new MaxPathSum.BinaryTree(4);
        MaxPathSum.BinaryTree t5 = new MaxPathSum.BinaryTree(5);
        MaxPathSum.BinaryTree t6 = new MaxPathSum.BinaryTree(6);
        MaxPathSum.BinaryTree t7 = new MaxPathSum.BinaryTree(7);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;

        var result = MaxPathSum.maxPathSum(t1);
        System.out.println(MaxPathSum.max);

    }

    @Test
    void test2() {
        MaxPathSum.BinaryTree t1 = new MaxPathSum.BinaryTree(1);
        MaxPathSum.BinaryTree t2 = new MaxPathSum.BinaryTree(2);
        MaxPathSum.BinaryTree t3 = new MaxPathSum.BinaryTree(3);

        t1.left = t2;
        t1.right = t3;

        var result = MaxPathSum.maxPathSum(t1);
        System.out.println(result);
    }

    @Test
    void test3(){
        MaxPathSum.BinaryTree t1 = new MaxPathSum.BinaryTree(1);
        MaxPathSum.BinaryTree tMinus1 = new MaxPathSum.BinaryTree(-1);
        MaxPathSum.BinaryTree t2 = new MaxPathSum.BinaryTree(2);

        t1.left = t2;
        t1.right = tMinus1;

        var result = MaxPathSum.maxPathSum(t1);
        System.out.println(result);
    }

    @Test
    void test4(){
        MaxPathSum.BinaryTree tMinus2 = new MaxPathSum.BinaryTree(-2);

        var result = MaxPathSum.maxPathSum(tMinus2);
        System.out.println(result);
    }

}