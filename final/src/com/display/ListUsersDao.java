package com.display;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class ListUsersDao extends ActionSupport{

	
	private static final long serialVersionUID = 1L;
	private ArrayList<User> list;

	public ListUsersDao() {

	}

	@Override
	public String execute() {
		String ret = ERROR;
		Connection conn = null;
		list =  new ArrayList<User>();

		try {
			String URL = "jdbc:mysql://localhost/final";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "root");
			Statement st = conn.createStatement(); 
			ResultSet rs = st.executeQuery("select * from user");
			
			User e = null;
			while (rs.next()) {
				e = new User();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setUserName(rs.getString(4));
				e.setPassword(rs.getString(5));
				list.add(e);
				
				ret = SUCCESS;
			}
		} catch (Exception e) {
			ret = ERROR;
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
				}
			}
		}
		return ret;
	}




	public ArrayList<User> getList() {
		return list;
	}

	public void setList(ArrayList<User> list) {
		this.list = list;
	}
}



