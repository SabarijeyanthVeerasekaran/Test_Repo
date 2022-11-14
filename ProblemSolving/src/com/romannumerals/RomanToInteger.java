package com.romannumerals;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		
		int result =convertRoman("III");
		System.out.println("Result is "+result);
	}

	public static int convertRoman(String numerals)
	{
		
		HashMap<String,Integer> romantoint=new HashMap<String,Integer>();
		romantoint.put("I",1 );
		romantoint.put("V",5 );
		romantoint.put("X",10 );
		romantoint.put("L",50 );
		romantoint.put("C",100);
		romantoint.put("D",500 );
		romantoint.put("M",1000 );
		romantoint.put("XL",40 );
		romantoint.put("XC",90 );
		romantoint.put("CD",500 );
		romantoint.put("CM",900 );
		romantoint.put("IV",4 );
		romantoint.put("IX",9 );
		
		int sum=0;
		String s="";
		for(int i=0;i<numerals.length();i++)
		{
			if( i < numerals.length()-2 && numerals.charAt(i)=='X' || numerals.charAt(i)=='C'||  numerals.charAt(i)=='I'  ) 
			{
				s=numerals.substring(i,i+2);
				System.out.println("Substring "+s);
				if(romantoint.containsKey(s)) {
					System.out.println("romantoint.get(s) "+romantoint.get(s));
					sum=sum+romantoint.get(s);
					continue;
				}
				
			}
			
			String s1=numerals.substring(i,i+1);
			
			sum=sum+(romantoint.get(s1));
			
		}
		
		
		return sum;
		
	}
}
