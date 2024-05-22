package practice.datadriventesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class SampleJDBCSelectQuerryTest {

	public static void main(String[] args) throws Throwable {
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from project");
		resultSet.next();
		/*
		 * resultSet.getString(1); //or while (resultSet.next()) {
		 * System.out.println(resultSet.getString(1)"+resultSet.getString(2)+");
		 * 
		 * }
		 */

		connection.close();
	}

}
