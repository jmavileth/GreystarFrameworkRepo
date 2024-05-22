package practice.datadriventesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteNonSelectQueryTest {
public static void main(String[] args) throws Throwable {
	Driver driverRef = new Driver();
	DriverManager.registerDriver(driverRef);
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
	Statement statement = connection.createStatement();
	int executeUpdate = statement.executeUpdate("insert into tablename values (10,'John')");
	//1 pass-0 fail
}
}
