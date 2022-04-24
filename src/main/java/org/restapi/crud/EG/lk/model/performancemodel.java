package org.restapi.crud.EG.lk.model;

public class performancemodel {

	private int year;
	private long manufacamnt;
	private long conamnt;
	private long storedamnt;
	private double totsales;
	private double totcost;
	private double totprofit;
	private long avggen;
	private long avgcon;
	
	public performancemodel() {
		
	}
	
	public performancemodel( int year, long manufacamnt, long conamnt, long storedamnt, double totsales,
			double totcost, double totprofit, long avggen, long avgcon) {
		super();
		this.year = year;
		this.manufacamnt = manufacamnt;
		this.conamnt = conamnt;
		this.storedamnt = storedamnt;
		this.totsales = totsales;
		this.totcost = totcost;
		this.totprofit = totprofit;
		this.avggen = avggen;
		this.avgcon = avgcon;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public long getManufacamnt() {
		return manufacamnt;
	}

	public void setManufacamnt(long manufacamnt) {
		this.manufacamnt = manufacamnt;
	}

	public long getConamnt() {
		return conamnt;
	}

	public void setConamnt(long conamnt) {
		this.conamnt = conamnt;
	}

	public long getStoredamnt() {
		return storedamnt;
	}

	public void setStoredamnt(long storedamnt) {
		this.storedamnt = storedamnt;
	}

	public double getTotsales() {
		return totsales;
	}

	public void setTotsales(double totsales) {
		this.totsales = totsales;
	}

	public double getTotcost() {
		return totcost;
	}

	public void setTotcost(double totcost) {
		this.totcost = totcost;
	}

	public double getTotprofit() {
		return totprofit;
	}

	public void setTotprofit(double totprofit) {
		this.totprofit = totprofit;
	}

	public long getAvggen() {
		return avggen;
	}

	public void setAvggen(long avggen) {
		this.avggen = avggen;
	}

	public long getAvgcon() {
		return avgcon;
	}

	public void setAvgcon(long avgcon) {
		this.avgcon = avgcon;
	}	
	
}
