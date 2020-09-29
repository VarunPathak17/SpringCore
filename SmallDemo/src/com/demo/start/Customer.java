package com.demo.start;

public class Customer {
	private int custId;
	private String custName;
	Address address;
	public Customer() {
	
	}
	public Customer(Address address) {
		this.address=address;
	}
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	//constructor using fields...
	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}
	//getter and setter methods...
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	@Override
	public String toString() {
		return "Customer :- \nid = " + custId + ", Name = " + custName + ", Address = " + address + "";
	}
	
}
