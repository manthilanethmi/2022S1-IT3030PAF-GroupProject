package org.restapi.crud.EG.lk.model;

public class customermodel {
	private int id;
	private String accno;
	private String address;
	private String bankaccno;
	private String email;
	private String nIC;
	private String name;
	private String phone;
	private String password;
	
	public customermodel() {

	}
	
	public customermodel(int id, String accno, String address, String bankaccno, String email, String nIC, String name,
			String phone, String password) {
		super();
		this.id = id;
		this.accno = accno;
		this.address = address;
		this.bankaccno = bankaccno;
		this.email = email;
		this.nIC = nIC;
		this.name = name;
		this.phone = phone;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccno() {
		return accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBankaccno() {
		return bankaccno;
	}

	public void setBankaccno(String bankaccno) {
		this.bankaccno = bankaccno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getnIC() {
		return nIC;
	}

	public void setnIC(String nIC) {
		this.nIC = nIC;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
