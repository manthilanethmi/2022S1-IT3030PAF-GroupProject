package org.restapi.crud.EG.lk.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.restapi.crud.EG.lk.model.customermodel;

public class customerservice {
	
	Connection con;

	public customerservice(){
		
		try {
			String url =String.format("jdbc:mysql://localhost:3306/users");
			String uname ="root";
			String pwd = "";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,uname,pwd);	
			
		} catch(Exception e) {
			System.out.println(e +"data insert unsuccess.");
		}
		
	}
	
	public customermodel insertUser(customermodel user) {
		String insert = "insert into person(cusAccountNo,cusAddress,cusBankAccNo,cusEmail,cusNIC,cusName,cusPhone,cusPassword) values(?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, user.getAccno());
			ps.setString(2, user.getAddress());
			ps.setString(3, user.getBankaccno());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getnIC());
			ps.setString(6, user.getName());
			ps.setString(7, user.getPhone());
			ps.setString(8, user.getPassword());
			
			ps.execute();		
		}catch(Exception e) {
			System.out.println(e +"data insert unsuccess.");
		}
		
		return user;
	}
	
	public ArrayList<customermodel> getUser() throws SQLException{
		
		ArrayList<customermodel> data = new ArrayList<customermodel>();
		String select = "select * from person";
		PreparedStatement ps = con.prepareStatement(select);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			customermodel model = new customermodel();
			
			model.setAccno(rs.getString("cusAccountNo"));//column name is given here
			model.setAddress(rs.getString("cusAddress"));
			model.setBankaccno(rs.getString("cusBankAccNo"));
			model.setEmail(rs.getString("cusEmail"));
			model.setnIC(rs.getString("cusNIC"));
			model.setName(rs.getString("cusName")); 
			model.setPhone(rs.getString("cusPhone"));
			model.setPassword(rs.getString("cusPassword"));
			
			data.add(model);
			
		}
		
		return data;
	}
	
     public ArrayList<customermodel> getUserById(int id) throws SQLException{
		
		ArrayList<customermodel> data = new ArrayList<customermodel>();
		String select = "select * from person where cusID =?";
		PreparedStatement ps = con.prepareStatement(select);
		ps.setInt(1,id);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			customermodel model = new customermodel();
			
			model.setAccno(rs.getString("cusAccountNo")); //column name is given here
			model.setAddress(rs.getString("cusAddress"));
			model.setBankaccno(rs.getString("cusBankAccNo"));
			model.setEmail(rs.getString("cusEmail"));
			model.setnIC(rs.getString("cusNIC"));
			model.setName(rs.getString("cusName")); 
			model.setPhone(rs.getString("cusPhone"));
			model.setPassword(rs.getString("cusPassword"));
			
			data.add(model);
			
		}
		
		return data;
	}
     
 	public customermodel updateUser(customermodel user) {
		String insert = "update person set cusAccountNo= ?,cusAddress= ?,cusBankAccNo= ?,cusEmail= ?,"
				+ "cusNIC= ?,cusName= ?,cusPhone= ?,cusPassword= ? where cusID =?";
		
		try {
			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, user.getAccno());
			ps.setString(2, user.getAddress());
			ps.setString(3, user.getBankaccno());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getnIC());
			ps.setString(6, user.getName());
			ps.setString(7, user.getPhone());
			ps.setString(8, user.getPassword());
			ps.setInt(9, user.getId());
			
			ps.executeUpdate();		
		}catch(Exception e) {
			System.out.println(e +"data insert unsuccess.");
		}
		
		return user;
	}
 	
 	public int deleteUser(int id) {
		String insert = "delete from person where cusID =?";
		
		try {
			PreparedStatement ps = con.prepareStatement(insert);
			ps.setInt(1, id);
			
			ps.executeUpdate();		
		}catch(Exception e) {
			System.out.println(e +"data insert unsuccess.");
		}
		
		return id;
	}
 	
 	
}
