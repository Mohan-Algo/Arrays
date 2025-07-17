package com.linkedlist.programs;

public class ReverseLikedList {

	public static void main(String[] args) {

		 // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
		
		int[] arr= {1,2,3,4,5};
		CreateLL cll=new CreateLL();
		ListNode head= cll.addToLL(arr);
		
		printList(reverseLL(head));
		head= cll.addToLL(arr);
		printList(reverseRecursiveLL(head, null));
	}
	
	

	public static ListNode reverseRecursiveLL(ListNode current, ListNode prev) {
	    if (current == null) return prev;

	    ListNode next = current.next;
	    current.next = prev;
	    return reverseRecursiveLL(next, current);
	}

	private static ListNode reverseLL(ListNode head) {
		
		 	ListNode prev = null;       // Previous will point to the previous node
	        ListNode current = head;    // Current node we're visiting

	        while (current != null) {
	            ListNode nextNode = current.next; // Save the next node
	            current.next = prev;              // Reverse the link
	            prev = current;                   // Move prev forward
	            current = nextNode;               // Move current forward
	        }
	        
	       return prev;
		
	}


	public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

}
