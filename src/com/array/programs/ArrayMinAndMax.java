package com.array.programs;

public class ArrayMinAndMax {

	public static void main(String[] args) {
		
		//int[] arr = {3, 5, 4, 1, 9};
		//int[] arr = {22, 14, 8, 17, 35, 3};
		int[] arr= {4, 9, 6, 5, 2, 3};
		
		minAndMax(arr);

	}

	private static void minAndMax(int[] arr) {
		
		int min= Integer.MAX_VALUE;
		int max= Integer.MIN_VALUE;
		
		for(int ele: arr) {
			if(min>ele) {
				min= ele;
			} else if(ele> max){
				max=ele;
			}
		}
		
		System.out.println("::::Min Element::::"+ min);
		System.out.println("::::Max Element::::"+ max);
		
	}

}
