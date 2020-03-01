package org.rakesh;

import java.sql.*;

public class DatabaseConn {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/HibernateDB", "postgres", "oracle");
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
			/*stmt.addBatch("insert into user_address values(1,'kusumba','thane','maharashtra')");
			stmt.addBatch("insert into user_address values(1,'Bakul','thane','maharashtra')");
			stmt.executeBatch();
			System.out.println("Number of row affected:"+result);
*/			
			ResultSet rs = stmt.executeQuery("select * from user_address");

			while(rs.next())
			{
				System.out.println("Value got from table:-"+rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4));
			}
			/*System.out.println("last row"+rs.last()+rs.getString(2));*/
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
