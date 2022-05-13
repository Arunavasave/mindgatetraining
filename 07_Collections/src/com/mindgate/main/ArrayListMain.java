package com.mindgate.main;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.ArrayListDemo;
import com.mindgate.pojo.Emplyee;

public class ArrayListMain {
	public static void main(String[] args) {
//to create object
		ArrayListDemo arrayListDemo = new ArrayListDemo();
		// make list
		List<String> nameList = new ArrayList<String>();

		nameList.add("Aruna");
		nameList.add("Rohini");
		nameList.add("Priya");
		arrayListDemo.setArrayListId(101);

		arrayListDemo.setNameList(nameList);
		System.out.println(arrayListDemo);
		
		System.out.println("-".repeat(50));
		
		//List<Interger> numberList = new ArrayList<Interger>();
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(101);
		numberList.add(102);
		numberList.add(103);
		System.out.println(numberList);
		
		System.out.println("-".repeat(50));
		
		Emplyee emplyee = new Emplyee(11, "Aruna", 24);
		Emplyee emplyee1 = new Emplyee(12, "Aruna", 25);
		Emplyee emplyee2 = new Emplyee(13, "Aruna", 26);
		Emplyee emplyee3 = new Emplyee(15, "Aruna", 27);
		
		List<Emplyee> emplyees = new ArrayList<Emplyee>();
		emplyees.add(emplyee);
		emplyees.add(emplyee1);
		emplyees.add(emplyee2);
		emplyees.add(emplyee3);
		
		for (Emplyee emplyee4 : emplyees) {
			System.out.println(emplyee4);
		}
		
	}

}
