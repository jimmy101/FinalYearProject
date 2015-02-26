package com.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.display.Ticket;



public class UpdateTicket {
	private String date1,name,email,department,summery,description,
	issueType,issueType2,category,impact,contactMethod,assigneName,
	status,statusupdate,resolution;
private int ticket_id;
	
	

	

	public String execute() {
		
		
		Connection conn1 = null;
		

		try {
			String URL = "jdbc:mysql://localhost/final";
			Class.forName("com.mysql.jdbc.Driver");
			conn1 = DriverManager.getConnection(URL, "root", "root");
			 PreparedStatement ps=conn1.prepareStatement("update  ticket set email = ?,issueType=?,issueType2 = ?,category=?,"
			 		+ "assigneName = ?,status = ?,statusupdate = ?,resolution = ?  where ticket_id = ?");  
			 ps.setString(1,getEmail());
			 ps.setString(2,getIssueType());
			 ps.setString(3,getIssueType2());
			 ps.setString(4,getCategory());
			 ps.setString(5,getAssigneName());
			 ps.setString(6,getStatus());
			 ps.setString(7,getStatusupdate());
			 ps.setString(8,getResolution());
			 ps.setInt(9,getTicket_id());
				ps.executeUpdate();
			//Statement st = conn1.createStatement(); 
		   // st.executeQuery("DELETE  from ticket where ticket_id = 1");
//		    PreparedStatement ps=conn1.prepareStatement("update  ticket set email = ?,"
//		    		+ " issueType = ?,issueType2 = ?,category = ?,"
//		    		+ "impact = ?,contactMethod = ?,assigneName = ?,status = ?,statusupdate = ?,resolution = ?,"
//		    		+ " where ticket_id = ?");  		   
//		   
//			
//			ps.setString(1,getEmail());			
//			ps.setString(2,getIssueType());
//			ps.setString(3,getIssueType2());
//			ps.setString(4,getCategory());
//			ps.setString(5,getImpact());
//			ps.setString(6,getContactMethod());
//			ps.setString(7,getAssigneName());
//			ps.setString(8,getStatus());
//			ps.setString(9,getStatusupdate());
//			ps.setString(10,getResolution());
//			ps.setInt(11,getTicket_id());
//			ps.executeUpdate();
//			
				
				
			
		} catch (Exception e) {
			return  "error";
		} finally {
			if (conn1 != null) {
				try {
					conn1.close();
				} catch (Exception e) {
				}
			}
		}
	
		


		return "success";
	
	}

	private String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	private int getTicket_id() {
		// TODO Auto-generated method stub
		return ticket_id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}

	public String getDate1() {
		return date1;
	}

	public void setDate1(String date1) {
		this.date1 = date1;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSummery() {
		return summery;
	}

	public void setSummery(String summery) {
		this.summery = summery;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public String getIssueType2() {
		return issueType2;
	}

	public void setIssueType2(String issueType2) {
		this.issueType2 = issueType2;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImpact() {
		return impact;
	}

	public void setImpact(String impact) {
		this.impact = impact;
	}

	public String getContactMethod() {
		return contactMethod;
	}

	public void setContactMethod(String contactMethod) {
		this.contactMethod = contactMethod;
	}

	public String getAssigneName() {
		return assigneName;
	}

	public void setAssigneName(String assigneName) {
		this.assigneName = assigneName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusupdate() {
		return statusupdate;
	}

	public void setStatusupdate(String statusupdate) {
		this.statusupdate = statusupdate;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	
}




