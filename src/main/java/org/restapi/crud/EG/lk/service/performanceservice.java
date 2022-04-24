package org.restapi.crud.EG.lk.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.restapi.crud.EG.lk.model.performancemodel;

public class performanceservice {
	
	Connection con;

	public performanceservice(){
		
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
	
	public performancemodel insertPerform(performancemodel perform1) {
		String insert = "insert into performance(Year,manufAmnt,consAmnt,storedAmnt,totSales,totCost,totProfit,avgGen,avgCons) values(?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(insert);
			ps.setInt(1, perform1.getYear());
			ps.setLong(2, perform1.getManufacamnt());
			ps.setLong(3, perform1.getConamnt());
			ps.setLong(4, perform1.getStoredamnt());
			ps.setDouble(5, perform1.getTotsales());
			ps.setDouble(6, perform1.getTotcost());
			ps.setDouble(7, perform1.getTotprofit());
			ps.setLong(8, perform1.getAvggen());
			ps.setLong(9, perform1.getAvgcon());
			
			ps.execute();		
		}catch(Exception e) {
			System.out.println(e +"data insert unsuccess.");
		}
		
		return perform1;
	}
	
    public ArrayList<performancemodel> getPerform() throws SQLException{
		
		ArrayList<performancemodel> data = new ArrayList<performancemodel>();
		String select = "select * from performance";
		PreparedStatement ps = con.prepareStatement(select);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			performancemodel model = new performancemodel();
			
			model.setYear(rs.getInt("Year"));//column name is given here
			model.setManufacamnt(rs.getLong("manufAmnt"));
			model.setConamnt(rs.getLong("consAmnt"));
			model.setStoredamnt(rs.getLong("storedAmnt"));
			model.setTotsales(rs.getDouble("totSales"));
			model.setTotcost(rs.getDouble("totCost")); 
			model.setTotprofit(rs.getDouble("totProfit"));
			model.setAvggen(rs.getLong("avgGen"));
			model.setAvgcon(rs.getLong("avgCons"));
			
			data.add(model);
			
		}
		
		return data;
	}
    
   public ArrayList<performancemodel> getPerformById(int year) throws SQLException{
		
		ArrayList<performancemodel> data = new ArrayList<performancemodel>();
		String select = "select * from performance where Year =?";
		PreparedStatement ps = con.prepareStatement(select);
		ps.setInt(1,year);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			performancemodel model = new performancemodel();
			
			model.setYear(rs.getInt("Year"));//column name is given here
			model.setManufacamnt(rs.getLong("manufAmnt"));
			model.setConamnt(rs.getLong("consAmnt"));
			model.setStoredamnt(rs.getLong("storedAmnt"));
			model.setTotsales(rs.getDouble("totSales"));
			model.setTotcost(rs.getDouble("totCost")); 
			model.setTotprofit(rs.getDouble("totProfit"));
			model.setAvggen(rs.getLong("avgGen"));
			model.setAvgcon(rs.getLong("avgCons"));
			
			data.add(model);
			
		}
		
		return data;
	}
   
   public performancemodel updatePerform(performancemodel perform1) {
		String insert = "update performance set manufAmnt= ?,consAmnt= ?,storedAmnt= ?,totSales= ?,"
				+ "totCost= ?,totProfit= ?,avgGen= ?,avgCons= ? where Year =?";
		
		try {
			PreparedStatement ps = con.prepareStatement(insert);
			ps.setLong(1, perform1.getManufacamnt());
			ps.setLong(2, perform1.getConamnt());
			ps.setLong(3, perform1.getStoredamnt());
			ps.setDouble(4, perform1.getTotsales());
			ps.setDouble(5, perform1.getTotcost());
			ps.setDouble(6, perform1.getTotprofit());
			ps.setLong(7, perform1.getAvggen());
			ps.setLong(8, perform1.getAvgcon());
			ps.setInt(9, perform1.getYear());
			
			ps.executeUpdate();		
		}catch(Exception e) {
			System.out.println(e +"data insert unsuccess.");
		}
		
		return perform1;
	}
   
	public int deletePerform(int year) {
		String insert = "delete from performance where Year =?";
		
		try {
			PreparedStatement ps = con.prepareStatement(insert);
			ps.setInt(1, year);
			
			ps.executeUpdate();		
		}catch(Exception e) {
			System.out.println(e +"data insert unsuccess.");
		}
		
		return year;
	}
}