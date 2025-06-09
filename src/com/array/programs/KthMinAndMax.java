package com.array.programs;

public class KthMinAndMax {

	public static void main(String[] args) {
		//int arr[] = {7, 10, 4, 3, 20, 15};
		int arr[]= {2, 3, 1, 20, 15};
		int k = 4;
		if(arr.length<k) {System.out.println("K value should be less than arr length"); System.exit(0);}
		sortArray(arr);
		
		System.out.println(":::::::::::Kth Min element:::::::::"+arr[k-1]);
		System.out.println(":::::::::::Kth Max element:::::::::"+arr[(arr.length-1)-(k-1)]);
		

	}

	private static void sortArray(int[] arr) {
		int arrLength= arr.length;
		for(int i=0; i< arrLength-1; i++) {
			for(int j=i+1; j<arrLength; j++) {
				if(arr[i]> arr[j]) {
					int temp= arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		
	}

}
