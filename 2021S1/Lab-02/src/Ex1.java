/*
 * Programming and Software Development COMP90041
 * 
 * Author: 			Andrew Naughton
 * Purpose:			Lab 2 - Exercise 1
 * Last modified: 	12/03/2021
 */

import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float a = keyboard.nextFloat();
		float b = keyboard.nextFloat();
		
		// print sum
		System.out.println("Sum: " + (a+b));
		
		// print difference
		System.out.println("Difference: " + (b-a));
		
		// print product
		System.out.println("Product: " + (a*b));
		
		// close input stream
		keyboard.close();
	}

}
