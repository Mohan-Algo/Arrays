package com.linkedlist.programs;
class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SplitCircularLinkedList {
    // Function to split a circular linked list into two circular linked lists
    public static void splitCircularList(Node head, Node[] result) {
        if (head == null) {
            result[0] = null;
            result[1] = null;
            return;
        }
        
        // Find the middle node using slow and fast pointers
        Node slow = head;
        Node fast = head;
        Node prev = null;
        
        // For odd number of nodes, slow will point to the middle node
        // For even number of nodes, slow will point to the end of first half
        while (fast.next != head && fast.next.next != head) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // If even number of nodes, move slow one step further
        if (fast.next.next == head) {
            prev = slow;
            slow = slow.next;
        }
        
        // Store heads of both lists
        result[0] = head;  // First list head
        result[1] = slow;  // Second list head
        
        // Make second list circular
        fast.next = slow;
        
        // Make first list circular
        if (prev != null) {
            prev.next = head;
        }
    }
    
    // Utility function to print circular linked list
    public static void printCircularList(Node head) {
        if (head == null) return;
        
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
    
    // Main method to test the implementation
    public static void main(String[] args) {
        // Create a sample circular linked list: 1->2->3->4->5
        Node head = new Node(10);
        head.next = new Node(4);
        head.next.next = new Node(9);
        head.next.next.next = new Node(10);
        //head.next.next.next.next = new Node(5);
        //head.next.next.next.next.next = head;  // Make it circular
        
        System.out.println("Original Circular Linked List:");
        printCircularList(head);
        
        // Array to store heads of two resulting lists
        Node[] result = new Node[2];
        
        // Split the list
        splitCircularList(head, result);
        
        System.out.println("First Circular Linked List:");
        printCircularList(result[0]);
        
        System.out.println("Second Circular Linked List:");
        printCircularList(result[1]);
    }
}