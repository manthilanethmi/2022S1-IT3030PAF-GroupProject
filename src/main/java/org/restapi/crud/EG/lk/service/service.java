package org.restapi.crud.EG.lk.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.restapi.crud.EG.lk.model.model;

public class service {
	
	Connection con;
	
	
	public service() {
		
		try {
			String url =String.format("jdbc://localhost:3306/users");
			String uname="root";
			String pwd = "";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,uname,pwd);
			
		}catch(Exception e) {
			System.out.println(e + "data onsert unsuccess");
		}
	}
	
	public model insertUser(model user) {
		
		String insert= "insert into employee(name,nic,email,age,phone,type,address,gender) values(?,?,?,?,?,?,?,?)";
		
		
		try {
			PreparedStatement ps =con.prepareStatement(insert);
			ps.setString(1,user.getName());
			ps.setString(2,user.getNic());
			ps.setString(3,user.getEmail());
			ps.setLong(4,user.getAge());
			ps.setLong(5,user.getPhone());
			ps.setString(6,user.getType());
			ps.setString(7,user.getAddress());
			ps.setString(8,user.getGender());
			
			ps.execute();
			
		}catch(Exception e){
			System.out.println(e + "data insert unsuccess");
		}
		return user;
	
	}
	
	
public ArrayList<model> getUser() throws SQLException {
		
		ArrayList<model> data= new ArrayList<model>();
		
		String select= "select * from employee";
		PreparedStatement ps = con.prepareStatement(select);
		ResultSet rs =ps.executeQuery();
		

		while(rs.next()) {
			model model = new model();
			
			model.setName(rs.getString("name"));// coloumn name
			model.setNic(rs.getString("nic"));
			model.setEmail(rs.getNString("email"));
			model.setAge(rs.getInt("age"));
			model.setPhone(rs.getInt("phone"));
			model.setType(rs.getNString("type"));
			model.setAddress(rs.getNString("address"));
			model.setGender(rs.getNString("gender"));
			
			data.add(model);
		}
		return data;		
}


public ArrayList<model> getUserById(int id) throws SQLException {
	
	ArrayList<model> data= new ArrayList<model>();			
	String select= "select * from employee where id =?";
	PreparedStatement ps = con.prepareStatement(select);
	ps.setInt(1, id);
	ResultSet rs =ps.executeQuery();
	
	while(rs.next()) {
		model model = new model();
		
		model.setName(rs.getString("name"));// coloumn name
		model.setNic(rs.getString("nic"));
		model.setEmail(rs.getNString("email"));
		model.setAge(rs.getInt("age"));
		model.setPhone(rs.getInt("phone"));
		model.setType(rs.getNString("type"));
		model.setAddress(rs.getNString("address"));
		model.setGender(rs.getNString("gender"));
		data.add(model);						
	}
return data;
}

public model updateUser(model user) {
	String insert= "update employee set name=?, nic=?, email=?, age=?, phone=?, type=?, address=?, gender=? where id=?";
	
	try {
		PreparedStatement ps =con.prepareStatement(insert);
		
		ps.setString(1,user.getName());
		ps.setString(2,user.getNic());
		ps.setString(3,user.getEmail());
		ps.setLong(4,user.getAge());
		ps.setLong(5,user.getPhone());
		ps.setString(6,user.getType());
		ps.setString(7,user.getAddress());
		ps.setString(8,user.getGender());
		ps.setInt(9,user.getId());
		
		ps.executeUpdate();
		
	}catch(Exception e){
		System.out.println(e + "data insert unsuccess");
	}
	return user;
}


public int deleteUser(int id) {
	String insert= "delete from employee where id=?";
	
	try {
		PreparedStatement ps =con.prepareStatement(insert);
		ps.setInt(1, id);
	
		ps.executeUpdate();
		
	}catch(Exception e){
		System.out.println(e + "data insert unsuccess");
	}
	return id;
}

}
