package com.display;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class ListTicket extends ActionSupport{

	
	private static final long serialVersionUID = 23;
	private ArrayList<Ticket> ticketList;

	public ListTicket() {

	}

	@Override
	public String execute() {
		String ret = ERROR;
		Connection conn1 = null;
		ticketList =  new ArrayList<Ticket>();

		try {
			String URL = "jdbc:mysql://localhost/final";
			Class.forName("com.mysql.jdbc.Driver");
			conn1 = DriverManager.getConnection(URL, "root", "root");
			Statement st = conn1.createStatement(); 
			ResultSet rs = st.executeQuery("select * from ticket where status != 'Closed' ");
			
			
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
				
				System.out.println(ve.getDate1());
				System.out.println(ve.getEmail());
				System.out.println(ve.getTicket_id());
				System.out.println(ve.getName());
				
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

}

