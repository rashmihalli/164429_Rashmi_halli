package com.rashmi.ds;
import java.util.*;
public class DeclareResults {

	public static void main(String[] args) {
		Scanner mark= new Scanner(System.in); 
		int marks1= mark.nextInt();
		int marks2= mark.nextInt();
		int marks3= mark.nextInt();
		
		System.out.println("marks of subject 1="+marks1);
		System.out.println("marks of subject 2="+marks2);
		System.out.println("marks of subject 3="+marks3);
		
		if(marks1>60 && marks2>60 && marks3>60)
		{
			System.out.println("passed");
		}
		else if((marks1>60 && marks2>60) || (marks2>60 && marks3>60) || (marks1>60 && marks3>60))
		{
			System.out.println("Promoted");
		}
		else
		{
			System.out.println("Fail");
		}
			

	}

}
