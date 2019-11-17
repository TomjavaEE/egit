package com.T8073.entity;

import java.io.Serializable;

import java.sql.Date;


/**
 * The persistent class for the attence database table.
 * 
 */
public class Attence implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private Date chkDate;

	private String dept;

	private String empName;

	private String status;

	public Attence() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getChkDate() {
		return this.chkDate;
	}

	public void setChkDate(Date chkDate) {
		this.chkDate = chkDate;
	}

	public String getDept() {
		return this.dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}