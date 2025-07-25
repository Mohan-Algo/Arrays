package com.linkedlist.programs;
import java.util.PriorityQueue;

public class MergeKSortedLists {

    // Node definition for singly linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to merge k sorted linked lists
    public static Node mergeKLists(Node[] arr) {
        // Min Heap to store (node.data, node)
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);

        // Step 1: Add head of each list to the priority queue
        for (Node node : arr) {
            if (node != null) {
                pq.add(node);
            }
        }

        // Dummy head to simplify result list creation
        Node dummy = new Node(0);
        Node tail = dummy;

        // Step 2: Extract the minimum node and insert its next into the heap
        while (!pq.isEmpty()) {
            Node min = pq.poll();
            tail.next = min;
            tail = tail.next;

            if (min.next != null) {
                pq.add(min.next);
            }
        }

        return dummy.next;
    }

    // Utility to print a linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    // Utility to create a linked list from array
    public static Node createList(int[] arr) {
        Node dummy = new Node(0);
        Node current = dummy;
        for (int value : arr) {
            current.next = new Node(value);
            current = current.next;
        }
        return dummy.next;
    }

    // Main function to test
    public static void main(String[] args) {
        // Example 1
        Node[] arr1 = new Node[] {
            createList(new int[] {1, 2, 3}),
            createList(new int[] {4, 5}),
            createList(new int[] {5, 6}),
            createList(new int[] {7, 8})
        };
        System.out.println("Merged List 1:");
        printList(mergeKLists(arr1));

        // Example 2
        Node[] arr2 = new Node[] {
            createList(new int[] {1, 3}),
            createList(new int[] {8}),
            createList(new int[] {4, 5, 6})
        };
        System.out.println("Merged List 2:");
        printList(mergeKLists(arr2));
    }
}
