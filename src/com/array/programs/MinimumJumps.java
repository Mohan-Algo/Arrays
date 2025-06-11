package com.array.programs;
public class MinimumJumps {

    public static int minJumps(int[] arr) {
        int n = arr.length;

        // Edge case: if first element is 0 or array size is 0/1
        if (n <= 1) return 0;
        if (arr[0] == 0) return -1;

        int maxReach = arr[0];  // The farthest index we can reach
        int steps = arr[0];     // Steps left in current jump
        int jumps = 1;          // We need at least one jump to start

        for (int i = 1; i < n; i++) {
            // If we reach the end of the array
            if (i == n - 1) return jumps;

            // Update maxReach
            maxReach = Math.max(maxReach, i + arr[i]);

            // Use a step to move to index i
            steps--;

            // If no more steps left
            if (steps == 0) {
                jumps++;  // we must jump

                // Check if current position is beyond or equal to maxReach
                if (i >= maxReach) return -1;

                // Re-initialize steps for the new jump
                steps = maxReach - i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int[] arr2 = {1, 4, 3, 2, 6, 7};
        int[] arr3 = {0, 10, 20};

        System.out.println(minJumps(arr1));  // Output: 3
        System.out.println(minJumps(arr2));  // Output: 2
        System.out.println(minJumps(arr3));  // Output: -1
    }
}
