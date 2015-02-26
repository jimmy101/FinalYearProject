package com.search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.display.Ticket;
import com.opensymphony.xwork2.ActionSupport;

public class SearchTicket extends ActionSupport{
	
	private static final long serialVersionUID = -8092894851888305141L;
	private String name,email,department,date1,assigneName,issueType,ticket_id;
	
	private ArrayList<Ticket> ticketList;
	
	public SearchTicket(){
		
	}
	
	

	public String execute() {
		String ret = ERROR;
		Connection conn1 = null;
		ticketList =  new ArrayList<Ticket>();

		try {
			String URL = "jdbc:mysql://localhost/final";
			Class.forName("com.mysql.jdbc.Driver");
			conn1 = DriverManager.getConnection(URL, "root", "root");
			//Statement st = conn1.createStatement(); 
			//ResultSet rs = st.executeQuery("select * from ticket where status != 'Closed' ");
			//ResultSet rs = st.executeQuery("select id,name from ticket ");
			 String sql = "SELECT * FROM ticket WHERE";
	         sql+=" name = ? or email = ? or department = ? or date1 = ? or assigneName = ? or issueType = ? or ticket_id = ?" ;
	         PreparedStatement ps = conn1.prepareStatement(sql);
	         ps.setString(1, name);
	         ps.setString(2, email);
	         ps.setString(3, department);
	         ps.setString(4, date1);
	         ps.setString(5, assigneName);
	         ps.setString(6, issueType);
	         ps.setString(7, ticket_id);
	         
	         ResultSet rs = ps.executeQuery();
			
			Ticket ve = null;
			while (rs.next()) {
				ve = new Ticket();
				ve.seTicket_id(rs.getInt(1));
				ve.setDate1(rs.getString(2));
				ve.setName(rs.getString(3));
				ve.setEmail(rs.getString(4));
				ve.setDepartment(rs.getString(5));
				ve.setSummery(rs.getString(6));
				ve.setDescription(rs.getString(7));
				ve.setIssueType(rs.getString(8));
				ve.setCategory(rs.getString(9));
				ve.setImpact(rs.getString(10));
				ve.setContactMethod(rs.getString(11));
				ve.setAssigneName(rs.getString(12));
				ve.setStatus(rs.getString(13));
				ve.setStatusupdate(rs.getString(14));
				ve.setResolution(rs.getString(15));
				
				ticketList.add(ve);
				
				System.out.println("zzzzzzzzzzzzzzzzzz"+ve.getDate1());
				System.out.println("zzzzzzzzzzzzzzzzzz"+ve.getEmail());
				System.out.println("zzzzzzzzzzzzzzzzzz"+ve.getTicket_id());
				System.out.println("zzzzzzzzzzzzzzzzzz"+ve.getName());
				
				ret = SUCCESS;
			}
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





	public String getTicket_id() {
		return ticket_id;
	}



	public void setTicket_id(String ticket_id) {
		this.ticket_id = ticket_id;
	}



	public ArrayList<Ticket> getTicketList() {
		return ticketList;
	}

	public void setTicketList(ArrayList<Ticket> ticketList) {
		this.ticketList = ticketList;
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
	
	public String getDate1() {
		return date1;
	}



	public String getIssueType() {
		return issueType;
	}



	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}



	public void setDate1(String date1) {
		this.date1 = date1;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getAssigneName() {
		return assigneName;
	}



	public void setAssigneName(String assigneName) {
		this.assigneName = assigneName;
	}


}



