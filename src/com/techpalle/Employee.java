package com.techpalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Employee
{
	static Statement s=null;
	static Connection con=null;
	static PreparedStatement ps=null;
	public static String url="jdbc:mysql://localhost:3306/palle";
	public static String username="root";
	public static String password="Rajesh@123";
	public static ResultSet rs=null;
	
	 public static void create()
		{
			
			try 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				 con=DriverManager.getConnection(url,username,password);
				 s=con.createStatement();
				 s.executeUpdate("create table employee(eid int primary key auto_increment,"
					 		+ "ename varchar(80) not null,esal int )");
			}	
			catch (ClassNotFoundException e) 
			  {
				e.printStackTrace();
			  }
			catch (SQLException e) 
			  {
				e.printStackTrace();
			  }
			
			finally
			{
				try 
				{
					if(s !=null)
					{
					s.close();
					}
					if(con!=null)
					{
					con.close();
					}
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				
			}
	}		
	   public static void insert (String name,int sal)
	 {
		   try 
		   {
		   PreparedStatement ps=null;

			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(url,username,password);
			 ps=con.prepareStatement("insert into employee (ename,esal)values (?,?)");
			 ps.setString(1, name);
			 ps.setInt(2, sal);
			 
			 ps.executeUpdate();
		   }
		   catch (ClassNotFoundException e) 
			  {
				e.printStackTrace();
			  }
			catch (SQLException e) 
			  {
				e.printStackTrace();
			  }
			
			finally
			{
				try 
				{
					if(ps !=null)
					{
					ps.close();
					}
					if(con!=null)
					{
					con.close();
					}
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				
			}
		}
	   public static void update (int id,String name,int sal) 
	   {
          try
           {
	  		Class.forName("com.mysql.cj.jdbc.Driver");
	  		 con=DriverManager.getConnection(url,username,password);
	  		 ps=con.prepareStatement("update employee set ename=?,esal=? where eid=?");
	  		 ps.setString(1, name);
	  		 ps.setInt(2, sal);
	  		 ps.setInt(3, id);
	  		 
	  		 ps.executeUpdate();  
           } 
          catch (ClassNotFoundException e) 
		  {
			e.printStackTrace();
		  }
		catch (SQLException e) 
		  {
			e.printStackTrace();
		  }
		
		finally
		{
			try 
			{
				if(ps !=null)
				{
				ps.close();
				}
				if(con!=null)
				{
				con.close();
				}
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		}
	}
	   public static void delete (int id) 
	   {
		   try
		   {
	  		Class.forName("com.mysql.cj.jdbc.Driver");
	  		 con=DriverManager.getConnection(url,username,password);
	  		 ps=con.prepareStatement("delete from employee where eid=?");
	  		 ps.setInt(1, id);
	  		 
	  		 ps.executeUpdate();  
		   }
		   catch (ClassNotFoundException e) 
			  {
				e.printStackTrace();
			  }
			catch (SQLException e) 
			  {
				e.printStackTrace();
			  }
			
			finally
			{
				try 
				{
					if(ps !=null)
					{
					ps.close();
					}
					if(con!=null)
					{
					con.close();
					}
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				
			}
	}
	

	
}
