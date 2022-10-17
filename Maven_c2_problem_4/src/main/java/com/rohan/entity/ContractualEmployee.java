package com.rohan.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@Entity	
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ContractualEmployee extends Employee{

	
	private int noOfWorkingDays;
	private int costofperday;
	private String mobilenumber;
	
	
	public ContractualEmployee() {
	
	}

	
	public ContractualEmployee( String name,int noOfWorkingDays, int costofperday, String mobilenumber) {
		super(name);
		this.noOfWorkingDays = noOfWorkingDays;
		this.costofperday = costofperday;
		this.mobilenumber = mobilenumber;
	}
	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}
	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}
	public int getCostofperday() {
		return costofperday;
	}
	public void setCostofperday(int costofperday) {
		this.costofperday = costofperday;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	@Override
	public String toString() {
		return "ContractualEmployee [noOfWorkingDays=" + noOfWorkingDays + ", costofperday=" + costofperday
				+ ", mobilenumber=" + mobilenumber + "]";
	}
	
	
	
	
}
