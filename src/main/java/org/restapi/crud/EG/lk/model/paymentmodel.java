package org.restapi.crud.EG.lk.model;

public class paymentmodel {
	
	private int paymentid;
	private int customerid;
	private String paymentType;
	private int date;
	private int amount;
	
public paymentmodel() {
		
	}
	
	public paymentmodel(int paymentid, int customerid, String paymentType, int date, int amount) {
		super();
		this.paymentid = paymentid;
		this.customerid = customerid;
		this.paymentType = paymentType;
		this.date = date;
		this.amount = amount;
	}



	public int getPaymentid() {
		return paymentid;
	}



	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}



	public int getCustomerid() {
		return customerid;
	}



	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}



	public String getPaymentType() {
		return paymentType;
	}



	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}



	public int getDate() {
		return date;
	}



	public void setDate(int date) {
		this.date = date;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	
	

}
