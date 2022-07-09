package linkedlist;

public class ShiftLinkedList {
    public static LinkedList shiftLinkedList(LinkedList head, int k) {
        // Write your code here.
        LinkedList current = head;
        int length = 0;
        while (current != null) {
            current = current.next;
            length++;
        }
        int offSet = Math.abs(k) % length;
        int timesToMove = k > 0 ? length - offSet : offSet;
        if(timesToMove == 0) return head;
        current = head;
        LinkedList prev = null;
        while(timesToMove > 0) {
            prev = current;
            current = current.next;
            timesToMove--;
        }

        if(prev == null) {
            return head;
        }
        prev.next = null;
        LinkedList newHead = current;
        while(current.next != null) {
            current = current.next;
        }
        current.next = head;

        return newHead;
    }

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            next = null;
        }
    }
}
