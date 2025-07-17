package com.linkedlist.programs;

public class DeleteDuplicateSortedLL {

	public static void main(String[] args) {
		
		CreateLL ll= new CreateLL();
		int[] arr= {2,2,4,5,5,9};
		
		ListNode head= ll.addToLL(arr);
		
		head= removeDuplicate(head);
		ll.printList(head);

	}

	private static ListNode removeDuplicate(ListNode head) {
		
		ListNode current= head;
		
		while(current !=null && current.next != null) {
			ListNode nextNode= current.next;
			
			if(nextNode.val == current.val) {
				current.next= nextNode.next;
			}
			
			current= nextNode;
		}
		
		return head;
	}

}
