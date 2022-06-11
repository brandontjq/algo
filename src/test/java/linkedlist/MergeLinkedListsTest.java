package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeLinkedListsTest {

    @Test
    void test() {
        MergeLinkedLists.LinkedList l2 = new MergeLinkedLists.LinkedList(2);
        MergeLinkedLists.LinkedList l6 = new MergeLinkedLists.LinkedList(6);
        MergeLinkedLists.LinkedList l7 = new MergeLinkedLists.LinkedList(7);
        MergeLinkedLists.LinkedList l8 = new MergeLinkedLists.LinkedList(8);

        l2.next = l6;
        l6.next = l7;
        l7.next = l8;

        MergeLinkedLists.LinkedList l1 = new MergeLinkedLists.LinkedList(1);
        MergeLinkedLists.LinkedList l3 = new MergeLinkedLists.LinkedList(3);
        MergeLinkedLists.LinkedList l4 = new MergeLinkedLists.LinkedList(4);
        MergeLinkedLists.LinkedList l5 = new MergeLinkedLists.LinkedList(5);
        MergeLinkedLists.LinkedList l9 = new MergeLinkedLists.LinkedList(9);
        MergeLinkedLists.LinkedList l10 = new MergeLinkedLists.LinkedList(10);

        l1.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l9;
        l9.next = l10;

        var result = MergeLinkedLists.mergeLinkedLists(l2, l1);
        System.out.println(result);

    }

}