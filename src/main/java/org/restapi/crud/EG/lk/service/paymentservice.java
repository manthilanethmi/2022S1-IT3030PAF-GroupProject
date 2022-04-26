package org.restapi.crud.EG.lk.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.restapi.crud.EG.lk.model.paymentmodel;


public class paymentservice {
	
	Connection con;
	
	public  paymentservice() {
		try {
			
			String url = "jdbc:mysql://localhost:3306/users";
			String uname = "root";
			String pwd = "";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,uname,pwd);
			
			}catch(Exception e){
			System.out.println(e +"Data insert unsuccessful!");	
		}
	}
		
		public paymentmodel insertUser(paymentmodel user) {
			String insert= "insert into payment(customer_Id,paymentType,date,amount) values(?,?,?,?)";
			
			try {
				PreparedStatement ps = con.prepareStatement(insert);
				ps.setInt(1, user.getCustomerid());
				ps.setString(2, user.getPaymentType());
				ps.setLong(3, user.getDate());
				ps.setLong(4, user.getAmount());
				
				ps.execute();
				
			}catch(Exception e) {
				System.out.println(e +"Data insert unsuccessful!");
			}
			return user;
		}
	
		
		public ArrayList<paymentmodel> getUser() throws SQLException{
			
			ArrayList<paymentmodel> data = new ArrayList<paymentmodel>();
			
			String select = "select * from payment";
			PreparedStatement ps = con.prepareStatement(select);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				paymentmodel model = new paymentmodel();
				model.setPaymentid(rs.getInt("payment_Id"));
				model.setCustomerid(rs.getInt("customer_Id"));
			    model.setPaymentType(rs.getString("paymentType"));
				model.setDate(rs.getInt("date"));
				model.setAmount(rs.getInt("amount"));
				
				data.add(model);
				
			}
			
			return data;
		}
		
public ArrayList<paymentmodel> getUserById (int payment_Id) throws SQLException{
			
			ArrayList<paymentmodel> data = new ArrayList<paymentmodel>();
			
			String select = "select * from payment where payment_Id";
			PreparedStatement ps = con.prepareStatement(select);
			ps.setInt(1,payment_Id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				paymentmodel model = new paymentmodel();
				model.setPaymentid(rs.getInt("payment_Id"));
				model.setCustomerid(rs.getInt("customer_Id"));
			    model.setPaymentType(rs.getString("paymentType"));
				model.setDate(rs.getInt("date"));
				model.setAmount(rs.getInt("amount"));
				
				data.add(model);
				
			}
			
			return data;
		}
		
		
	
	public paymentmodel updateUser(paymentmodel user) {
		String insert= "update payment set customer_Id=? , payment_Type=? , date=? , amount=? where payment_Id=?";
		
		try {
			PreparedStatement ps = con.prepareStatement(insert);
			ps.setInt(1, user.getCustomerid());
			ps.setString(2, user.getPaymentType());
			ps.setLong(3, user.getDate());
			ps.setLong(4, user.getAmount());
			
			
			ps.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e +"Data insert unsuccessful!");
		}
		return user;
	}

	public int deleteUser(int payment_Id) {
		String insert= "delete from payment where payment_Id=?";
		
		try {
			PreparedStatement ps = con.prepareStatement(insert);
			ps.setInt(1,payment_Id);
			
			ps.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e +"Data insert unsuccessful!");
		}
		return payment_Id;
	}
//	public paymentmodel insertUser(paymentmodel user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	

}
