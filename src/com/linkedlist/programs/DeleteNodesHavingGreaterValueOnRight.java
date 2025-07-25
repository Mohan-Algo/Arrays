package com.linkedlist.programs;

public class DeleteNodesHavingGreaterValueOnRight {

	public static void main(String[] args) {
		int[] arr = { 12, 15, 10, 11, 5, 6, 2, 3, 1, 4 };
		CreateLL cll = new CreateLL();
		ListNode head = cll.addToLL(arr);

		head = deleteRightNode(head);
		cll.printList(head);

		int[] arr1 = { 10, 20, 30, 40, 50, 60 };
		ListNode head1 = cll.addToLL(arr1);

		head1 = deleteRightNode(head1);
		cll.printList(head1);
	}
	

	private static ListNode deleteRightNode(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode prev = dummy;
		ListNode curr = head;

		while (curr != null && curr.next != null) {
			if (curr.val < curr.next.val) {
				// Remove current node
				prev.next = curr.next;
				curr = prev.next; 
			} else {
				prev = curr;
				curr = curr.next;
			}
		}

		return dummy.next;
	}

}
