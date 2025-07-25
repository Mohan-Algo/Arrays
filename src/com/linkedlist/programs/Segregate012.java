package com.linkedlist.programs;
class Segregate012 {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to sort 0s, 1s and 2s
    public static void sortList(Node head) {
        int count[] = {0, 0, 0}; // For 0s, 1s and 2s

        Node ptr = head;
        // Count the number of 0s, 1s and 2s
        while (ptr != null) {
            count[ptr.data]++;
            ptr = ptr.next;
        }

        int i = 0;
        ptr = head;

        // Update the list with 0s, then 1s, then 2s
        while (ptr != null) {
            if (count[i] == 0) {
                i++;
            } else {
                ptr.data = i;
                count[i]--;
                ptr = ptr.next;
            }
        }
    }

    // Function to print the list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + (head.next != null ? " → " : ""));
            head = head.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Example input: 1 → 2 → 2 → 1 → 2 → 0 → 2 → 2
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next = new Node(2);

        System.out.print("Original List: ");
        printList(head);

        sortList(head);

        System.out.print("Sorted List:   ");
        printList(head);
    }
}
