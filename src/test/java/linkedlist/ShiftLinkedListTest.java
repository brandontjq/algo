package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShiftLinkedListTest {
    @Test
    void test() {
        ShiftLinkedList.LinkedList l0 = new ShiftLinkedList.LinkedList(0);
        ShiftLinkedList.LinkedList l1 = new ShiftLinkedList.LinkedList(1);
        ShiftLinkedList.LinkedList l2 = new ShiftLinkedList.LinkedList(2);
        ShiftLinkedList.LinkedList l3 = new ShiftLinkedList.LinkedList(3);
        ShiftLinkedList.LinkedList l4 = new ShiftLinkedList.LinkedList(4);
        ShiftLinkedList.LinkedList l5 = new ShiftLinkedList.LinkedList(5);

        l0.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;

        var result = ShiftLinkedList.shiftLinkedList(l0, 2);
        System.out.println(result);


    }



}