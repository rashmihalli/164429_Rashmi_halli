package com.rashmi.bank;//collection of logical classes.class is the collection of methods

public class BankAccount {
	
	//static variables.It is one copy which will be shared between the objects.
	private static int autoAccountNo;
	
	
	//instance variable/class variable can not be accessed unless objects are not created.
	private int accountNo;
	private String accountHolderName;
	private double accountBalance;
	
	
	//init block, this will be invoked and executed before constructor.
	{
		accountNo=++autoAccountNo;
	}
	
	
	//This is a default constructor. It is the concept of constructor overloading(offering variety of option)
	//These are constructors. Initiation of class variables. why? At the time of object creation it  
	//will be called automatically.
	//After the object creation these can be changed.
	public BankAccount()
	{
		                                //Initializing member variable.
		accountHolderName="unknow";
		accountBalance=0;
	}
	
	
	//parameterize constructor
	//Information is demanded well before the object is created.
	public BankAccount(String accountHolderName,double accountBalance)
	{
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
	}
	
	
	
	//setter method- this is re-initializing or modifying existing member variables.
	
	public void setAccountHolderName(String accountHolderName) 
	{
		this.accountHolderName = accountHolderName;
	}
    
	//Getter methods
	public int getAccountNo() 
	{
	    return accountNo;
    }
    
	public double getAccountBalance() 
	{
		return accountBalance;
	}
	
	public String getAccountHolderName() 
	{
		return accountHolderName;
	}

	//Service methods
	public void withdraw(double amount)
	{
		if(amount<0 || amount==0)
		{
			System.out.println("invalid");
		}
		else if(accountBalance-amount<1000)
		{
			System.out.println("invalid");
		}
		else{
			this.accountBalance-=amount;
			System.out.println("balance after with drawing"+" " + accountBalance);
		}
		
	}
	
	public void deposit(double amount)
	{
		if(amount<0 || amount==0)
		{
			System.out.println("you have entered a invalid amount");
		}
		else
		{	
		this.accountBalance+=amount;
		System.out.println("total balance after deposition" +" " +accountBalance);
		}
	}
	
	public static void main(String[] args) {
		//BankAccount acc = new BankAccount();
		
				BankAccount acc2 = new BankAccount("5656", 1500);
				acc2.withdraw(500);
				acc2.deposit(500);
	}
}
