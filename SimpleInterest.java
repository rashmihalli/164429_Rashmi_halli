package com.rashmi.ds;
import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner SI= new Scanner(System.in);
		float p= SI.nextFloat();
		float t= SI.nextFloat();
		float r= SI.nextFloat();
		float n= SI.nextFloat();
		
		System.out.println("principle="+p);
		System.out.println("Time="+t);
		System.out.println("rate="+r);
		System.out.println("number of times the interest is compounded"+n);
		
		System.out.println("Simple Interest for the given values is:");
		
		float simpleinterest=(p*t*r)/100;
		
		System.out.println(simpleinterest);
		
		float compoundinterest= (float) (p*(Math.pow((1 + r / 100), t))); ;
		
		System.out.println("compond interest is:"+compoundinterest);

	}

}
