package com.linkedlist.programs;

public class ReverseKElements {

	public static void main(String[] args) {
		CreateLL cll= new CreateLL();
		
		int[] arr= {1, 2, 2, 4, 5, 6, 7, 8};
		int k=4;
		ListNode head= cll.addToLL(arr);
		head=reverseKElementsInLL(head, k);
		
		printList(head);
	}
	
	private static ListNode reverseKElementsInLL(ListNode head, int k) {
		
	 	ListNode prev = null;       // Previous will point to the previous node
        ListNode current = head;    // Current node we're visiting
        int counter= 0;
        ListNode temp= null;
        while (current != null) {
            ListNode nextNode = current.next; // Save the next node
            current.next = prev;              // Reverse the link
            prev = current;                   // Move prev forward
             
            if(counter == 0) {
            	temp=current;
            }
            if(counter == k-1) {
            	temp.next= nextNode;
            	break;
            }
            current = nextNode;   
            counter++;
            
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
