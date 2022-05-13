package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCRUDmain {
	public static void main(String[] args) {
		// to strore variale
		String ulr = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String passward = "mindgate123";
		String driver = "oracle.jdbc.driver.OracleDriver";
		int resultCount = 0;
		String sqlQuery = "";
		Connection connection;
		// Statement statement;
		PreparedStatement preparedStatement;
		ResultSet resultSet;

//		System.out.println("Select Example");
//		
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(ulr, user, passward);
//			statement = connection.createStatement();
//			sqlQuery = "select * from employee_details";
//			 resultSet= statement.executeQuery(sqlQuery);
//			 
//			while (resultSet.next()) {
//				System.out.println(resultSet.getInt("employee_id"));
//				System.out.println(resultSet.getString("name"));
//				System.out.println(resultSet.getDouble("salary"));
//				System.out.println("-".repeat(50));
//			}
//			connection.close();
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}

		System.out.println("Delete Example");
		
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(ulr, user, passward);
			sqlQuery = "delete employee_details where employee_id =?";
			preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setInt(1, 21);
			resultCount = preparedStatement.executeUpdate();
			connection.close();
			if(resultCount > 0) {
				System.out.println("deleted successfully");
			}
			else {
				System.out.println("failed to delete");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}
		
//		System.out.println("Update Example");
//
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(ulr, user, passward);
//			sqlQuery = "UPDATE employee_details SET name = ?, salary = ? where employee_id = ?";
//			preparedStatement = connection.prepareStatement(sqlQuery);
//
//			preparedStatement.setString(1, "Panakaj");
//			preparedStatement.setDouble(2, 88888);
//			preparedStatement.setInt(3, 21);
//			resultCount = preparedStatement.executeUpdate();
//			connection.close();
//			if (resultCount > 0) {
//				System.out.println("updated successfilly");
//			} else {
//				System.out.println("updated failed");
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}

//		System.out.println("insert Example");
//		
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(ulr, user, passward);
//			sqlQuery = "INSERT INTO employee_details(name , salary) VALUES (?,?)";
//			preparedStatement = connection.prepareStatement(sqlQuery);
//			preparedStatement.setString(1,"Ramesh vasave");
//			preparedStatement.setDouble(2, 421445);
//			resultCount = preparedStatement.executeUpdate();
//			connection.close();
//			if(resultCount > 0)
//			{
//				System.out.println("Record Added successfully");
//			}
//			else {
//				System.out.println("failed to Added");
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}
	}

}
