package org.restapi.crud.EG.lk.model;

public class model {
	
	private int id;
	private String name;
	private String nic;
	private String email;
	private int age;
	private int phone;
	private String type;
	private String address;
	private String gender;
	
	
	
	public model() {
		
		
	}



	public model(int id, String name, String nic, String email, int age, int phone, String type, String address,
			String gender) {
		super();
		this.id = id;
		this.name = name;
		this.nic = nic;
		this.email = email;
		this.age = age;
		this.phone = phone;
		this.type = type;
		this.address = address;
		this.gender = gender;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getNic() {
		return nic;
	}



	public void setNic(String nic) {
		this.nic = nic;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getPhone() {
		return phone;
	}



	public void setPhone(int phone) {
		this.phone = phone;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
			
	
	
	
	

}


