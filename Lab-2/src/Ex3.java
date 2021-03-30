/*
 * Programming and Software Development COMP90041
 * 
 * Author: 			Andrew Naughton
 * Purpose:			Lab 2 - Exercise 3
 * Last modified: 	12/03/2021
 */

public class Ex3 {

	public static void main(String[] args) {
		int hours = Integer.parseInt(args[0]);
		
		double standardRate = 8.25, overtimeScaler = 1.5, standardHours, overtimeHours, total;
		
		if (hours <= 40) {
			standardHours = hours;
			overtimeHours = 0;
		} else {
			standardHours = 40;
			overtimeHours = hours - standardHours;
		}
		
		double overtimeRate = standardRate * overtimeScaler;
		total = (standardHours * standardRate) + (overtimeHours * overtimeRate);
		
		System.out.printf("Given you worked for %d hours, your wages total $%.2f.", hours, total);
	}
	
}
