package com.register;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class RegisterDao {
	
	public static int save(RegisterAction r){  
		int status = 0;  
		try {  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/final","root","root"); 
		
		
		  
		PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?,?)");  
		ps.setInt(1,r.getId());
		ps.setString(2,r.getName());  
		ps.setString(3,r.getEmail());
		ps.setString(4,r.getUserName());
		ps.setString(5,r.getPassword());
		
		         
		status=ps.executeUpdate();  
		  
		} catch(Exception e){e.printStackTrace();
		}  
		    return status;  
		}  
} 

