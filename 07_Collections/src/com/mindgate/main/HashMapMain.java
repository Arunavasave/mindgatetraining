package com.mindgate.main;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
	public static void main(String[] args) {
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		employeeMap.put(101, "santosh");
		employeeMap.put(102, "Shubham");
		employeeMap.put(1, "Shashank");
		employeeMap.put(104, "Vaibhav");
		
		System.out.println(employeeMap);
		
	}

}
