package com.cg.VehicleInsurance.dao;

import java.util.Date;

import com.cg.VehicleInsurance.bean.Vehicle;

public interface VehicleDao {
	  Vehicle insertDetails(Vehicle vehicle,Date date);
	  Vehicle insuranceValidityCheck(Vehicle vehicle,Date date);
}
