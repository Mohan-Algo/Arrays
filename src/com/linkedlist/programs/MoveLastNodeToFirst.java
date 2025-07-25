package com.linkedlist.programs;

public class MoveLastNodeToFirst {

	public static void main(String[] args) {
		CreateLL ll= new CreateLL();
		int[] arr= {2,2,4,5,5,9};
		
		ListNode head= ll.addToLL(arr);
		
		head= moveNodeToFirst(head);
		ll.printList(head);
	}

	private static ListNode moveNodeToFirst(ListNode head) {
		
		ListNode current= head;
		ListNode prev= null;
		
		while(current != null) {
			if(current.next == null) {
				prev.next = null;
				current.next= head;
				break;
			}
			prev= current;
			current= current.next;
		}
		
		
		return current;
	}

}
