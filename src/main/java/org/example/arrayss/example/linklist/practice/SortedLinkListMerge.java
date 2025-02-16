package org.example.arrayss.example.linklist.practice;

/**
 * @author Bibash Bogati
 * @created 2025-02-13
 */
public class SortedLinkListMerge {


    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(2);
        l1.next.next.next = new ListNode(3);
        l1.next.next.next.next = new ListNode(4);
        l1.next.next.next.next.next = new ListNode(5);

        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(2);
        l2.next.next.next = new ListNode(3);
        l2.next.next.next.next = new ListNode(4);
        l2.next.next.next.next.next = new ListNode(5);

        // merge 2  list
        ListNode result = mergeLinkList(l1, l2);
    }

    private static ListNode mergeLinkList(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;



        while (l1.next != null && l2.next != null) {

            if(l1.value > l2.value) {

            }



        }



        return dummy.next;
    }
}
