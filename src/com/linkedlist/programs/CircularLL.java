package com.linkedlist.programs;

public class CircularLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateLL ll = new CreateLL();
		ListNode head1=ll.addToLL(new int[]{2, 4, 6, 7, 5});
		head1.next.next.next.next.next= head1;
		
		boolean isCycle= validateCyclicLL(head1);
		System.out.println(isCycle);
	}

	private static boolean validateCyclicLL(ListNode head) {

		ListNode slow= head;
		ListNode fast= head.next;
		
		while(fast != null && fast.next != null) {
			
			if(slow == fast) {
				return true;
			} 
			slow= slow.next;
			fast= fast.next.next;
		}
		
		return false;
	}

}
