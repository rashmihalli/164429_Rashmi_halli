package com.rashmi.framework;

import java.util.*;

public class ProvingUnordered {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Monday");
		set.add("Tuesday");
		set.add("Wednesday");
		set.add("Thursday");
		set.add("Friday");
		set.add("Saturday");
		set.add("Sunday");
		
		System.out.println("They will not be arranged in order");
		System.out.println(set);

	}

}
