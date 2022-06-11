package linkedlist;

public class MergeLinkedLists {

    public static class LinkedList {
        int value;
        LinkedList next;

        LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static LinkedList mergeLinkedLists(LinkedList headOne, LinkedList headTwo) {
        // Write your code here.
        LinkedList dummy = new LinkedList(999);
        LinkedList h1 = headOne;
        LinkedList h2 = headTwo;
        LinkedList current = dummy;

        while(h1 != null && h2 != null) {

            if(h1.value <= h2.value) {
                current.next = h1;
                h1 = h1.next;
            } else {
                current.next= h2;
                h2 = h2.next;
            }
            current = current.next;

        }
        if(h1 != null) {
            current.next = h1;
        }
        if(h2 != null) {
            current.next = h2;
        }
        return dummy.next;
    }


}
