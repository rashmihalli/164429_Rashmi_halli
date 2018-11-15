package com.rashmi.ds;
import java.util.*;
public class FindIncomeTax {

	public static void main(String[] args) {
		Scanner tax= new Scanner(System.in);
		double income= tax.nextDouble();
		
		System.out.println("The income of the Person is="+income);
		
		if(income<=180000)
		{
			System.out.println("The Person need not pay the tax");
			double incometax=0;
			System.out.println("Income Tax is="+incometax);
		}
		else if(income>181001 && income<300000)
		{
			System.out.println("The person has to pay 10% tax");
			double incometax= income*0.1;
			System.out.println("Income Tax="+incometax);
		}
		else if(income>300001 && income<500000)
		{
			System.out.println("The person has to pay 20% tax");
			double incometax= income*0.2;
			System.out.println("Income Tax="+incometax);
		}
		else
		{
			if(income>500001 && income<1000000)
			{
				System.out.println("The person has to pay 30% tax");
				double incometax= income*0.3;
				System.out.println("Income Tax="+incometax);
			}
			else
			{
				System.out.println("Person's income exceeds the limit");
			}
		}

	}

}
