package com.forgotUsername;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.display.User;
import com.opensymphony.xwork2.ActionSupport;

public class ForgotRegisterDao extends ActionSupport{
	
	private String email,userName,password;
	private Connection con;

	

	public String execute() {
		String ret = ERROR;
		Connection conn = null;
		Statement stmt = null;
		try {
			String URL = "jdbc:mysql://localhost/final";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "root");
			 stmt = conn.createStatement(); 
			 String name =getUserName();
			 String  email =getEmail();
			String pass=getPassword();
			//System.out.println(getEmail());
			String sql = "UPDATE user SET userName = ?, password = ?  WHERE email = ?";
	  //   stmt.executeUpdate(sql);
	      PreparedStatement ps=conn.prepareStatement(sql);  

			ps.setString(1,getUserName());
			ps.setString(3,getEmail());
			ps.setString(2,getPassword());
			
			         
			int status=ps.executeUpdate();  
				
				ret = SUCCESS;
			
		} catch (Exception e) {
			ret = ERROR;
		} finally {
			if (conn != null) {
				
					try {
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
		return ret;
				}
			}
		return ret;
		}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	}

			
		


