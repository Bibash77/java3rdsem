package org.example.arrayss.example.linklist.practice;

/**
 * @author Bibash Bogati
 * @created 2025-02-13
 */
public class RemoveKFromList {





    public static void main(String[] args) {
        // Example List: 3 -> 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(3);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);

        int k = 3;

        // Remove k from list
        ListNode result = removeKFromList(head, k);

        // Print the updated list
        while (result != null) {
            System.out.print(result.value + " ");
            result = result.next;
        }
    }

    private static ListNode removeKFromList(ListNode head, int k) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Start with the dummy node
        ListNode current = dummy;




// start with next node
        while ( current.next != null) {

            // if next node value is k we need to skip that so we will link current next with next of next element
            if(current.next.value == k) {
                current.next =   current.next.next;
            } else {
                // else go to next element
                current = current.next;
            }


        }

        // return current head since we started current as dummy value
        return current.next;


    }
}
