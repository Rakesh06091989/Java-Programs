package org.rakesh;

import java.io.Console;
import java.sql.*;
import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Preparestmnt {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/HibernateDB", "postgres", "oracle");
			PreparedStatement pr = conn.prepareStatement("insert into table user_address values(?,?,?,?)");
			Scanner in = new Scanner(System.in);
			Console cn = System.console();
			int id;
			String area;
			String city;
			String state;
			do
			{
				System.out.println("Enter the ID:");
				id = in.nextInt();
				System.out.println("Enter the area:");
				area = in.next();
				System.out.println("Enter the City:");
				city = in.next();
				System.out.println("Enter the State:");
				state = in.next();
				pr.setInt(1, id);
				pr.setString(2, area);
				pr.setString(3, city);
				pr.setString(4, state);
				int rs = pr.executeUpdate();
				System.out.println("Do you want to continue y/n");
				String s = in.nextLine();
				if(s.startsWith("n"))
				{
					break;
				}
				
			}while(true);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
