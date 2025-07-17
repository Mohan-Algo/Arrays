package com.linkedlist.programs;

public class LoopStartNodeLL {

	public static void main(String[] args) {

		
		//CreateLL cll= new CreateLL();
		
		//int[] arr= {1, 3, 2, 4, 5};
		ListNode head= new ListNode(1);
		head.next= new ListNode(3);
		head.next.next= new ListNode(2);
		head.next.next.next= new ListNode(4);
		head.next.next.next.next= new ListNode(5);
		head.next.next.next.next.next= head.next;
		
		loopNode(head);
	}

	private static void loopNode(ListNode head) {
		
		ListNode slow= head;
		ListNode fast= head;
		ListNode startNode= null;
		
		while(fast != null && fast.next != null) {
			slow= slow.next;
			fast= fast.next.next;
			if(slow == fast) {
				slow= head;
				//fast= fast;
				while(slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				startNode= slow;
				break;
			}
		}
		if(startNode != null) {
			System.out.println(startNode.val);
		}else {
			System.out.println(-1);
		}
		
		
	}

}
