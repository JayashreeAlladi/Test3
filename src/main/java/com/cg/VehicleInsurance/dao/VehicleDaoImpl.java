package com.cg.VehicleInsurance.dao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Vector;

import com.cg.VehicleInsurance.bean.Vehicle;

public class VehicleDaoImpl implements VehicleDao{
   Vehicle vehicle=new Vehicle();
   Map<Integer,Object> InsuranceEntry;
   int vehicleNo=1;
	public Vehicle insertDetails(Vehicle vehicle,Date date) {
		// TODO Auto-generated method stub
		
		if(vehicle.getVehicleType()>1) {
		InsuranceEntry.put(vehicleNo, new Vehicle(vehicle.getVehicleType(),vehicle.getInsurancePeriod(),vehicle.getAadharCard(),vehicle.getMobileNo()));
		vehicleNo++;
		}
	
		return vehicle;
	}

	public Vehicle insuranceValidityCheck(Vehicle vehicle,Date date) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	    if(InsuranceEntry.containsKey(vehicleNo)) {
	    	if(vehicle.getInsurancePeriod()>0) {
	    		 if(vehicle.getInsurancePeriod()==1) {
	    			 double insp=vehicle.getInsurancePeriod();
	    			 System.out.println("Current Date: "+sdf.format(cal.getTime()));
	    			 cal.add(Calendar.DAY_OF_YEAR,365 );  
	    			System.out.println("your insurance expires in:"+cal);
	    		 }
	    	}
	    
	    }
		return null;
	}

}
