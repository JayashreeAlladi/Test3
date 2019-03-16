package com.cg.VehicleInsurance.service;

import java.util.Date;

import com.cg.VehicleExceptions.InvalidAadharException;
import com.cg.VehicleExceptions.NoVehicleException;
import com.cg.VehicleInsurance.bean.Vehicle;
import com.cg.VehicleInsurance.dao.VehicleDao;
import com.cg.VehicleInsurance.dao.VehicleDaoImpl;

public class VehicleServiceImpl implements VehicleService{
     VehicleDao vehicleDao=new VehicleDaoImpl();
     static  Date date=new Date();
	public Vehicle insertDetails(Vehicle vehicle,Date date) {
		// TODO Auto-generated method stub
		vehicle=vehicleDao.insertDetails(vehicle,date);
		if(vehicle.getAadharCard().length()>12) {
			try {
				throw new InvalidAadharException();
			} catch (InvalidAadharException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return vehicle;
	}

	public Vehicle insuranceValidityCheck(Vehicle vehicle,Date date) {
		// TODO Auto-generated method stub
		if(vehicle==null) {
			try {
				throw new NoVehicleException();
			} catch (NoVehicleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return vehicleDao.insuranceValidityCheck(vehicle,date);
	}

}
