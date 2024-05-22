package com.greystar.crm.generic.databaseUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DatabaseUtility {
	Connection connection;

	public void getDBConnection(String url, String username, String password) throws Throwable {
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			connection = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			connection.close();
		}
	}

	public void closeDBConnection() throws Throwable {
try {
	connection.close();
} catch (Exception e) {
	// TODO: handle exception
}
		
	}

	public ResultSet executeSelectQuery(String query) throws Throwable {
		ResultSet result = null;
		try {
			Statement statement = connection.createStatement();
			result = statement.executeQuery(query);
		} catch (Exception e) {

		}

		return result;

	}
	
	public int executeNonSelectQuery(String query) throws Throwable {
		int result = 0;//executed fine then +1 or -1 else 0
		try {
			Statement statement = connection.createStatement();
			result = statement.executeUpdate(query);
		} catch (Exception e) {

		}

		return result;

	}
	
}
