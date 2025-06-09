package com.array.programs;

public class NegativeAndPositive {

	public static void main(String[] args) {
		int[] arr= {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		
		
		for(int i=0, j=0; i< arr.length; i++ ) {
			if (arr[i] < 0) {
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
		}

		for (int num : arr) {
            System.out.print(num + " ");
        }
	}

}
