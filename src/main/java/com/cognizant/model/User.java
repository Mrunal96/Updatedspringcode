package com.cognizant.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int cognizantemployeeid;
	private String employeename;
	private int dukeenergylanid;
	private int dukeenergyemployeeid;
	private int projectid;
	private String projectname;
	private String offshoremanagername;
	private String onsitemanagername;
	private String status;
	private Date dateonboarded;
	private Date dateoffboarded;
	private long phonenumber;
	private String onsiteoffshore;
	private String location;
	
	public User() {
		
	}

	public User(int cognizantemployeeid, String employeename, int dukeenergylanid, int dukeenergyemployeeid,
			int projectid, String projectname, String offshoremanagername, String onsitemanagername, String status,
			Date dateonboarded, Date dateoffboarded, long phonenumber, String onsiteoffshore, String location) {
		super();
		this.cognizantemployeeid = cognizantemployeeid;
		this.employeename = employeename;
		this.dukeenergylanid = dukeenergylanid;
		this.dukeenergyemployeeid = dukeenergyemployeeid;
		this.projectid = projectid;
		this.projectname = projectname;
		this.offshoremanagername = offshoremanagername;
		this.onsitemanagername = onsitemanagername;
		this.status = status;
		this.dateonboarded = dateonboarded;
		this.dateoffboarded = dateoffboarded;
		this.phonenumber = phonenumber;
		this.onsiteoffshore = onsiteoffshore;
		this.location = location;
	}

	public int getCognizantemployeeid() {
		return cognizantemployeeid;
	}

	public void setCognizantemployeeid(int cognizantemployeeid) {
		this.cognizantemployeeid = cognizantemployeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public int getDukeenergylanid() {
		return dukeenergylanid;
	}

	public void setDukeenergylanid(int dukeenergylanid) {
		this.dukeenergylanid = dukeenergylanid;
	}

	public int getDukeenergyemployeeid() {
		return dukeenergyemployeeid;
	}

	public void setDukeenergyemployeeid(int dukeenergyemployeeid) {
		this.dukeenergyemployeeid = dukeenergyemployeeid;
	}

	public int getProjectid() {
		return projectid;
	}

	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getOffshoremanagername() {
		return offshoremanagername;
	}

	public void setOffshoremanagername(String offshoremanagername) {
		this.offshoremanagername = offshoremanagername;
	}

	public String getOnsitemanagername() {
		return onsitemanagername;
	}

	public void setOnsitemanagername(String onsitemanagername) {
		this.onsitemanagername = onsitemanagername;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateonboarded() {
		return dateonboarded;
	}

	public void setDateonboarded(Date dateonboarded) {
		this.dateonboarded = dateonboarded;
	}

	public Date getDateoffboarded() {
		return dateoffboarded;
	}

	public void setDateoffboarded(Date dateoffboarded) {
		this.dateoffboarded = dateoffboarded;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getOnsiteoffshore() {
		return onsiteoffshore;
	}

	public void setOnsiteoffshore(String onsiteoffshore) {
		this.onsiteoffshore = onsiteoffshore;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}