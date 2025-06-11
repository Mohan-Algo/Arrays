package com.array.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoPairSumZero {

	public static void main(String[] args) {

		int[] arr = { -1, 0, 1, 2, -1, -4 };
		Map<Integer, Integer> map = new HashMap<>();
		Map<Integer, List<Integer>> resultMap= new HashMap<>();
		for (int num : arr) {
			int complement = - num;
			
			if((map.containsKey(complement) || map.containsKey(num)) && 
					(!resultMap.containsKey(complement) && !resultMap.containsKey(num))) {
				List<Integer> list= new ArrayList<>();
				list.add(num);list.add(complement);
				resultMap.put(complement,list);
			}
			map.put(complement, num);
		}
		System.out.println(resultMap.values());
	}

}
