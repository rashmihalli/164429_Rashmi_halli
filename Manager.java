package com.rashmi.ds;

import java.util.Scanner;

public class Manager extends Employee
{
	int salary = 20000;
	
	Scanner s1 = new Scanner(System.in);
	String performance = s1.next();
	
	int insentive;
	
	@Override
	
	public void bonus()
	{
		if(performance.equals("good"))
		{
			salary= salary + 1500;
			System.out.println("Salary= "+salary);
		}
		else if(performance.equals("better"))
		{
			salary = salary +2500;
			System.out.println("Salary= "+salary);
		}
		else if(performance.equals("best"))
		{
			salary = salary +3500;
			System.out.println("Salary= "+salary);
		}
	}
	

}
