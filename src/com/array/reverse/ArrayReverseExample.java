package com.array.reverse;

public class ArrayReverseExample {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 3, 2, 6, 5 };

		reverseArray(arr);

	}

	private static void reverseArray(int[] arr) {

		for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		for (int num : arr) {
			System.out.println(num);
		}
	}

}
