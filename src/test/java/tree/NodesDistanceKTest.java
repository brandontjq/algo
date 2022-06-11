package tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NodesDistanceKTest {

    @Test
    void test() {
        NodesDistanceK n1 = new NodesDistanceK();
        NodesDistanceK.BinaryTree t1 = new NodesDistanceK.BinaryTree(1);
        NodesDistanceK.BinaryTree t2 = new NodesDistanceK.BinaryTree(2);
        NodesDistanceK.BinaryTree t3 = new NodesDistanceK.BinaryTree(3);
        NodesDistanceK.BinaryTree t4 = new NodesDistanceK.BinaryTree(4);
        NodesDistanceK.BinaryTree t5 = new NodesDistanceK.BinaryTree(5);
        NodesDistanceK.BinaryTree t6 = new NodesDistanceK.BinaryTree(6);
        NodesDistanceK.BinaryTree t7 = new NodesDistanceK.BinaryTree(7);
        NodesDistanceK.BinaryTree t8 = new NodesDistanceK.BinaryTree(8);

        t1.left = t2;
        t1.right = t3;

        t2.left = t4;
        t2.right = t5;

        t3.right = t6;

        t6.left = t7;
        t6.right = t8;

        List<Integer> result = n1.findNodesDistanceK(t1, 3, 2);
        System.out.println(result);
    }

    @Test
    void anotherTest() {
        NodesDistanceK n1 = new NodesDistanceK();
        NodesDistanceK.BinaryTree t1 = new NodesDistanceK.BinaryTree(1);
        NodesDistanceK.BinaryTree t2 = new NodesDistanceK.BinaryTree(2);
        NodesDistanceK.BinaryTree t3 = new NodesDistanceK.BinaryTree(3);
        NodesDistanceK.BinaryTree t4 = new NodesDistanceK.BinaryTree(4);
        NodesDistanceK.BinaryTree t5 = new NodesDistanceK.BinaryTree(5);

        t1.left = t2;
        t2.left = t3;
        t3.left = t4;
        t4.left = t5;

        List<Integer> result = n1.findNodesDistanceK(t1, 2, 3);
        System.out.println(result);
    }
}