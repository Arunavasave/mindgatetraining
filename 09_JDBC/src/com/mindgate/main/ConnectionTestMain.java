package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTestMain {
	public static void main(String[] args) {
		System.out.println("main start");
		// step no 1. loading the driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//connection interface
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "mindgate123");
			System.out.println("Connection success");
			//close connection
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("failed to load driver");
			System.out.println(e.getMessage());
		}
		System.out.println("main end");
	}

}
