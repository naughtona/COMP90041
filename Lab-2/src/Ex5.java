/*
 * Programming and Software Development COMP90041
 * 
 * Author: 			Andrew Naughton
 * Purpose:			Lab 2 - Exercise 5
 * Last modified: 	18/03/2021
 */

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// Create scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// Request the amount of change to give over
		System.out.print("Please enter the change (without $): ");
		double change = keyboard.nextDouble();
		System.out.println();
		
		System.out.println("Please give the customer:\n");
		
		double[] denominations = {50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05};
		int i = 0, dlen = denominations.length;
		while ( i < dlen ) {
			int n = (int) (change / denominations[i]);
			
			if (i < 6)
				System.out.printf("$%-2.0f\t%d%n", denominations[i], n);
			else if (i < 9)
				System.out.printf("%.0fc\t%d%n", denominations[i] * 100, n);
			else
				System.out.printf("%1.0fc \t%d%n", denominations[i] * 100, n);
			
			change -= change >= 0.05 ? (n * denominations[i]) : 0; // ternary operator
			i++;
		}
		
		keyboard.close();
	}

}
