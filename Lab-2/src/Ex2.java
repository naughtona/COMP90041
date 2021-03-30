/*
 * Programming and Software Development COMP90041
 * 
 * Author: 			Andrew Naughton
 * Purpose:			Lab 2 - Exercise 2
 * Last modified: 	12/03/2021
 */

import java.util.Scanner;
import java.lang.Math;

public class Ex2 {
	
	public static void main(String[] args) {
		// create Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		int r = keyboard.nextInt();
		double pi = Math.PI;
		
		// calculate and print volume
		double volume = (4/3) * pi * Math.pow(r, 3);
		System.out.println("Volume = " + volume);
		
		// calculate and print surface area
		double surfaceArea = 4 * pi * Math.pow(r, 2);
		System.out.println("Surface Area = " + surfaceArea);
		
		// close input stream
		keyboard.close();
	}

}
