package com.mindgate.main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Emplyee;

public class HashSetMain {
	public static void main(String[] args) {
		{
			Set<String> nameSet = new HashSet<String>();
			nameSet.add("Aruna");
			nameSet.add("rohini");
			nameSet.add("nitesh");
			nameSet.add("karan");
			nameSet.add("Aruna");
			
			System.out.println(nameSet);
			System.out.println("-".repeat(50));
			
			Emplyee emplyee = new Emplyee(101, "Aruna", 200);
			System.out.println(emplyee.hashCode());
			
			Emplyee emplyee1 = new Emplyee(102, "Rohini", 300);
			System.out.println(emplyee1.hashCode());
			
			Emplyee emplyee2 = new Emplyee(103, "rohit", 100);
			System.out.println(emplyee2.hashCode());
			
			Emplyee emplyee3 = new Emplyee(101, "Aruna", 200);
			System.out.println(emplyee3.hashCode());
			
			Set<Emplyee> emplyeeSet = new HashSet<Emplyee>();
			
			emplyeeSet.add(emplyee);
			emplyeeSet.add(emplyee1);
			emplyeeSet.add(emplyee2);
			emplyeeSet.add(emplyee3);
			//when we used Integer object then hashcode same like interger values
			Integer i = new Integer(10);
			System.out.println(i);
			
			String s = new String("hii");
			System.out.println(s.hashCode());
			
			s = s + "hello";
			System.out.println(s.hashCode());
			
			
			
			//System.out.println(i);
			for (Emplyee emplyee4 : emplyeeSet) {
				System.out.println(emplyee4);
				
			}
			
			
			
		}
	}

}
