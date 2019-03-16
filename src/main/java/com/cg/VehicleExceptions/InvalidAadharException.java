package com.cg.VehicleExceptions;

public class InvalidAadharException extends Exception{
      public void InvalidAadharException() {
    	  System.out.println("aadhar card number must not exceed 12 digits");
      }
}
