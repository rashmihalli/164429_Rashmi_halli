package com.rashmi.ds;

public class BubbleSort {
	public static void main(String[] args) 
	{
		BubbleSort bubbleSort=new BubbleSort();
		int array[]={5,12,14,6,78,19,1,23,26,35,37,52,86,7};
		bubbleSort.sorting(array);

		System.out.println("sorted array");
		bubbleSort.printBubble(array);
	}

	void sorting(int array[])
	{
	int n=array.length;
	for(int i=0;i<n-1;i++)
	{
		for(int j=0;j<n-i-1;j++)
		{
			if(array[j]>array[j+1])
			{
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
		}
	}
	}
	void printBubble(int array[])
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+"  ");
		}
		

	}
	
}