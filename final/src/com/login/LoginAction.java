package com.login;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.config.Configuration;

public class LoginAction extends ActionSupport {

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String user;
   private String password;
   private String name;
   private String userName;

 

public String execute() {
      String ret = ERROR;
      Connection conn = null;

      try {
        
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/final","root", "root");
        
         
         PreparedStatement ps = conn.prepareStatement("SELECT name FROM user WHERE userName = ? AND password = ?");
         ps.setString(1, userName);
         ps.setString(2, password);
         ResultSet rs = ps.executeQuery();

         while (rs.next()) {
            name = rs.getString(1);
            if(name.equalsIgnoreCase("Frank Doyle")){
            	return  "success1";
            }else
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

   public String getUser() {
      return user;
   }

   public void setUser(String user) {
      this.user = user;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
   
   public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
