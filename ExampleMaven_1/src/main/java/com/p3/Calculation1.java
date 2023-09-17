package com.p3;

import java.util.StringTokenizer;

public class Calculation1 {
	public static int cube(int n) {
		return n*n*n;
	}
	public static String reverseWord(String str) {
		StringBuilder result=new StringBuilder();
		StringTokenizer tokenizer=new StringTokenizer(str, " ");
		
		while(tokenizer.hasMoreTokens()) {
			StringBuilder sb= new StringBuilder();
			sb.append(tokenizer.nextToken());
			sb.reverse();
			
			result.append(sb);
			result.append(" ");
		}return result.toString();
	}
}
