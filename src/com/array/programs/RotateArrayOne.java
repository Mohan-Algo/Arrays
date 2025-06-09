package com.array.programs;

public class RotateArrayOne {

	public static void main(String[] args) {

		int arr[] = {1, 2, 3, 4, 5};
		int len= arr.length-1;
		int temp=arr[len];
		for(int i=len; i>0; i--) {
			arr[i]=arr[i-1];
		}
		arr[0]= temp;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
