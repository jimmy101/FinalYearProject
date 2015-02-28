package com.stats;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.display.Ticket;
import com.opensymphony.xwork2.ActionSupport;

public class StatsAction extends ActionSupport{
	
	int count=0;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2868969998916295081L;
	
	private ArrayList<Ticket> ticketList;
	private ArrayList<ArrayList> intList;

	private ArrayList<Ticket> ticketList1;

	private ArrayList<Ticket> ticketList2;

	private ArrayList<Ticket> ticketList3;

	private ArrayList<Ticket> ticketList4;
	Integer count1 =0;
	public String execute() {
		String ret = ERROR;
		Connection conn1 = null;
		ticketList =  new ArrayList<Ticket>();
		ticketList1 =  new ArrayList<Ticket>();
		ticketList2 =  new ArrayList<Ticket>();
		ticketList3 =  new ArrayList<Ticket>();
		ticketList4 =  new ArrayList<Ticket>();
		intList = new ArrayList<ArrayList>();
		try {
			String URL = "jdbc:mysql://localhost/final";
			Class.forName("com.mysql.jdbc.Driver");
			conn1 = DriverManager.getConnection(URL, "root", "root");
			Statement st = conn1.createStatement(); 
			ResultSet rs = st.executeQuery("select * from ticket  ");
			
			
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
				
				if(ve.getIssueType2().equalsIgnoreCase("software")){
					ticketList1.add(ve);
					
					
				}
				if(ve.getIssueType2().equalsIgnoreCase("hardware")){
					ticketList2.add(ve);
					
				}
				if(ve.getDepartment().equalsIgnoreCase("legal")){
					ticketList3.add(ve);
				}
				if(ve.getDepartment().equalsIgnoreCase("sales dept")){
					ticketList3.add(ve);
				}
				if(ve.getAssigneName().equalsIgnoreCase("mary mooney")&& ve.getStatus().equalsIgnoreCase("open")){
					ticketList4.add(ve);
				}
				
				ticketList.add(ve);
				
				
				//intList.add(ticketList2);
				
				
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
		int size = ticketList.size();	
		System.out.println("Count =========== "+count1); 
		System.out.println("The size is "+size );
		int size2 = ticketList1.size();			
		System.out.println("The size is xx "+size2 );
		intList.add(ticketList1);
		intList.add(ticketList2);
		intList.add(ticketList3);
		intList.add(ticketList4);
		return ret;
	}


	


	public int getCount() {
		return count;
	}





	public void setCount(int count) {
		this.count = count;
	}





	public ArrayList<ArrayList> getIntList() {
		return intList;
	}





	public void setIntList(ArrayList<ArrayList> intList) {
		this.intList = intList;
	}





	public int getCount1() {
		return count1;
	}





	public void setCount1(int count1) {
		this.count1 = count1;
	}





	public ArrayList<Ticket> getTicketList3() {
		return ticketList3;
	}





	public void setTicketList3(ArrayList<Ticket> ticketList3) {
		this.ticketList3 = ticketList3;
	}





	public ArrayList<Ticket> getTicketList4() {
		return ticketList4;
	}





	public void setTicketList4(ArrayList<Ticket> ticketList4) {
		this.ticketList4 = ticketList4;
	}





	public ArrayList<Ticket> getTicketList2() {
		return ticketList2;
	}





	public void setTicketList2(ArrayList<Ticket> ticketList2) {
		this.ticketList2 = ticketList2;
	}





	public ArrayList<Ticket> getTicketList() {
		return ticketList;
	}

	public void setTicketList(ArrayList<Ticket> ticketList) {
		this.ticketList = ticketList;
	}
	
	public ArrayList<Ticket> getTicketList1() {
		return ticketList1;
	}

	public void setTicketList1(ArrayList<Ticket> ticketList1) {
		this.ticketList1 = ticketList1;
	}

	
}
