package com.array.programs;

public class StringExample {
	
	public static void main(String[] args) {
		String s="this  is 123my World";
		char[] ch= s.toCharArray();
		
		for(int i=0; i< ch.length; i++) {
			if((i == 0 || ch[i-1] == 32) && (ch[i] !=32 && ch[i]<= 'z' && ch[i]>= 'a')) {
				ch[i]= (char) (ch[i]-32);
			}
		}
		
		System.out.println(new String(ch));
		
	}
}
