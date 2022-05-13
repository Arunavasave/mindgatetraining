package com.mindgate.main;

//import java.util.Scanner;

import com.mindgate.pojo.UserDetails;

public class UserDeatailsMain {
	public static void main(String[] args) {
		{
			System.out.println("Main Start");
			UserDetails deatailsMain = new UserDetails();
			deatailsMain.acceptUserDeatails();
			deatailsMain.dislplyDetails();
			System.out.println("Main end");
			try {
				Class.forName("com.mindgate.pojo.UserDetails");
				
			} catch (Exception e) {
				System.out.println("Exception Handle");
				e.printStackTrace();
			}
			
		}
	}

}
