package com.cg.VehicleInsurance.bean;

public class Vehicle {
   
    private int vehicleType;
    private double insurancePeriod;
    private String aadharCard;
    private long mobileNo;
	/*public String getVehicleNo() {
		return vehicleNo;
	}*/
	
	public Vehicle(int vehicleType2, double d, String aadharCard2, long mobileNo2) {
		// TODO Auto-generated constructor stub
	}

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public int getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(int vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public double getInsurancePeriod() {
		return insurancePeriod;
	}

	public void setInsurancePeriod(double insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}

	public String getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	    
}
