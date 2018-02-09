package com.springcore.beans;

public class User {

	private String name;
	private String rights;
	private String userName;
	private double amount;
	
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getRights() {
		return rights;
	}
	public void setRights(String rights) {
		this.rights = rights;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public class Sample{
		
		private String innerName;

		public String getInnerName() {
			return innerName;
		}

		public void setInnerName(String innerName) {
			this.innerName = innerName;
		}
		
	}
}
