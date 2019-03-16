package com.cg.VehicleInsurance.service;

import java.util.Date;

import com.cg.VehicleInsurance.bean.Vehicle;

public interface VehicleService {
    Vehicle insertDetails(Vehicle vehicle,Date date);
    Vehicle insuranceValidityCheck(Vehicle vehicle,Date date);
}
