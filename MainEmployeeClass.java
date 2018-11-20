package com.rashmi.ds;

public class MainEmployeeClass 
{

	public static void main(String[] args) 
	{
		Employee e1 = new Manager();
		e1.bonus();
		Employee e2 = new Labour();
		e2.bonus();
	}

}
