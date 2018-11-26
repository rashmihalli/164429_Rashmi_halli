package com.rashmi.framework;

import java.util.*;

public class ProvingOrdered {

	public static void main(String[] args) {
		LinkedHashSet<String> days = new LinkedHashSet<String>();
		
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");
		
		System.out.println("They will be arranged in order");
		System.out.println(days);

	}

}
