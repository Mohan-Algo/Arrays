package com.linkedlist.programs;

import java.util.HashSet;

public class DeleteDuplicatesUnSortedLL {

	public static void main(String[] args) {
		CreateLL ll= new CreateLL();
		int[] arr= {5, 2, 2, 4};
		
		ListNode head= ll.addToLL(arr);
		
		head= removeDuplicate(head);
		ll.printList(head);

	}

	private static ListNode removeDuplicate(ListNode head) {
		
		 if (head == null) return null;

	        HashSet<Integer> seen = new HashSet<>();
	        ListNode current = head;
	        ListNode prev = null;
	        
	        while(current != null) {
	        	if(seen.contains(current.val)) {
	        		prev.next= current.next;
	        	} else {
	        		seen.add(current.val);
	        		prev= current;
	        	}
	        	current= current.next;
	        }
	        
		
		return head;
	}

}
