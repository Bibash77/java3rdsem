package org.example.arrayss.example.linklist.practice;

import java.util.Stack;

public class LinkedListPalindrome {
    
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Declare the linked list
        ListNode head = new ListNode(1); 
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        // Check if the linked list is a palindrome
        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;  // A list with 0 or 1 element is trivially a palindrome
        }

        // Step 1: Use slow and fast pointers to find the middle of the list
        ListNode slow = head;
        ListNode fast = head;

        Stack<ListNode> stack = new Stack<>();

        // Your code here: Move the slow pointer one step at a time, and the fast pointer two steps at a time.
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Push the first half of the list onto a stack
        ListNode currentNode = head;
        while (currentNode != slow) {
            stack.push(currentNode);
            currentNode = currentNode.next;
        }
        // Your code here: Push the first half of the list into a stack using slow pointer

        // Step 3: Compare the second half of the list with the values in the stack
        if(fast != null) {
            slow = slow.next;
        }
        // Your code here: Compare each node from the second half with the stack values popped out

        // Return the final result
        while (slow != null) {
            if(slow.val != stack.pop().val) {
                return false;
            }
            slow = slow.next;
        }
        return true;
        // Your code here: Return true if the list is a palindrome, otherwise false
    }
}
