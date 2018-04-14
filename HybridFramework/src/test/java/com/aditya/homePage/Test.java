package com.aditya.homePage;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) 
	{
		String s = "AABC32DE4P%@23Pu";
		String num =s.replaceAll("[^0-9]","");
		int sum = 0;
		for(char c:num.toCharArray())
		{
			sum=sum+ c -'0';
		}
		System.out.println(sum);
		
		int summ=0;
		char[] arr = s.toCharArray();
		for(char c:arr)
		{
			if(Character.isDigit(c))
			{
				summ=summ+ c -'0';
			}
		}
		System.err.println(sum);
	}

}
