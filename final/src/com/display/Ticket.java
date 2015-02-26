package com.display;

public class Ticket {
	
	private String date1,name,email,department,summery,description,
					issueType,issueType2,category,impact,contactMethod,assigneName,
					status,statusupdate,resolution;
	private int ticket_id;
	

	

	public Ticket() {
		
	}




	public Ticket(String date1, String name, String email, String department,
			String summery, String description, String issueType,String issueType2,
			String category, String impact, String contactMethod,
			String assigneName, String status, String statusupdate,
			String resolution, int ticket_id) {
		super();
		this.date1 = date1;
		this.name = name;
		this.email = email;
		this.department = department;
		this.summery = summery;
		this.description = description;
		this.issueType = issueType;
		this.issueType2 = issueType2;
		this.category = category;
		this.impact = impact;
		this.contactMethod = contactMethod;
		this.assigneName = assigneName;
		this.status = status;
		this.statusupdate = statusupdate;
		this.resolution = resolution;
		this.ticket_id = ticket_id;
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




	public void setIssueType2(String issueType) {
		this.issueType = issueType;
	}
	
	public String getIssueType2() {
		return issueType2;
	}




	public void setIssueType(String issueType2) {
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




	public int getTicket_id() {
		return ticket_id;
	}




	public void seTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}

	
	
	
	
}
