package com.linkedlist.programs;

public class SortedLLIntersection {
	
	static ListNode result= null;
	static ListNode tail= null;

	public static void main(String[] args) {

		CreateLL ll = new CreateLL();
		ListNode head1=ll.addToLL(new int[]{1,2,4,6,8});
		
		ListNode head2=ll.addToLL(new int[]{2,4,6});
		
		if(head1 == null || head2 == null) {System.out.print(null+"");};		
		interSection(head1, head2);
		ll.printList(result);
	}

	private static void interSection(ListNode head1, ListNode head2) {
		
		while(head1 != null && head2 != null) {
			if(head1.val == head2.val) {
				ListNode n= new ListNode(head1.val);
				head1= head1.next;
				head2= head2.next;
				createLL(n);
			} else if(head1.val > head2.val){
				head2= head2.next;
			} else if(head1.val < head2.val) {
				head1= head1.next;
			}
		}
		
	}
	
	static void createLL(ListNode node){
		if(result == null) {
			result= node;
			tail= node;
		}else {
			tail.next=node;
			tail= node;
		}
	}
	

}
