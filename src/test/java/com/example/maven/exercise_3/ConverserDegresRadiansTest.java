package com.example.maven.exercise_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConverserDegresRadiansTest {
	ConversorDegresRadians cdr = new ConversorDegresRadians();

	//implement the conversion in another way
	// compare the results of the two implementations 
	
	public double degrees2radians (double valueInDegrees) {
		double radians = valueInDegrees * (Math.PI/180);
		return radians;
	}
	public double radians2degrees(double valueInRadians) {
		double degrees = valueInRadians *(180/ Math.PI);
		return degrees;
				
	}
	
	@Test
	public void testMethodDegresToRadians() {
		assertEquals(degrees2radians(3.8), cdr.convertDegresToRadians(3.8), 0.1);
	}
//det sista värdet 0.1 är en delta för att acceptera en skillnad i resultatet 
	@Test
	public void testMethodRadiansToDegress() {
		assertEquals(radians2degrees(3.8), cdr.convertRadiansToDegres(3.8), 0.1);
	}
}
