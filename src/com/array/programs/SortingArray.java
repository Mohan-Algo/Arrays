package com.array.programs;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortingArray {
	public static void sortArray(int[] arr) {
        Map<Integer, Integer> freqMap= new TreeMap<>();
        
        for(int ele: arr) {
        	int counter=freqMap.getOrDefault(ele, 0)+1;
        	freqMap.put(ele, counter);
        }
        int index=0;
        
        for(Entry<Integer, Integer> entry: freqMap.entrySet()) {
        	int tempCounter=0 ;
        	while(tempCounter < entry.getValue()) {
        		arr[index]= entry.getKey();
        		index++;
        		tempCounter++;
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
