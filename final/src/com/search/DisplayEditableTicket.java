package com.search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.display.Ticket;
import com.opensymphony.xwork2.ActionSupport;

public class DisplayEditableTicket extends ActionSupport{

	
	private static final long serialVersionUID = 443;
	private ArrayList<Ticket> ticketList;
	private Ticket ticket;
	private int ticket_id;

	

	public DisplayEditableTicket() {

	}

	@Override
	public String execute() {
		String ret = ERROR;
		Connection conn1 = null;
		ticketList =  new ArrayList<Ticket>();
		ticket = new Ticket();

		try {
			 Class.forName("com.mysql.jdbc.Driver");
	         conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/final","root", "root");
			
			  PreparedStatement ps = conn1.prepareStatement("select * FROM ticket WHERE ticket_id = ? ");
		       ps.setInt(1,getTicket_id());		       
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
				ve.setIssueType2(rs.getString(9));
				ve.setCategory(rs.getString(10));
				ve.setImpact(rs.getString(11));
				ve.setContactMethod(rs.getString(12));
				ve.setAssigneName(rs.getString(13));
				ve.setStatus(rs.getString(14));
				ve.setStatusupdate(rs.getString(15));
				ve.setResolution(rs.getString(16));
				
				System.out.println(ve.getTicket_id());
				System.out.println(ve.getDate1());
				System.out.println(ve.getName());
				System.out.println(ve.getEmail());
				System.out.println(ve.getDepartment());
				System.out.println(ve.getSummery());
				System.out.println(ve.getDescription());
				System.out.println(ve.getIssueType());
				System.out.println(ve.getIssueType2());
				System.out.println(ve.getCategory());
				System.out.println(ve.getImpact());
				System.out.println(ve.getContactMethod());
				System.out.println(ve.getAssigneName());
				System.out.println(ve.getStatus());
				System.out.println(ve.getStatusupdate());
				System.out.println(ve.getResolution());
				
				
				
				ticketList.add(ve);
				
				
				
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





	public ArrayList<Ticket> getTicketList() {
		return ticketList;
	}

	public void setTicketList(ArrayList<Ticket> ticketList) {
		this.ticketList = ticketList;
	}
	
	public int getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}

}



