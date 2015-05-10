package com.peyton.unitcircle.main;

public class UnitCircleCalculator {
	private double pi= 3.14;
	public UnitCircleCalculator(){
		
	}
	
	public double getXValFromRadians(double radians){
		return Math.cos(radians);
	}
	
	public double getYValFromRadians(double radians){
		return Math.sin(radians);
	}
}
