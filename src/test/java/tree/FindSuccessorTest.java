package tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSuccessorTest {

    @Test
    void bruteForceTest() {
        FindSuccessor.BinaryTree t1 = new FindSuccessor.BinaryTree(1);
        FindSuccessor.BinaryTree t2 = new FindSuccessor.BinaryTree(2);
        FindSuccessor.BinaryTree t3 = new FindSuccessor.BinaryTree(3);
        FindSuccessor.BinaryTree t4 = new FindSuccessor.BinaryTree(4);
        FindSuccessor.BinaryTree t5 = new FindSuccessor.BinaryTree(5);
        FindSuccessor.BinaryTree t6 = new FindSuccessor.BinaryTree(6);

        t1.left = t2;
        t1.right = t3;
        t3.parent = t1;
        t2.left = t4;
        t2.right = t5;
        t2.parent = t1;
        t4.left = t6;
        t4.parent = t2;
        t5.parent = t2;
        t6.parent = t4;
        FindSuccessor f = new FindSuccessor();

        var result = f.findSuccessor(t1, t3);
        System.out.println(result);
    }

}