package com.array.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateElement {

	public static void main(String[] args) {

		Map<Integer, Integer> freqMap= new HashMap<>();
		int[] nums= {3,1,3,4,2};
        for(int num: nums){
            int counter= freqMap.getOrDefault(num, 0)+1;
            freqMap.put(num, counter);
        }
        int highFreq= Integer.MIN_VALUE;
        int mostFreq=-1;
        for(Entry<Integer, Integer> entry: freqMap.entrySet()){
            if(highFreq<entry.getValue()){
                highFreq=entry.getValue();
                mostFreq=entry.getKey();
            }
        }
        System.out.print(mostFreq);

	}

}
