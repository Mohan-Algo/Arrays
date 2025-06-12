package com.array.programs;

import java.util.ArrayList;
import java.util.List;

public class ReArrange {

	public static void main(String[] args) {

		//int[] arr = new int[] { 1, 2, 3, -4, -1, 4 };
		int[] arr= new int[] { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8};

		List<Integer> posList = new ArrayList<>();
		List<Integer> negList = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				posList.add(arr[i]);
			} else {
				negList.add(arr[i]);
			}
		}
		
		int i = 0, p = 0, q = 0;
        while (p < posList.size() && q < negList.size()) {
            if (i % 2 == 0) {
                arr[i++] = posList.get(p++);
            } else {
                arr[i++] = negList.get(q++);
            }
        }
		
        while (p < posList.size()) {
            arr[i++] = posList.get(p++);
        }
        
        while (q < negList.size()) {
            arr[i++] = negList.get(q++);
        }

        for(int ele: arr) {
        	System.out.print(ele +" ");
        }
	}

}
