package com.array.programs;

public class CommonElementsInThreeSortedArrays {

    public static void printCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
       // int lastPrinted = Integer.MIN_VALUE; // For avoiding duplicates
        boolean found = false;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            // Skip duplicates in arr1
            while (i > 0 && i < arr1.length && arr1[i] == arr1[i - 1]) i++;
            // Skip duplicates in arr2
            while (j > 0 && j < arr2.length && arr2[j] == arr2[j - 1]) j++;
            // Skip duplicates in arr3
            while (k > 0 && k < arr3.length && arr3[k] == arr3[k - 1]) k++;

            if (i < arr1.length && j < arr2.length && k < arr3.length) {
                if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                   // if (arr1[i] != lastPrinted) {
                        System.out.print(arr1[i] + " ");
                        //lastPrinted = arr1[i];
                        found = true;
                    //}
                    i++;
                    j++;
                    k++;
                } else 
                if (arr1[i] < arr2[j]) {
                    i++;
                } else if (arr2[j] < arr3[k]) {
                    j++;
                } else {
                    k++;
                }
            }
        }

        if (!found) {
            System.out.print("-1");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};
        printCommonElements(arr1, arr2, arr3); // Output: 20 80

        System.out.println();

        int[] arr4 = {1, 1, 1, 2, 2, 2};
        int[] arr5 = {1, 1, 2, 2, 2};
        int[] arr6 = {1, 1, 1, 1, 2, 2, 2, 2};
        printCommonElements(arr4, arr5, arr6); // Output: 1 2

        System.out.println();

        int[] arr7 = {1, 2, 3, 4, 5};
        int[] arr8 = {6, 7};
        int[] arr9 = {8, 9, 10};
        printCommonElements(arr7, arr8, arr9); // Output: -1
    }
}
