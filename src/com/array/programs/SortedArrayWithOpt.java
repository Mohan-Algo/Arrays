package com.array.programs;

public class SortedArrayWithOpt {
	    public static void sortArray(int[] arr) {
	        // Step 1: Find the maximum value in the array
	        int max = Integer.MIN_VALUE;
	        for (int num : arr) {
	            max = Math.max(max, num);
	        }

	        // Step 2: Count frequencies
	        int[] count = new int[max + 1];
	        for (int num : arr) {
	            count[num]++;
	        }

	        // Step 3: Write back to array in sorted order
	        int index = 0;
	        for (int i = 0; i < count.length; i++) {
	            while (count[i]-- > 0) {
	                arr[index++] = i;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {0, 1, 2, 0, 1};
	        sortArray(arr);

	        System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}
