package com.linkedlist.programs;

public class IntersectionStartingPoint {
	
	static ListNode result= null;
	static ListNode tail= null;

	public static void main(String[] args) {
		CreateLL ll = new CreateLL();
		ListNode head1=ll.addToLL(new int[]{4, 1, 8, 4, 5});
		
		ListNode head2=ll.addToLL(new int[]{5, 6, 1, 8, 4, 5});
		
		getIntersectionNode(head1, head2);
		
		//System.out.println();
	}

	public static void getIntersectionNode(ListNode head1, ListNode head2) {
        
        while(head1 != null && head2 != null) {
			if(head1.val == head2.val) {
				ListNode n= new ListNode(head1.val);
				head1= head1.next;
				head2= head2.next;
				createLL(n);
			} else if(head1.val > head2.val){
				result=null;
				tail= null;
				head2= head2.next;
			} else if(head1.val < head2.val) {
				result=null;
				tail= null;
				head1= head1.next;
			}
		}

        if(result != null)
        System.out.println(result.val);
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
