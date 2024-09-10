package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {

	Connection connection;
	Statement statement;
	ResultSet resultSet;
	String columnValue;

	public String getDataFromDb(String columnName) {

		try {
			// set properties for mysql

			Class.forName("com.mysql.cj.jdbc.Driver");
			// url="jdbc:mysql:// + hostName: + portNumber/ + databaseName"

			String sqlUrl = "jdbc:mysql://44.195.13.80:3306/february_2024";
			String sqlUsername = "student";
			String sqlPassword = "Student@123";
			String sqlQuery = "Select * from login_data";

			// create a connection to Db
			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);

			// Empower connection reference variable to execute queries

			statement = connection.createStatement();
			// Execute query
			resultSet = statement.executeQuery(sqlQuery);
			while (resultSet.next()) {
				columnValue = resultSet.getString(columnName);

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("ClassNotFoundException" + e.getMessage());
		} catch (SQLException e) {
			e.printStackTrace();

			System.out.println("SQLException" + e.getMessage());
		} finally {

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

		}

		return columnValue;

	}
}
