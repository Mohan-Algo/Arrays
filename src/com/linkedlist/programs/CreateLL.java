package com.linkedlist.programs;

public class CreateLL {

	public ListNode addToLL(int[] arr) {
		ListNode head= null;
		ListNode tail= null;
		
		for( int ele: arr) {
			ListNode node= new ListNode(ele);
			if(head == null) {
				head= node;
				tail= node;
			}else {
				tail.next=node;
				tail= node;
			}
			
		}
		return head;
	}
	
	public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

}
