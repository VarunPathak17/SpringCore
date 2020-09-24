package com.spring.customer.Data;

public class CustomerData {
	private int custID;
	private String custName;
	
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	@Override
	public String toString() {
		return "CustomerData [ID is = " + custID + ", Name is = " + custName + "]";
	}
	

}
