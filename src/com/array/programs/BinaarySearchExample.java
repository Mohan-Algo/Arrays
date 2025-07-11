package com.array.programs;

public class BinaarySearchExample {

	public static void main(String[] args) {

		int[] arr= {1, 3, 5, 7, 13};
		int target= 13;
		
		System.out.println(searchTarget(arr, target, 0, arr.length-1));
	}

	private static int searchTarget(int[] arr, int target, int start, int end) {
		
		if(start<= end) {
			int mid= (start+end)/2;
			
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid]> target) {
				return searchTarget(arr, target, start, mid-1);
			} else if(arr[mid]<target) {
				return searchTarget(arr, target, mid+1, end);
			}
		}
		
		return -1;
	}

}
