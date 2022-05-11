package aas;

import java.sql.Connection;
import java.sql.DriverManager;

public class scc {
	
	public static void main(String[] args) {
		
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","1234");
			System.out.println("sucess");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
	}
}
