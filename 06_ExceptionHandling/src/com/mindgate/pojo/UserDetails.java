package com.mindgate.pojo;

import java.util.Scanner;

public class UserDetails {
	private String userId;
	private String nama;
	private int age;
	Scanner scanner = new Scanner(System.in);

	public void acceptUserDeatails() {
		//unchecked excaption
		try {
			System.out.println("Enter User Id");
			userId = scanner.next();
			System.err.println("Enter Name");
			nama = scanner.next();
			System.out.println("Enter Age");
			age = scanner.nextInt();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Invalid input");
			System.out.println("please enter valid imput");
		}
		finally {
			System.out.println("Details Accepted");
			scanner.close();
		}

	}

	public void dislplyDetails() {
		System.out.println(userId);
		System.out.println(nama);
		System.out.println(age);
		

	}

}
