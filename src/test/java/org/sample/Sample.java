package org.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sample {
public static void main(String[] args) throws  SQLException, ClassNotFoundException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "Logan@97");
	String query ="select * from employees";
	PreparedStatement ps = connection.prepareStatement(query);
	ResultSet executeQuery = ps.executeQuery();
	while (executeQuery.next()) {
		int int1 = executeQuery.getInt("employee_Id");
		System.out.println("employee id :"+ int1);
		String string = executeQuery.getString("first_name");
		System.out.println("employee name :"+ string);
	}
	connection.close();
}
}
