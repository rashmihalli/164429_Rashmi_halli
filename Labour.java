package com.rashmi.ds;

import java.util.Scanner;

public class Labour extends Employee 
{
	int salary = 15000;
	
	Scanner s2 = new Scanner(System.in);
	int overtime = s2.nextInt();

	@Override
	public void bonus() 
	{
		if(overtime == 1)
		{
			salary = salary+1500;
			System.out.println("Salary= "+salary);
		}
		else if(overtime == 2)
		{
			salary = salary+2800;
			System.out.println("Salary= "+salary);
		}
		else if(overtime == 3)
		{
			salary = salary+3500;
			System.out.println("Salary= "+salary);
		}
		
	}

}
