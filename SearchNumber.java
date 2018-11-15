package com.rashmi.ds;
import java.util.*;
public class SearchNumber {

	public static void main(String[] args) {
		Scanner search= new Scanner(System.in);
		int number[]= new int[15];
		
		System.out.println("Enter the Array");
		for(int i=0;i<15;i++)
		{
			number[i]=search.nextInt();
		}
		
		System.out.println("Enter the key");
		int key=search.nextInt();
		System.out.println("key is="+key);
		
		for(int i=0;i<15;i++)
		{
			if(number[i]==key)
			{
				System.out.println("key found");
				break;
			}
			else
			{
				System.out.println("key not found");
				break;
			}
			
		}

	}

}
