package com.linkedlist.programs;

public class AddTwoLL {

	public static void main(String[] args) {
		CreateLL ll= new CreateLL();
		int[] arr= {4, 5};
		int[] arr1= {3, 4, 5};
		
		ListNode head1= ll.addToLL(arr);
		ListNode head2= ll.addToLL(arr1);
		
		int num1= convertLLToNum(head1);
		int num2= convertLLToNum(head2);
		int result= num1 + num2;
		
		ListNode head =  convertNumToLL(result);
		ll.printList(head);
	}

	private static ListNode convertNumToLL(int num) {
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

	private static int convertLLToNum(ListNode current) {
		int num = 0;
		while(current != null) {
			
			num = num* 10 + current.val;
			current= current.next;
		}
		return num;
	}

}
