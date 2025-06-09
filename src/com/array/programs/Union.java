package com.array.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Union {

	public static void main(String[] args) {

		int a[] = {1, 2, 1, 1, 2};//{85, 25, 1, 32, 54, 6};//{1, 2, 3, 4, 5};
		int b[] = {2, 2, 1, 2, 1};//{85, 2};//{1, 2, 3};
		
		int aLen= a.length-1;
		int bLen= b.length-1;
		
		if(aLen> bLen) {
			merge(a, b, aLen, bLen);
		}else {
			merge(b, a, bLen, aLen);
		}
		

	}

	private static void merge(int[] x, int[] y, int len1, int len2) {
		Set<Integer> set= new HashSet<>();
		
		for(int i=0; i<=len1; i++) {
			set.add(x[i]);
			if(i<=len2) {
				set.add(y[i]);
			}
		}
		
		System.out.println("::::Union::::"+set.size());
	}

}
