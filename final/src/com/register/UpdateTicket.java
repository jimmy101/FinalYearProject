package com.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.display.Ticket;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateTicket extends ActionSupport{
	
	private static final long serialVersionUID = -8812248255619807744L;
	
	private String date1,name,email,department,summery,description,
	issueType,issueType2,category,impact,contactMethod,assigneName,
	status,statusupdate,resolution;
	
	
	

	private ArrayList<Ticket> ticketList;
	
	
	@Override
	public String execute() {
		String ret = ERROR;
		Connection conn1 = null;
		ticketList =  new ArrayList<Ticket>();

		try {
			String URL = "jdbc:mysql://localhost/final";
			Class.forName("com.mysql.jdbc.Driver");
			conn1 = DriverManager.getConnection(URL, "root", "root");
			
			PreparedStatement ps=conn1.prepareStatement("DELETE * from ticket where ticket_id =1)");
			
			//ps.setInt(1,getTicket_id());
//			ps.setString(2,getDate1());  
//			ps.setString(3,getName());
//			ps.setString(4,getEmail());
//			ps.setString(5,getDepartment());
//			ps.setString(6,getSummery());
//			ps.setString(7,getDescription());
//			ps.setString(8,getIssueType());
//			ps.setString(9,getIssueType2());
//			ps.setString(10,getCategory());
//			ps.setString(11,getImpact());
//			ps.setString(12,getContactMethod());
//			ps.setString(13,getAssigneName());
//			ps.setString(14,getStatus());
//			ps.setString(15,getStatusupdate());
//			ps.setString(16,getResolution());
//			ps.executeUpdate();
			
			
			ps.executeUpdate();
			
			
			
			
				
				
				
				ret = SUCCESS;
			
		} catch (Exception e) {
			ret = ERROR;
		} finally {
			if (conn1 != null) {
				try {
					conn1.close();
				} catch (Exception e) {
				}
			}
		}
	
		return ret;
	}


	


	private int getTicket_id() {
		// TODO Auto-generated method stub
		return 0;
	}





	public String getDate1() {
		return date1;
	}





	public void setDate1(String date1) {
		this.date1 = date1;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
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
	
	public String getIssueType21() {
		return issueType2;
	}





	public void setIssueType21(String issuetype2) {
		this.issueType2 = issuetype2;
	}





	public String getCategory() {
		return category;
	}

	public String getIssueType2() {
		return issueType2;
	}

	public void setIssueType2(String issueType2) {
		this.issueType2 = issueType2;
	}





	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}

	private int ticket_id;



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





	public static long getSerialversionuid() {
		return serialVersionUID;
	}





	public ArrayList<Ticket> getTicketList() {
		return ticketList;
	}

	public void setTicketList(ArrayList<Ticket> ticketList) {
		this.ticketList = ticketList;
	}

}




