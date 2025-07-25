package com.linkedlist.programs;

public class AddOneToLL {
	
	public static void main(String[] args) {
		CreateLL ll= new CreateLL();
		int[] arr= {2,2,4,5,5,9};
		
		ListNode head= ll.addToLL(arr);
		
		head= addOneToLL(head);
		ll.printList(head);
	}

	private static ListNode addOneToLL(ListNode head) {

		ListNode current= head;
		int num = 0;
		while(current != null) {
			
			num = num* 10 + current.val;
			current= current.next;
		}
		num = num + 1;
		ListNode head1= null;
		ListNode tail= null;
		while(num > 0) {
			
			int digit= num % 10;
			num = num / 10;
			
			ListNode node= new ListNode(digit);
			if(head1 == null) {
				head1= node;
				tail= node;
			}else {
				head1= node;
				head1.next= tail;
				tail = head1;
			}
		}
		return head1;
	}
}