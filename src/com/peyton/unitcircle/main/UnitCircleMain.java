package com.peyton.unitcircle.main;

public class UnitCircleMain {
	public static void main(String[] args){
		System.out.println("Welcome to the Unit Circle!");
		UnitCircleCalculator unc = new UnitCircleCalculator();
		System.out.println(Math.round(unc.getXValFromRadians(Math.toRadians(60))*10)/10);
	}
}
