package com.cg.VehicleInsurance.UI;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.cg.VehicleInsurance.bean.Vehicle;
import com.cg.VehicleInsurance.service.VehicleService;
import com.cg.VehicleInsurance.service.VehicleServiceImpl;

public class VehicleInsurance {
	static VehicleService vehicleService=new VehicleServiceImpl();
	static Vehicle vehicle=new Vehicle();
	static  Date date=new Date();
	static SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	Calendar cal = Calendar.getInstance();
    date=cal.getTime();
	
	//SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy");
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("====Vehicle Insurance Application====");
    	System.out.println("1.vehicle Insurance Registration\n2.Insurance validity check\n3.Exit");
    	int n=sc.nextInt();
    	switch(n) {
    	case 1:
    		    System.out.println("enter the details");
    		    
    		    System.out.println("enter Vehicle number");
    		    String vehicleNo=sc.next();
    		   // vehicle.setVehicleNo(vehicleNo);
    		    
    		    System.out.println("enter vehicle type");
    		    int vehicleType=sc.nextInt();
    		    vehicle.setVehicleType(vehicleType);
    		    
    		    System.out.println("insurance period in years");
    		    int insurancePeriod=sc.nextInt();
    		    vehicle.setInsurancePeriod(insurancePeriod);
    		    
    		    System.out.println("enter aadhar card number");
    		    String aadharCard=sc.next();
    		    vehicle.setAadharCard(aadharCard);
    		    
    		    System.out.println("enter mobile number");
    		    long mobileNo=sc.nextLong();
    		    vehicle.setMobileNo(mobileNo);
    		    
    		   
    		    vehicleService.insertDetails(vehicle,date);
    	case 2:
    	     System.out.println("insurance validation");
    	     
    	     vehicleService.insuranceValidityCheck(vehicle,date);
    	case 3:
    		System.exit(0);
    	}
    }
}
